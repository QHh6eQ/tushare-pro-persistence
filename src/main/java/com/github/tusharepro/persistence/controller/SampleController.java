package com.github.tusharepro.persistence.controller;

import com.github.tusharepro.core.TushareProService;
import com.github.tusharepro.core.bean.StockBasic;
import com.github.tusharepro.core.entity.StockBasicEntity;
import com.github.tusharepro.core.http.Request;
import com.github.tusharepro.persistence.repository.StockBasicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/sample")
public class SampleController {

    @Autowired private StockBasicRepository stockBasicRepository;

    @PostMapping("/insert")
    public String insert() throws IOException {
        for (final String value : new String[]{"L", "D", "P"}) {
            final List<StockBasicEntity> stockBasicEntities = TushareProService.stockBasic(new Request<StockBasicEntity>() {}
                    .allFields()
                    .param(StockBasic.Params.list_status.value(value)));

            stockBasicRepository.saveAll(stockBasicEntities);
        }
        return "OK";
    }

    @GetMapping("/select")
    public Object select() {
        return stockBasicRepository.findAll();
    }


}
