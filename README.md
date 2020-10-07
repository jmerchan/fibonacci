# fibonacci project

## Getting started

### Dockerize the microservice
With this method we don't need anymore the Dockerfile.
First of all we must create the image with the following command,
this will create a small image, named 'fibonacci', with the latest patches.
```
mvn spring-boot:build-image
```
And we can run the image with the command (remove -it to execute in background)
```
docker run -it -p8080:8080 fibonacci:0.0.1-SNAPSHOT (The TAG, 0.0.1-SNAPSHOT, depends from the command before)
```
We can push the image to Docker repository executing (no mandatory)
```
docker push fibonacci:0.0.1-SNAPSHOT (The TAG, 0.0.1-SNAPSHOT, depends from the command before)
```

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
To execute the test you can execute, this will execute integration, acceptance and unit test
```
mvn test / mvn verify
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
