const HOST = "127.0.0.1";
const PORT = "8090";
const API_V1 = "http://" + HOST + ":" + PORT + "/api";

const HQL = (hql, singleResult = false, maxResults = null, firstResult = null) => {
    return {
        hql: hql,
        singleResult: singleResult,
        maxResults: maxResults,
        firstResult: firstResult
    };
};

const API = {
    HQL: hql => axios.post(API_V1 + "/hql", hql instanceof Array ? hql : Array(hql))
};