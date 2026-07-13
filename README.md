# Banking Backend REST API

A fully functional, enterprise-structured banking backend web application built using the Spring Boot framework. This project implements clean architecture principles, utilizing Data Transfer Objects (DTOs) and proper layering (Controller, Service, Repository, Entity) to handle core financial operations seamlessly.

##  Features
* **Account Management:** Create new bank accounts and retrieve account details by a unique ID or fetch all accounts.
* **Core Banking Transactions:** Perform secure balance updates via dedicated endpoint operations for deposits and withdrawals.
* **Persistent Storage:** Fully integrated with a relational MySQL database schema for permanent data tracking.
* **Clean Architecture:** Strict separation of layers ensuring the database entities are never directly exposed to the client side.

---

##  Tech Stack & Tools
* **Language:** Java 21
* **Framework:** Spring Boot 3.3.4
* **Data Access:** Spring Data JPA / Hibernate
* **Database:** MySQL
* **Boilerplate Reduction:** Lombok
* **API Testing:** Postman

---

## How to Configure & Run Local Instance

### 1. Database Setup
Create a new schema in your MySQL Workbench:
```sql
CREATE DATABASE banking_system;
