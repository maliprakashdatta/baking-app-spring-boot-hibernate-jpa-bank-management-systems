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
      "balance":5000,
       "customerId":1
}
}'
```
