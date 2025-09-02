# OrganizationEmployeeDemoAppBackend

A simple full-stack app to manage **Organizations** and their **Employees**.  
Tech stack: **Spring Boot + Hibernate + MySQL (Backend)** & **React.js (Frontend)**.

---

## Prerequisites
- Java 17  
- Maven  
- MySQL  
- Node.js & npm  
- IDE: Spring Tool Suite (STS)  

---

## Database Setup (MySQL)
```sql
CREATE DATABASE companydb;
Hibernate will auto-create the tables (organization, employee).

🚀 Running the Backend (Spring Boot)
Dependencies
Spring Boot Starter:

spring-boot-starter-web

spring-boot-starter-data-jpa

mysql-connector-j

spring-boot-starter-validation

Steps
Open backend project in STS 

Configure src/main/resources/application.properties:

properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/companydb
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
Run with:

In IDE → Run OrganizationEmployeeDemoAppApplication.java as Spring Boot App

OR in terminal:

bash
Copy code
mvn spring-boot:run
Backend runs at: http://localhost:8080
