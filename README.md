# Banking_App-using-SpringBoot
This project demonstrates the implementation of REST APIs for a simple Banking application using Spring Boot, Spring Data JPA (Hibernate), and MySQL database. It provides basic functionalities such as creating a bank account, fetching account details, and making deposits/withdrawals.

## Features:
- **Account Creation**: Users can create bank accounts with initial balances.
- **Account Details**: Fetch detailed information about a specific bank account.
- **Deposit/Withdrawal**: Perform deposit and withdrawal transactions on existing accounts.

## Technologies Used:
- **Spring Boot**: Framework for building robust and scalable Java applications.
- **Spring Data JPA (Hibernate)**: Simplifies database operations by providing a repository abstraction.
- **MySQL**: Relational database management system used for storing account data.

## How to Run:
1. Ensure you have Java JDK, Maven, and MySQL installed on your system.
2. Clone this repository to your local machine.
3. Configure MySQL database settings in `application.properties`.
4. Run the application using Maven: `mvn spring-boot:run`.
5. Access the REST APIs through your preferred HTTP client (e.g., Postman).

## API Endpoints:
- **POST /api/accounts**: Create a new bank account.
- **GET /api/accounts/{id}**: Retrieve account details by ID.
- **POST /api/accounts/{id}/deposit**: Make a deposit to the specified account.
- **POST /api/accounts/{id}/withdraw**: Withdraw funds from the specified account.

## Contributors:
- Narendra Reddy (https://github.com/NarendraReddy113)
