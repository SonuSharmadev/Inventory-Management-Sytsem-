
# Inventory Management System

## Description

The Inventory Management System is a web application designed to streamline inventory management. The project includes a backend developed with Spring Boot and MySQL, and a frontend created with Flutter, developed by our team. This application enables efficient tracking and management of inventory items, with a user-friendly interface for ease of use.

## Features

- **Backend (Spring Boot & MySQL):**
  - CRUD operations for inventory items
  - User authentication and role-based authorization
  - Data validation and error handling
  - Integration with MySQL for robust data management

- **Frontend (Flutter):**
  - Responsive and intuitive user interface for managing inventory
  - Real-time updates and notifications
  - Compatible with various devices and screen sizes

## Installation

### Backend

1. **Clone the repository:**

   ```sh
   git clone https://github.com/SonuSharmadev/Inventory-Management-System.git
   ```

2. **Navigate to the backend directory:**

   ```sh
   cd Inventory-Management-System/backend
   ```

3. **Install dependencies:**

   Ensure you have Java and Maven installed. Run:

   ```sh
   mvn install
   ```

4. **Configure the database:**

   Edit the `application.properties` file to include your MySQL database details:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/your_database
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

5. **Run the application:**

   ```sh
   mvn spring-boot:run
   ```

### Frontend

1. **Navigate to the frontend directory:**

   ```sh
   cd Inventory-Management-System/frontend
   ```

2. **Install dependencies:**

   Ensure you have Flutter installed. Run:

   ```sh
   flutter pub get
   ```

3. **Run the application:**

   ```sh
   flutter run
   ```

## Contributing

### Collaborators

- **Sonu Sharma:** Backend development using Spring Boot and MySQL
- **Ibad Musheer:** Frontend development using Flutter

### How to Contribute

1. **Fork the repository.**
2. **Create a new branch:**

   ```sh
   git checkout -b feature/your-feature
   ```

3. **Make your changes and commit them:**

   ```sh
   git add .
   git commit -m "Add a descriptive commit message"
   ```

4. **Push your changes:**

   ```sh
   git push origin feature/your-feature
   ```

5. **Open a pull request on GitHub.**

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments


