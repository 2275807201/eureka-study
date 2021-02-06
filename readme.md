## 启动eureka集群
```
java -jar eureka-server.jar --spring.profiles.active=server1
java -jar eureka-server.jar --spring.profiles.active=server2
java -jar eureka-server.jar --spring.profiles.active=server3
```

## 启动应用
- 启动账单应用 eureka-client-pay
- 启动订单应用 eureka-client-order

## 请求账单详情
```
curl --location --request GET 'localhost:18080/bill/get' \
--header 'Content-Type: application/json' \
-d '{
    "billNo":"123"
}'
```

## 请求订单详情
```
curl --location --request POST 'localhost:18081/order/get' \
--header 'Content-Type: application/json' \
-d '{
    "orderNo":"123"
}'
```

参考文档：https://blog.csdn.net/qq_33594101/article/details/80422876