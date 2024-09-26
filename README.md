# in progress 
<hr>
#This project including the entity,dto,mapper package 
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
http://localhost:8087/api/accounts/3/deposit
```shell
curl --location --request PUT 'http://localhost:8087/api/accounts/3/withdraw' \
--header 'Content-Type: application/json' \
--data '{
    "amount": 2000.0

    }'
```

# withdraw Screen 

<image src="https://github.com/user-attachments/assets/b6913896-f2c2-4275-b485-d0f6ccc98afc" width="750" height="350">

