# in progress 
<hr>

#### This project including the entity,dto,mapper package 
# spring-boot-hibernate-jpa-bank-management-systems

### Technical Details
In this project, we are going to use below set of versions for demonstrations.

    Spring Boot - 3.3.3
    Spring - 6.1.12
    Lombok - 1.18.34

### Building

The example can be built with
```shell
mvn clean install
```

### Running the example in your local
```shell
mvn clean spring-boot:run
```
## Technology used

1)Spring Boot</br>
2)Hibernate JPA</br>
3)Lombok</br>
4)MySQL

## 1. Create a New Spring Boot Project
You can create the project in IntelliJ IDEA, Spring Initializr, or manually through Maven. Here, I'll guide you through both IntelliJ IDEA and Spring Initializr.

<ul><li>Option A: Using Spring Initializr</li></br>
<li>Go to Spring Initializr.</li></br>
<li>Configure the project:</li></br>
<li>Project: Maven Project</li></br>
<li>Language: Java io</li></br>
<li>Spring Boot Version: Latest stable versn (e.g., 3.x.x)</li></br>
<li>Group: com.example</li></br>
<li>Artifact: project (or your preferred name)</li></br>
<li>Packaging: Jar</li></br>
<li>Java: 17 or higher</li>
<ul>

## Add Dependencies:
->Spring Web: For building web applications (REST controllers).<br>
->Spring Data JPA: For interacting with databases using Hibernate.<br>
->Spring Boot DevTools (optional): For faster development with hot reload.<br>
->MySQL Driver (or any database you want to use).<br>
->Lombok (optional): For reducing boilerplate code like getters, setters, etc.<br>
->Click Generate to download the project, and extract the zip.<br>

# Tree Structure of Project
```shell
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── project
│   │   │               ├── ProjectApplication.java       # Main application class
│   │   │               ├── controller
│   │   │               │   └── AccountController.java    # Controller for account-related endpoints
│   │   │               ├── dto
│   │   │               │   └── AccountDTO.java           # Data Transfer Object for Account entity
│   │   │               ├── entity
│   │   │               │   └── Account.java              # Entity class representing the Account table
│   │   │               ├── service
│   │   │               │   ├── AccountService.java       # Service interface for business logic
│   │   │               │   └── impl
│   │   │               │       └── AccountServiceImpl.java  # Service implementation class
│   │   │               ├── repository
│   │   │               │   └── AccountRepository.java    # Repository interface for database operations
│   │   │               └── exception
│   │   │                   └── ResourceNotFoundException.java  # Custom exception for handling not found errors
│   │   ├── resources
│   │   │   ├── application.properties                    # Application configuration file
│   │   │   └── data.sql                                  # Initial database data for Account
│   │   └── static                                         
│   │   └── templates                                     # If you use JSP/Thymeleaf templates
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── project
│                       └── AccountServiceTest.java       # Unit tests for Account service

```
# Account Creation
## Account  POST Data
http://localhost:8087/api/accounts
```shell
curl --location 'http://localhost:8087/api/accounts' \
--header 'Content-Type: application/json' \
--data '{
    
     "accountNumber":103,
      "accountHolderName":"vikas",
      "balance":6000,
       "customerId":1
}
}'
```
# Account Deposit 
## Deposit PUT amount 
http://localhost:8087/api/accounts/3/deposit
```shell
curl --location --request PUT 'http://localhost:8087/api/accounts/3/deposit' \
--header 'Content-Type: application/json' \
--data '{
    "amount": 6000.0

    }'
```

# Deposit Screen 

<image src="https://github.com/user-attachments/assets/20ccec6d-9509-43ef-a71a-92e450628266" width="750" height="350">


# Account Deposit 
## withdraw PUT amount 
http://localhost:8087/api/accounts/3/withdraw
```shell
curl --location --request PUT 'http://localhost:8087/api/accounts/3/withdraw' \
--header 'Content-Type: application/json' \
--data '{
    "amount": 2000.0

    }'
```

# withdraw Screen 

<image src="https://github.com/user-attachments/assets/b6913896-f2c2-4275-b485-d0f6ccc98afc" width="750" height="350">
    
# SQL  
only creating Schema db
```shell
SELECT * FROM accountdepositandwithdrawl.accounts;
```

# MySql Database Screen
<image src="https://github.com/user-attachments/assets/e50169b5-4fe6-4f1d-ab29-5a26b8670c4f" width="750" height="350">




## getAllAccounts Database 
http://localhost:8087/api/accounts

<image src="https://github.com/user-attachments/assets/96601b24-eca5-4bac-b283-0775848c3f66" width="750" height="350">
