


### Run Container of MySQL 8.0.13 version 

docker-compose.yml

```yml
version: '3.3'

services:
   db:
     image: mysql:8.0.13
     container_name: mysql8
     environment:
       MYSQL_ROOT_PASSWORD: 123456789
     ports:
       - "3306:3306"
     volumes:
      - ./dump.sql:/docker-entrypoint-initdb.d/dump.sql
volumes:
  mysql-volume:
```

```
docker-compose up -d
```

### application.yml

```yml

#the database config
spring.datasource.url=jdbc:mysql://localhost:3306/company?useUnicode=true&characterEncoding=UTF-8&characterSetResults=utf8&serverTimezone=GMT&useSSL=false&8&allowPublicKeyRetrieval=true
spring.datasource.username=root
spring.datasource.password=123456789
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.database-platform=org.hibernate.dialect.MySQL5Dialect
```


### Run Application

```sh
mvn spring-boot:run
```

### Get API.
 
[http://localhost:8080/api/list](http://localhost:8080/api/list) 
 
```json
[
  {
    "gender": "M",
    "emp_no": 10001,
    "birth_date": "1953-09-02 01:00:00.0",
    "last_name": "Facello",
    "hire_date": "1986-06-26 01:00:00.0",
    "first_name": "Georgi"
  },
  {
    "gender": "F",
    "emp_no": 10002,
    "birth_date": "1964-06-02 01:00:00.0",
    "last_name": "Simmel",
    "hire_date": "1985-11-21 00:00:00.0",
    "first_name": "Bezalel"
  }
]
```


