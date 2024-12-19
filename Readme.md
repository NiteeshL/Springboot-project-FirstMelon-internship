# Spring Boot Demo Project

This is a simple Spring Boot application designed to demonstrate the core functionality of a Spring Boot project. It includes basic setup, controller mapping, and database integration.

---

## Table of Contents
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup Instructions](#setup-instructions)
- [Build and Run the Project](#build-and-run-the-project)
- [Endpoints](#endpoints)
- [Troubleshooting](#troubleshooting)
- [Contributing](#contributing)
- [License](#license)

---

## Features

- RESTful API endpoints with Spring Boot
- Integration with a relational database (e.g., MySQL, PostgreSQL, or H2)
- Support for embedded server (Tomcat)
- Custom error handling and whitelabel error page replacement

---

## Technologies Used

- **Spring Boot 3.x**
- **Java 17+**
- **Maven** for dependency management
- **Database**: MySQL/PostgreSQL or H2 (embedded)
- **Spring Data JPA** for database operations

---

## Setup Instructions

Follow these steps to run the project locally:

1. Prerequisites

- Java 17 or higher installed
- Maven installed
- Database server (e.g., MySQL/PostgreSQL) running

2. Clone the Repository
```bash
git clone https://github.com/your-username/demo-project.git
cd demo-project
```
3. Configure the Application
- Update the application.properties file located in src/main/resources:
```properties
# Server port
server.port=8080

# Database configuration
spring.datasource.url=jdbc:mysql://localhost:3306/databasename
spring.datasource.username=your-username
spring.datasource.password=your-password
spring.jpa.hibernate.ddl-auto=update
```
4. Create a database named demo in your MySQL/PostgreSQL server:

```sql
CREATE DATABASE databasename;
```
---

### Build and Run the Project

1. Clean and build the project:
```bash
mvn clean install
```
2. Run the project:
 ```bash
 mvn spring-boot:run
 ```
 3. Open your browser and visit:
 ```
 http://localhost:8080
 ```
---
 ## Endpoints

| Method | Endpoint        | Description                      |
|--------|-----------------|----------------------------------|
| GET    | `/`             | Displays a welcome message.     |
| GET    | `/error`        | Custom error page.              |
| GET    | `/api/resource` | Example REST API endpoint.      |

---
 ### Troubleshooting
 1. Whitelabel error page (404)
 -Ensure a controller is mapped to / or static resources are present in the src/main/resources/static folder.
 
 2. Database Connection issues
 -Verify the database credentials in application.properties.
 -Ensure the database server is running.

 3. Port Already in Use
 -Change the port in application.properties
 ```
 server.port=8081
```
4. Logs for more information
-Run with debug mode enabled:
```bash
mvn spring-boot:run -Dspring-boot.run.arguments=--debug
```
---
### Contributing
Contributions are welcome! Feel free to open issues or submit pull requests to improve this project.

---
### License
This project is licensed under the MIT License. See the LICENSE file for more details.

---
