Tushare Pro Persistence
- 一个TusharePro持久化demo
- 使用[SDK](https://github.com/qhh6eq/tushare-pro-java-sdk)自带的Entity做实体类

# 环境需求
- Java 8
- PostgreSQL 10

# JPA
- 提供Repository方便CRUD
```java
@Autowired private StockBasicRepository stockBasicRepository;
```
save...
```java
for (final String value : new String[]{"L", "D", "P"}) {
    stockBasicRepository.saveAll(TushareProService.stockBasic(new Request<StockBasicEntity>() {}
            .allFields()
            .param(StockBasic.Params.list_status.value(value))));
}
```
find...
```java
stockBasicRepository.findAll();
```
- 详细见SampleController.java

# HQL
- 提供HQL接口方便其他语言使用
- [HQL中文文档](http://docs.jboss.org/hibernate/core/3.5/reference/zh-CN/html/queryhql.html)
- POST http://127.0.0.1:8090/api/hql
- request:
```json
[{
  "hql": "string hql语句",
  "singleResult": "boolean 返回对象是否是单个 默认false",
  "maxResults": "int 最大数量 默认null",
  "firstResult": "int 起始 默认null"
}]
```
- response:
如果有多条HQL就返回查询结果数组[{object}], 否则为查询结果{object}

## 一个JavaScript例子
```javascript
const code = '000002.SZ';

API.HQL(HQL("FROM StockBasicEntity"))
    .then(response => console.info(response.data));

API.HQL([HQL("FROM StockBasicEntity WHERE tsCode = '" + code + "'", true),
            HQL("FROM StockCompanyEntity WHERE tsCode = '" + code + "'", true)])
    .then(response => {
        console.info(response.data[0]);  // StockBasic
        console.info(response.data[1]);  // StockCompany
    });
```
- 详细见hql.html