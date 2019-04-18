# SpringCloud
自己根据教程搭建的spring cloud 框架，使用版本为spring cloud Greenwich.SR1，spring boot 2.1.3.RELEASE。
集成组件：Eureka 服务注册中心，spring cloud config，ribbon，hystrix，turbine，zipkin，gateway
其中config使用的是数据库存储形式，hystrix和zipkin都使用rabbitmq收集数据
注意：当应用都启动后需要手动在rabbitmq中把hystrixStreamOutput和turbineStreamInput关联起来，才能收集hystrix数据
感谢程序猿DD的教程 GitHub地址：https://github.com/dyc87112/SpringCloud-Learning
