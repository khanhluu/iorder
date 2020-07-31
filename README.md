# Getting Started

### Introduction
iOrder service expose APIs (HATEOAS) for read/save resources such as Order, OrderDetail and Shipment. Swagger-ui is rendered at runtime to make it easier to call APIs.


### Guides
Building jar file by maven
```sh
$ mvn clean install
```
Starting eOrder instance with "dev" profile
```sh
$ cd target
...
$ java -jar icom-order-{version}.jar --spring.profiles.active=dev
```
Access eDiscovery by http://localhost:8003/swagger-ui.html

### Noted CURL
-Create Order
```sh
curl -X POST "http://localhost:8003/api/order" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"deliveryDate\": \"2020-07-28\", \"status\": \"Init\", \"userId\": \"customer_id\"}"
```
-Create OrderDetail for an order
```sh
curl -X POST "http://localhost:8003/api/orderDetail" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"order\": \"http://localhost:8003/api/order/orderId\", \"price\": 700, \"productId\": \"product_Id\", \"productName\": \"product_name\"}

```