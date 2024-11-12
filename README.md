# Election Commission of India (ECI) Management System

**A Java-based CRUD application for managing candidate information for the Election Commission of India (ECI).**

## Table of Contents
<b>cid:-</b> it contains candidate id<br>
<b>name:-</b> it contains candidate name<br>
<b>gender:- </b>It contains gender of the candidate<br>
<b>party:-</b> it contains party of the candidate<br>
<b>state:- </b> it contains state of the candidate<br>
<b>assembly:-</b> it contains assembly of the candidate<br>
<b>age:-</b> it contains the age of the candidate<br>

## Description
> This project allows users to manage and manipulate candidate data in an SQL database. Users can add, view, update, and delete candidate records using a console-based interface. Maven is used for project and dependency management, and the application uses JDBC for MySQL database connectivity.

## Features
- **Add Candidate**: Add a new candidate with details like name, gender, party, etc.
- **View Candidates**: Retrieve all candidates or filter by party, gender, or assembly.
- **Update Candidate**: Modify details of an existing candidate.
- **Delete Candidate**: Remove a candidate record by their unique ID.

## Technologies Used
- ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
- ![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
- ![MySQL](https://img.shields.io/badge/MySQL-00758F?style=for-the-badge&logo=mysql&logoColor=white)
- **JDBC**: Database connectivity.

## Project Structure

<pre><code>
src/
├── main/
│   ├── java/
│   │   └── com.sid.eci/
│   │       ├── client/       # Contains main client application
│   │       ├── controller/   # control the flow of application
|   |       ├──  service/     # Handes application logic
│   │       ├── dao/          # Data Access Object layer for database interaction
│   │       ├── entity/       # Entity classes representing data models
│   │       └── utility/      # Utility class for database connection
  
│   └── resources/
└── test/                     # Unit test cases
</code></pre>


## Usage

After running the application, a menu will appear in the console:

1. **Insert Candidate**: Prompts for candidate details.
2. **View Candidate**: View a list of all candidates or filter by specific attributes.
3. **Update Candidate**: Update an existing candidate’s information.
4. **Delete Candidate**: Remove a candidate by ID.
5. **Exit**: Terminate the application.

Follow the on-screen prompts to manage candidates.

## Contributing
Contributions are welcome! Please fork this repository, create a feature branch, and submit a pull request.


**For any questions or feedback, feel free to reach out to** **sidheshwarjadhav100@gmail.com**


