# 👨‍💼 Employee Management System (EMS)

A simple, production-ready REST API built with **Spring Boot**, providing full CRUD functionality for managing employee records. This project is designed to demonstrate core backend development concepts, including RESTful architecture, in-memory database usage, and Spring Actuator for monitoring.

---

## 🚀 Features

- ✅ Create, Read, Update, Delete (CRUD) operations on employees
- ✅ RESTful API design using Spring Boot
- ✅ In-memory H2 database support
- ✅ Basic authentication (configurable)
- ✅ Configuration via `application.yaml` or VM arguments
- ✅ Actuator endpoints for health, info, and metrics
- ✅ API documentation (optional: Swagger/OpenAPI support)

---

## 📦 Tech Stack

- **Java 17+**
- **Spring Boot 3.5+**
    - Spring Web
    - Spring JDBC or Spring Data JPA (choose as needed)
    - Spring Security (Basic Auth)
    - Spring Boot Actuator
- **H2 In-Memory Database**
- **Maven**

---

## ⚙️ Running the Application

### 🖥️ Prerequisites

- Java 17+
- Maven 3.x+

### ▶️ Run from terminal

```bash
mvn clean spring-boot:run
