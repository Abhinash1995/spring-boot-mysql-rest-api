# spring-boot-mysql-rest-api
Building a Restful CRUD API using Spring Boot, Mysql, JPA and Hibernate 

Spring Boot, MySQL, JPA, Hibernate Rest API Tutorial
Build Restful CRUD API for a simple Note-Taking application using Spring Boot, Mysql, JPA and Hibernate.

Requirements
Java - 1.8.x

Maven - 3.x.x

Mysql - 5.x.x

Steps to Setup
1. Clone the application
   git clone https://github.com/Abhinash1995/spring-boot-mysql-rest-api.git
2. Create Mysql database
   create database restApi
3. Change mysql username and password as per your installation
    open src/main/resources/application.properties
    change spring.datasource.username and spring.datasource.password as per your mysql installation
4. Build and run the app 
    The app will start running at http://localhost:8080.

5. Explore Rest APIs
   The app defines following CRUD APIs.

   GET /api/Students

   POST /api/Student

  GET /api/Student/{id}

  PUT /api/Student/{id}

  DELETE /api/Student/{id}
  
You can test them using postman or any other rest client.
