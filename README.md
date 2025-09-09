# CRUD Application

This is a **Spring Boot CRUD application** for managing products.  
It demonstrates the use of **Spring Boot**, **Hibernate (JPA)**, and an **H2 in-memory database** to perform basic operations:  
- Create  
- Read  
- Update  
- Delete  

---

## 🛠 Tools & Technologies
- **Java 17+**
- **Spring Boot**
- **Spring Data JPA (Hibernate)**
- **H2 Database** (in-memory)
- **Maven** (build tool)
- **REST APIs** with `@RestController`

---

## 📂 Project Structure

    src/main/java/com/example/firstapp
    │── controller
    │ ├── HomeController.java
    │ ├── LoginController.java
    │ └── ProductController.java # Handles CRUD endpoints
    │
    │── modal
    │ └── Product.java # Entity class
    │
    │── repository
    │ └── ProductRepo.java # JPA repository interface
    │
    │── service
    │ └── ProductService.java # Business logic
    │
    └── FirstAppApplication.java # Main class

---

## ⚙️ Setup Instructions
1. **Clone the repository**
   ```bash
   git clone https://github.com/Jayaram-dev-004/springboot-crud.git
   cd springboot-crud

2. **Build the project**
    ```bash
    mvn clean install

3. **Run the application**

    ```bash
   mvn spring-boot:run

5. **The app will start on:**

   ```bash
   http://localhost:8080

**🗄 Database**

H2 Console: http://localhost:8080/h2-console

Default JDBC URL: jdbc:h2:mem:testdb

Username: sa

Password: (empty)

