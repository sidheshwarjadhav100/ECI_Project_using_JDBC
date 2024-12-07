# 🗳️ **NomineeTrack**

NomineeTrack is a Java-based Election Commission of India (ECI) project that simplifies candidate data management. It uses JDBC for database connectivity and provides functionalities such as adding, viewing, updating, and deleting candidate records.

---

## ⭐ **Features**

- **Add Candidate**: Insert new candidate information into the database.
- **View Candidates**:
  - View all candidates.
  - Filter candidates by party, gender, or assembly.
- **Update Candidate**: Modify existing candidate details.
- **Delete Candidate**: Remove a candidate's record based on their ID.

---

## 🛠️ **Tech Stack**

- **Language**: Java
- **Database**: MySQL
- **Database Connectivity**: JDBC

---

## ⚙️ **Prerequisites**

- Java Development Kit (JDK 8 or higher)
- MySQL Database
- IDE (e.g., IntelliJ IDEA, Eclipse) for running the application
- JDBC Driver for MySQL

---

## 🗄️ **Database Setup**

1. Create a database named `ecidb` in MySQL.
2. Execute the following SQL query to create the `candidate` table:

   ```sql
   CREATE TABLE candidate (
       cid INT PRIMARY KEY,
       name VARCHAR(100),
       gender VARCHAR(10),
       party VARCHAR(50),
       state VARCHAR(50),
       assembly VARCHAR(50),
       age INT
   );


src
├── com.sid.eci.client
│   └── ECI_Client.java        # Entry point of the application
├── com.sid.eci.controller
│   └── Controller.java        # Handles communication between the client and service layer
├── com.sid.eci.dao
│   └── Dao.java               # Handles database operations
├── com.sid.eci.entity
│   └── Candidate.java         # POJO class for candidate details
├── com.sid.eci.service
│   └── Service.java           # Contains business logic
└── com.sid.eci.utility
    └── Utility.java           # Provides database connection utility


## ⭐ **Client View Setup**
Welcome to Election Commission Of India
 --------------------
|       MENU         |
 --------------------
|1. Insert Candidate |
 --------------------
|2. View candidate   |
 --------------------
|3. Update candidate |
 --------------------
|4. Delete candidate |
 --------------------
|5. Exit             |
 --------------------
Enter Choice: 
