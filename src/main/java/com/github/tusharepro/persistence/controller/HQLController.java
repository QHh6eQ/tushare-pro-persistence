package com.github.tusharepro.persistence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/")
public class HQLController {

    @Autowired private EntityManager entityManager;

    public static class HQL {
        private String hql;
        private Boolean singleResult;
        private Integer firstResult;
        private Integer maxResults;

        public String getHql() {
            return hql;
        }

        public HQL setHql(String hql) {
            this.hql = hql;
            return this;
        }

        public Boolean getSingleResult() {
            return singleResult;
        }

        public HQL setSingleResult(Boolean singleResult) {
            this.singleResult = singleResult;
            return this;
        }

        public Integer getFirstResult() {
            return firstResult;
        }

        public HQL setFirstResult(Integer firstResult) {
            this.firstResult = firstResult;
            return this;
        }

        public Integer getMaxResults() {
            return maxResults;
        }

        public HQL setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
    }

    @PostMapping("/hql")
    public Object hql(@RequestBody List<HQL> hqlList) {
        final ExecutorService executor = Executors.newCachedThreadPool();

        final List<?> list = hqlList.stream().map(hql -> CompletableFuture.supplyAsync(() -> {
            final Query query = entityManager.createQuery(hql.hql);

            if (hql.maxResults != null) query.setMaxResults(hql.maxResults);
            if (hql.firstResult != null) query.setFirstResult(hql.firstResult);

            return hql.singleResult != null && hql.singleResult ? query.getSingleResult() : query.getResultList();
        }, executor)).map(x -> {
            try {
                return x.get(20, TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                throw new RuntimeException();
            }
        }).collect(Collectors.toList());

        return list.size() == 1 ? list.get(0) : list;
    }

}
