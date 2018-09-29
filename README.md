# rk-delicacy-receipe-app-endpoint
Responsive Web App using the latest and standard tech with E2E solution using Angular 6, Spring Boot, MongoDB etc

## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Gradle 3+](https://gradle.org/install/)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the class from your IDE.

```shell
cd rk-delicacy-receipe-app-endpoint
./gradlew bootRun
```
## Access

```
http://localhost:8080/api/recipes/all
```
JSON Response

```json
[{
"id": "5ba5219b1c9d440000b1dc5a",
"name": "Cake Piece",
"date": "2018-12-25T23:00:00.000+0000",
"image": "https://cdn.pixabay.com/photo/2017/01/11/11/33/cake-1971556__340.jpg",
"instructions": "Stir cucumber into laughing cow cheese spread on tortillas, layer with turkey slices and roll up...perfect lunch from Rachael Ray",
"ingredients": [
"1 tortilla shell",
"1 wedge cream cheese spread, such as Laughing Cow",
"1/2 cucumber ; chopped",
"3 oz turkey deli slices"
],
"dishes": 10,
"country": "Belgium",
"veg": true
}, {}, {} etc]
```

```
http://localhost:8080/api/recipes/Netherlands
```
```json
You would get only one respective to the param passed
```
Swagger

```json
http://localhost:8080/swagger-ui.html#/
```

Some of the architectural, design consideration considered and furture consideration are as follows,

* Spring MVC
* MongoDB NoSQL document based DB
* Gradle as its faster than Maven, with much more feasible features
* Swagger implementations
* Spring Boot Actuator for Health, Traffic, Monitoring the app
* Microservice design

To be in future:

* Spring Cloud (As with more microservices, dev and monitoring would be feasible )
* Redis ( For cache managment as instead of api call would serve the request from cache which improves performance)
* Docker (For containerisation and quick deploy with minimal infra)
* Continous Intergration and Deployment using Jenkins and Nexus etc 
* AWS for scaling the infra and prod deployment etc
