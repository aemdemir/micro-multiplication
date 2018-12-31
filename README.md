# micro-multiplication

A sample microservices application written in Java using Spring Boot in order to experience Microservice Architecture. The system is composed of 5 microservices: three of them are functional microservices (multiplication, gamification, ui); and two of them are supporting microservices (gateway, service-registry).

- Follows the **TDD** approach
- Implements service discovery with **Eureka**, load balancing with **Ribbon**, api gateway with **Zuul**
- Implements Circuit Breakers with **Hystrix**
- Uses **RabbitMQ** as an event bus
- Uses **Jetty** as a web server

Following the book on [Amazon](https://www.amazon.com/Learn-Microservices-Spring-Boot-Practical/dp/1484231643)