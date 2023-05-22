# Cinema Application
This is a REST application without a graphical user interface that can be used through Postman. The main idea of
the project is to provide an interface for ordering
tickets for different sessions, where users can interact with movies,
movie sessions, and more. The application supports authentication.

### Getting started

To get started with this project, you can follow the steps below:

1. Install Java and MySQL on your computer if you haven't already.
2. Clone this repository to your local machine.
3. Create a MySQL database and update the database connection information in the application.properties file located in the src/main/resources directory.
4. Run the SQL script cinema.sql located in the root directory to create the necessary tables and initial data.
5. Open the project in an IDE (e.g., Eclipse, IntelliJ IDEA) as a Maven project.
6. Build and run the project using the IDE or by running the command mvn spring-boot:run in the project's root directory.
7. Once the application is running, you can test the endpoints using Postman or any other REST client.


### Technologies used
* `java` - 17
* `spring-context` - 5.3.20
* `spring-orm` - 5.3.20
* `spring-webmvc` - 5.3.20
* `spring-security-core` - 5.6.10
* `spring-security-config` - 5.6.10
* `spring-security-web` - 5.6.10
* `commons-dbcp2` - 2.8.0
* `hibernate-core` - 5.6.14.Final
* `hibernate-java8` - 5.6.14.Final
* `hibernate-validator` - 6.1.6.Final
* `mysql-connector-java` - 8.0.22
* `javax.servlet-api` - 4.0.1
* `jackson-databind` - 2.14.1
* `jackson-datatype-jsr310` - 2.13.0
* `javax.annotation-api` - 1.3.2

### Endpoints
- Add Cinema Hall - `POST /cinema-halls` - adding new cinema hall
- Get All Cinema Halls - `GET /cinema-halls` - retrieve all cinema halls
- Add Movie - `POST /movies` - adding new movie
- Get All Movies - `GET /movies` - retrieve all movies
- Add Movie Session - `POST /movie-sessions` - adding new movie session
- Find Available Sessions - `GET /movie-sessions/available` - find available sessions for a given movie on a given date
- Update Movie Session - `PUT /movie-sessions/{id}` - update existing movie session with the specified id
- Delete Movie Session - `DELETE /movie-sessions/{id}` - delete the movie session with the specified id
- Complete Order - `POST /orders/complete` - complete the order for the current user
- Get Order History - `GET /orders` - get the order history for the current user
- Add to Cart - `PUT /shopping-carts/movie-sessions` - add a movie session to the shopping cart for the current user
- Get Shopping Cart by User - `GET /shopping-carts/by-user` - get the shopping cart for the current user
- Find User by Email - `GET /users/by-email` - find a user by email
- 
### Authentication Endpoints
- Registration - `POST /register` - registration new user
- Login - `POST /login` - authentication
- Logout - `GET /logout` - invalidate current session


## Conclusion
This project provides a simple example of a REST application built using Java, Spring Framework, Hibernate, and MySQL. It demonstrates how to create and use REST endpoints, perform CRUD operations, and implement authentication using JWT tokens.