# resource-allocation-system-project

Here's the updated README.md that includes the H2 database along with its Maven dependency:

# Resource Allocation System

## Overview

This project is a simple Resource Allocation System that includes a Spring Boot backend and a React.js frontend. It uses an H2 in-memory database for simplified development and testing.

---

## Features

- Backend API built using **Spring Boot**.
- Frontend developed with **React.js**.
- In-memory database (**H2**) for quick setup.
- Fetch and display resources with details like:
  - ID
  - Name
  - Experience
  - Skills
- Supports live integration between the backend and frontend.

---

## Dependencies

Add the following dependencies to the `pom.xml` of your Spring Boot project:


<dependencies>
    <!-- Spring Boot Starter Web -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- Spring Boot Starter Data JPA -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>

    <!-- H2 Database -->
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>

    <!-- Spring Boot Starter Test (optional for testing) -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>
Backend Setup

1. Prerequisites:
 . Java 11 or higher
 . Spring Tool Suite (STS) or any Java IDE

   
2. Steps:
  . Clone the repository or copy the code.
  . Configure your application.properties file to use the H2 database:
   
spring.datasource.url=jdbc:h2:mem:resource_db
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.h2.console.enabled=true
spring.jpa.hibernate.ddl-auto=update
Run the application in Spring Tool Suite or your preferred IDE.

4. Access H2 Console:
Once the application is running, open the H2 console at http://localhost:8082/h2-console.
Use the following details to log in:
JDBC URL: jdbc:h2:mem:resource_db
Username: root
Password: 123456789


5. Preloaded Data:
The application will automatically create the resource table and preload the following sample data on startup:
INSERT INTO resource (resource_name, experience, skills)
VALUES
    ('Dennis', 4, 'Java, Spring, JMS, Angular, React, Node.js'),
    ('Thompson', 7, 'Java, Oracle, React, Angular, REST API'),
    ('Kim', 12, 'Java, JSP, Spring, PostgreSQL, Mongo, Docker'),
    ('Aisha', 9, 'Angular, JavaScript, REST API, Docker, SQL Server'),
    ('Maya', 5, 'Spring Boot, Hibernate, PostgreSQL, Node.js, Python'),
    ('Kumar', 3, 'Java, Redis, JavaScript');
    
6. API Endpoint:
Base URL: http://localhost:8045/h2-console to see the data of the resources
Resource API in Postman : http://localhost:8045/api/resources using the postman

Frontend Setup

1. Prerequisites:
Node.js and npm installed on your system.
2. Steps:
Clone the repository or copy the frontend code.
Navigate to the frontend directory and install dependencies:
npm install
Start the development server:
npm start
The React app will be accessible at http://localhost:3000.
3.Key Component:
ResourceList.js: Fetches data from the API and displays it in a tabular format.

Troubleshooting

CORS Issues: If you encounter CORS errors, configure your Spring Boot backend by adding a WebMvcConfigurer bean to allow requests from the React app running on localhost:3000.
H2 Console Not Accessible: Ensure the application is running and the H2 console URL is correctly configured in application.properties.
License

This project is licensed under the MIT License.


This README includes the **H2 database dependency** and the relevant setup steps for both backend and frontend.
