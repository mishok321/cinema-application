# Cinema Application
This is a REST application without a graphical user interface that can be used through Postman. The main idea of
the project is to provide an interface for ordering
tickets for different sessions, where users can interact with movies,
movie sessions, and more. The application supports authentication.

### Technologies used
#### Java
Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.

#### Spring Framework
The Spring Framework is an application framework and inversion of control container for the Java platform. The framework's core features can be used by any Java application, but there are extensions for building web applications on top of the Java EE (Enterprise Edition) platform.

#### Hibernate
Hibernate is a Java-based framework that simplifies the development of Java application to interact with the database.

#### MySQL
MySQL is a relational database management system based on SQL – Structured Query Language, which is used for adding, removing, and modifying information in the database.

#### Jackson
Jackson is a JSON parser and generator for Java, which is used to convert Java objects to JSON and vice versa.

#### Maven
Maven is a build automation tool used primarily for Java projects.

### Getting started

To get started with this project, you can follow the steps below:

1. Install Java and MySQL on your computer if you haven't already.
2. Clone this repository to your local machine.
3. Create a MySQL database and update the database connection information in the application.properties file located in the src/main/resources directory.
4. Run the SQL script cinema.sql located in the root directory to create the necessary tables and initial data.
5. Open the project in an IDE (e.g., Eclipse, IntelliJ IDEA) as a Maven project.
6. Build and run the project using the IDE or by running the command mvn spring-boot:run in the project's root directory.
7. Once the application is running, you can test the endpoints using Postman or any other REST client.

### Authentication
The application supports authentication using Spring Security.
To access the protected endpoints, you need to include a valid JWT
token in the request header. You can obtain a token by sending
a POST request to the /login endpoint with valid credentials.
The response will contain a JWT token that you can use
in subsequent requests.

## Conclusion
This project provides a simple example of a REST application built using Java, Spring Framework, Hibernate, and MySQL. It demonstrates how to create and use REST endpoints, perform CRUD operations, and implement authentication using JWT tokens.