# Mini Project - Student Management System (MVC - Java + MySQL)

## 📌 Overview

This is a **Student Management System** developed using **Core Java**, **JDBC**, and **MySQL** following the **MVC (Model-View-Controller)** architecture pattern. The project allows users to perform basic CRUD operations on student records.

## 🎯 Features

* Add new student records
* Update existing student details
* Delete student records
* Display student details
* MVC structured project for clean code and easy maintenance
* MySQL database integration using JDBC

---

## 🏗 Technologies Used

| Technology       | Description                                    |
| ---------------- | ---------------------------------------------- |
| Java             | Core language used to implement business logic |
| JDBC             | Database connectivity                          |
| MySQL            | Backend database                               |
| MVC Architecture | Separation of concerns                         |

---

## 📁 Project Structure

```
MiniProject
│
├── MyConnection.java   # Handles database connection
├── Student.java        # Model class (POJO)
├── StudModel.java      # Business logic + DB operations
├── StudView.java       # User Interface (input output)
├── StudController.java # Control flow between view and model
└── StudMain.java       # Main file to run application
```

---

## 🗄 Database Setup

### 1️⃣ Create Database

```sql
CREATE DATABASE miniproject;
USE miniproject;
```

### 2️⃣ Create Table

```sql
CREATE TABLE student(
    RollNo INT,
    Name VARCHAR(80),
    City VARCHAR(80)
);
```

---

## ▶️ How to Run

1. Import project in any Java IDE (IntelliJ / Eclipse / VS Code)
2. Add MySQL Connector JAR to classpath
3. Configure DB username & password in `MyConnection.java`
4. Run `StudMain.java`
5. Follow on‑screen options to manage student records

---

## 🧠 MVC Flow Diagram

```
User → StudView → StudController → StudModel → Database
                        ↑
                        └──────── Display results
```

---

## 🚀 Future Enhancements

* Add GUI using Swing/JavaFX
* Add validation & exception logs
* Support search functionality
* Convert to web application using Spring Boot

---

## 👤 Author

**Ganesh**
Frontend + Java Developer passionate about backend and full‑stack development.

---

## 📬 Contact

📧 Email: *Add your email here*
💼 LinkedIn: *Add your LinkedIn profile*

If you like this project, don't forget to ⭐ the repository! 😊
