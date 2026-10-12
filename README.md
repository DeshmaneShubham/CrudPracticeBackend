# 📝 CrudPractice - User CRUD REST API

A Spring Boot REST API demonstrating full CRUD (Create, Read, Update, Delete) operations on a User entity. Built with Java 17, Spring Boot 4.0, Spring Data JPA, and MySQL.

---

## 📋 Table of Contents

- [Features](#features)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Setup & Installation](#setup--installation)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)

---

## ✨ Features

- **Create** – Add new users via POST request
- **Read** – Fetch all users or a specific user by ID (path variable or query param)
- **Update** – Update existing user details by ID
- **Delete** – Remove a user by ID
- **Auto-increment IDs** – Database-managed primary keys

---

## 🛠️ Tech Stack

| Technology         | Version   |
|--------------------|-----------|
| Java               | 17        |
| Spring Boot        | 4.0.1     |
| Spring Data JPA    | ✅        |
| Spring Web MVC     | ✅        |
| MySQL              | 8.x       |
| Maven              | 3.9.x     |

---

## 📁 Project Structure

```
CrudPracticeBackend/
├── src/main/java/com/TechnoSignia/CrudPractice/
│   ├── CrudPracticeApplication.java     # Main Spring Boot entry point
│   ├── Controller/
│   │   └── UserController.java          # REST API endpoints (CRUD)
│   ├── Entity/
│   │   └── User.java                    # User JPA entity
│   ├── Repository/
│   │   └── UserRepo.java               # Spring Data JPA repository
│   └── Service/
│       └── UserService.java             # Business logic layer
├── src/main/resources/
│   └── application.properties           # Database configuration
├── pom.xml                              # Maven dependencies
└── README.md
```

---

## 📦 Prerequisites

- **Java 17** or higher
- **MySQL 8.x** running on `localhost:3306`
- **Maven 3.9+** (or use the included Maven Wrapper `./mvnw`)

---

## 🚀 Setup & Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/DeshmaneShubham/CrudPracticeBackend.git
   cd CrudPracticeBackend
   ```

2. **Create the MySQL database**
   ```sql
   CREATE DATABASE crudPractice;
   ```

3. **Configure database credentials** (in `src/main/resources/application.properties`)
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/crudPractice
   spring.datasource.username=root
   spring.datasource.password=YOUR_PASSWORD
   ```

4. **Build and Run**
   ```bash
   ./mvnw spring-boot:run
   ```

   The server will start on `http://localhost:8080`

---

## 📡 API Endpoints

| Method   | Endpoint              | Description                     |
|----------|-----------------------|---------------------------------|
| POST     | `/save`               | Create a new user               |
| GET      | `/allData`            | Get all users                   |
| GET      | `/allData/{id}`       | Get user by ID (path variable)  |
| GET      | `/detailbyparem?id=`  | Get user by ID (query param)    |
| PUT      | `/update/{id}`        | Update user by ID               |
| DELETE   | `/delete/{id}`        | Delete user by ID               |

### Example Request — Create User (POST `/save`)

```json
{
  "name": "Shubham Deshmane",
  "email": "shubham@example.com"
}
```

### Example Response

```json
{
  "id": 1,
  "name": "Shubham Deshmane",
  "email": "shubham@example.com"
}
```

---

## 🗄️ Database Schema

| Field  | Type    | Constraint     |
|--------|---------|----------------|
| id     | BIGINT  | Primary Key, Auto Increment |
| name   | VARCHAR | -              |
| email  | VARCHAR | -              |

---

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/my-feature`)
3. Commit your changes (`git commit -m 'Add some feature'`)
4. Push to the branch (`git push origin feature/my-feature`)
5. Open a Pull Request

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

> Built with ❤️ by Shubham Deshmane
