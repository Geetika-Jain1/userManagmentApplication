   # UserManagementApplication (Console Application)
   
   .Markdown Guide: Markdown cheat sheet.
   
   .Github: About READMEs
   
This java console application allows you to manage a list of users. You can perform various operations ,such as adding ,removing, searching user with id and sorting users by name.

## Table of contents
-[Project Structure](#project-structure).

-[How to run the code](#how-to-run-the-code).

-[Requirements](#requirements).

-[Running the Application](#running-the-application).

-[Building the Application](#building-the-application).

-[Usage](#usage).

## Project Structure

### `Main.java`

This  file is the entry point and will call the methods in the UserList class.

### `User.java`

This class holds the appropriate attributes, such as ID,name,and email of the user.

### `UserList.java`

This class method to:

1.**Add User**: Add user to the list by providing their ID,name and email.

2.**Remove User**: Remove user from the list based on their ID.

3.**Sort User by Id** : Search for the User by their Id and display their information.

4.**ListUsers**: Display a list of all users in the system.

5.**Sort user by name**: sort the user in the list alphabetically by their name.

## How to run the code

1. Pull the code from Github.
2. Open the project in intellij IDEA.
3. Run the main() from org.example.Main.

## Requirements

To build and run this application in a Linux environment, we need the following:

-Java Development Kit (JDK) installed.

You can check if java is installed by running `java-version`in your terminal.

-A text editor of your choice for code.

-A terminal for running commands.

-create two java files,one for the `User` class and ine for the `userList`class.

-Open iterm terminal and navigate to the directory where your java file is located.

## Building the Application

Before running the application, you need to compile the java source code.

1. compile the source code using the `javac` command:
    ```bash
     javac userManagmentApplication.java
   
This will generate the necessary .class file for the application.

2. Run the java program by executing the following command :
       java UserList
3. Run the java command on the main class, which is `UserList` in this case.

## Running the Application

Once the source code is compiled. We can run application using the java command:
   
     bash java userMangementApplication

## Usage

1. Run the application by following the step mentioned above.

2. We can add users,remove users,search for users by ID,list all users,and sort users by name.



## Reflection on the userManagementApplication for console

The User Management Console Application is a Java-based program that allows users to manage a list of users through a text-based interface. In this reflection, We will explore the design, architecture, and functionality of the code and highlight key aspects that demonstrate good coding practices and principles.

Design and Architecture:

The application is designed with a clean code principle, which makes it easy to understand and maintain. It consists of three main classes: User, UserList, and Main.

1. User class:

** The User class represents an individual user with attributes like id, name, and email. This class follows object-oriented principles by encapsulating user data and providing access through getters.
** The constructor of the User class allows for the creation of user objects with the necessary information.

2. UserList class:

**The UserList class manages a collection of User objects using an ArrayList. It provides methods for adding, removing, retrieving users, searching users by ID, and sorting users by name.
**This class effectively utilizes data structures and algorithms. For instance, the removeUser method leverages the removeIf function of the ArrayList, which is a concise and efficient way to remove users based on ID. The sortUsersByName method uses Collections.sort() and a Comparator to sort users by name, showcasing the use of built-in Java libraries effectively.

3. Main class:

**The Main class serves as the entry point for the application. It provide the unsorted list of user followed by sorted list according to the alpahabetical order and adding and removing method. 

## Clean Code Practices:

The code follows several clean code practices and principles:

1. ### Descriptive Naming:
All classes, methods, and variables have descriptive names, making the code self-explanatory. This is a crucial aspect of Clean Code principles.

2. ### Modularization:
The code is modular, with each class having a clear and distinct purpose. This promotes code reuse-ability and maintainability.

3. ### Encapsulation: 
The User class encapsulates user data, providing controlled access through getter methods. This encapsulation protects the data and allows for easy modification of the class's internal representation without affecting external code.

4. ### Efficient Algorithms:
The code uses efficient algorithms for operations like user removal and sorting, which are key for performance, especially when dealing with a large number of users.

5. ### User Interaction: 
The user interface, implemented in the Main class, is clear and intuitive. It helps to add user ,remove user or sort user by id and get back user by name.

### Room for Improvement:

While the code is well-structured and functional, there are areas for potential improvement:

Testing: The code lacks unit tests. Adding unit tests using a testing framework like JUnit would ensure that each component of the application functions as expected, allowing for easier maintenance and refactoring.

In conclusion, the User Management Console Application demonstrates good coding practices, adheres to object-oriented principles, and effectively utilizes Java libraries and data structures. It provides a simple yet functional tool for managing a list of users. With some minor enhancements like error handling and testing, this code could serve as a strong foundation for user-friendly user management system. The code is a valuable learning resource for new developers looking to understand clean code principles, Java object-oriented programming, and basic user interaction in console applications.







