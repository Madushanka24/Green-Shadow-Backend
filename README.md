# Green-Shadow-Backend

A **Crop Management System** developed using **Spring Boot** for backend functionality and **JWT** for security, combined with **HTML**, **CSS**, **JavaScript**, and **Bootstrap** for an interactive and responsive frontend. This system provides tools to efficiently manage data related to crops, fields, equipment, logs, vehicles, and staff.

---

## **Features**

### Backend:
- **RESTful API Endpoints**:  
  Manage key entities such as:
    - Crops
    - Fields
    - Equipment
    - Logs
    - Vehicles
    - Staff

- **JWT-Based Authentication**:
    - Ensures secure access by generating and validating JSON Web Tokens for every user session.

- **Spring Boot**:
    - Simplifies server-side development with dependency injection, auto-configuration, and embedded servers.

- **Gradle Build System**:
    - Efficient project building and dependency management.

### Frontend:
- **Responsive Design**:
    - **Bootstrap** framework ensures the application is mobile-friendly and adaptable to various screen sizes.

- **HTML/CSS/JavaScript**:
    - User interface designed with **HTML** for structure, **CSS** for styling, and **JavaScript** for interactivity.

---

## **System Components**

### **Crop Management**
- Add, update, delete, and view crop data.
- Monitor crop growth stages and timelines.

### **Field Management**
- Manage field properties including size, soil type, and irrigation systems.
- Assign fields to specific crops.

### **Equipment Management**
- Add and maintain records of agricultural equipment.
- Schedule equipment servicing and usage logs.

### **Log Management**
- Record daily farming activities and tasks.
- Maintain historical logs for tracking productivity.

### **Vehicle Management**
- Manage vehicle information including type, registration, and maintenance schedules.
- Assign vehicles to tasks or employees.

### **Staff Management**
- Add and update staff profiles, roles, and assignments.
- Maintain attendance and activity logs.

---

## **Project Setup**

### **Requirements**
- **Java**: JDK 21+
- **Spring Boot**: Version 3.3.5+
- **Database**: MySQL 8.0.35
- **Frontend Tools**: Any modern browser, Node.js for JavaScript dependencies.

---

### **Installation Steps**

1. **Clone the Repository**
   ```bash
   git clone <repository-url>
   cd Green-Shadow-Backend
   ```

2. **Configure the Database**
    - Update the `application.properties` file in the `src/main/resources` directory with your database credentials:
      ```properties
      spring.datasource.url=jdbc:mysql://localhost:3306/green-shadow
      spring.datasource.username=your_username
      spring.datasource.password=your_password
      ```

3. **Access the Application**
    - Backend API: `http://localhost:4010/api/v1`
    - Frontend: Open `index.html` in a browser.

---

## **API Endpoints**

### **Authentication**
| Method | Endpoint              | Description               |
|--------|-----------------------|---------------------------|
| POST   | `/auth/login`         | Login and get JWT token   |
| POST   | `/auth/register`      | Register a new user       |

### **Crops**
| Method | Endpoint             | Description               |
|--------|----------------------|---------------------------|
| GET    | `/api/crops`         | Get all crops             |
| POST   | `/api/crops`         | Add a new crop            |
| PUT    | `/api/crops/{id}`    | Update crop details       |
| DELETE | `/api/crops/{id}`    | Delete a crop             |

*(Similar endpoints exist for fields, equipment, logs, vehicles, and staff)*

---

## **Security**

- **JWT** ensures token-based secure access:
    - Protects all endpoints except `/auth/login` and `/auth/register`.
    - Tokens must be included in the `Authorization` header as:
      ```
      Authorization: Bearer <your_token>
      ```

---

## **Frontend Design**
### **User Interface Features**
- **Dashboard**: Provides an overview of current crop statuses, field assignments, and equipment usage.
- **Forms**: Dynamic forms for adding and managing records, designed with Bootstrap for consistency.
- **Responsive Design**: Adjusts seamlessly to desktops, tablets, and mobile devices.

---

## **Acknowledgments**
- **Spring Boot** for simplifying backend development.
- **JWT** for secure user authentication.
- **Bootstrap** for responsive and modern UI components.
- **Gradle** for efficient project management.

---
