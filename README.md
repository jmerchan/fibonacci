# fibonacci project

## Getting started

### Starting the microservice

This is a spring boot with maven to start type in root package:
```
mvn spring-boot:run
```
Or you can execute too
```
mvn clean install
java -jar target/fibonacci-0.0.1-SNAPSHOT.jar
```
The microservice started will expose an end-point
```
http://localhost:8080/v1/fibonacci/calculate/{number}
```
To test it you can execute in your preferred browser
```
http://localhost:8080/v1/fibonacci/calculate/10
```
The result should be
```
{"result":55}
```
