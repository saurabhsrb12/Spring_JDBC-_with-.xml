# Spring_JDBC-_with-.xml

Spring JDBC Example
This is a simple Spring JDBC example that demonstrates basic database operations (insert, update, delete, and select) using the Spring Framework and MySQL database. The project uses Maven for dependency management.

**Prerequisites**
To run this project, you'll need the following:

Java Development Kit (JDK) installed (preferably JDK 8 or higher)
MySQL database installed and running
Maven installed
**Getting Started**
* 1)Clone the project from GitHub:
bash
Copy code
git clone https://github.com/<your-username>/springjdbc.git

* 2)Set up the MySQL database:
Create a database named "springjdbc_db".
Create a table named "student" with columns: "id" (INT), "name" (VARCHAR), and "city" (VARCHAR).

* 3)Configure the database connection:
Open the file "src/main/resources/com/spring/jdbc/config.xml" and modify the following properties with your database credentials:

xml
Copy code
<bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
  <property name="driverClassName" value="com.mysql.cj.jdbc.Driver" />
  <property name="url" value="jdbc:mysql://localhost:3306/springjdbc_db" />
  <property name="username" value="your_mysql_username" />
  <property name="password" value="your_mysql_password" />
</bean>

* 4)Build the project:
Open a terminal or command prompt in the project directory.
Run the following Maven command:
go
Copy code
mvn clean package

* 5)Run the application:

After building the project, you will find a "springjdbc-0.0.1-SNAPSHOT.jar" file in the "target" directory.
Execute the following command to run the application:
bash
Copy code
java -jar target/springjdbc-0.0.1-SNAPSHOT.jar

**Observe the output:**

The application will perform basic CRUD (Create, Read, Update, Delete) operations on the database.
You will see the output displaying the results of the operations, such as inserted records, updated records, deleted records, and selected records.<br><br>
**Note**
The Spring JDBC configuration is defined in the "config.xml" file, where the data source and JdbcTemplate bean are configured.
The "StudentDao" interface defines the CRUD operations that the application performs on the database.
The "StudentDaoImpl" class implements the "StudentDao" interface and provides the actual implementation of the CRUD operations using JdbcTemplate.
The "RowMapperImpl" class implements the Spring RowMapper interface to map database rows to the "Student" entity.<br><br>
**Summary**
This project demonstrates how to perform basic database operations using Spring JDBC with MySQL. You can use this as a starting point to develop more complex applications with Spring and relational databases.
