JavaTestTasks README

JavaTestTasks
=============

This repository contains a collection of Java programming tasks designed to enhance your coding skills. Each task focuses on a specific concept or problem, providing a hands-on approach to learning Java.

Table of Contents
-----------------

*   [Introduction](#introduction)
*   [Prerequisites](#prerequisites)
*   [Tasks Overview](#tasks-overview)
*   [Getting Started](#getting-started)
*   [Run Project via Terminal](#run-project-via-terminal)
*   [License](#license)

Introduction
------------

The **JavaTestTasks** repository offers a variety of programming challenges that cover fundamental to advanced Java topics. These tasks are suitable for self-study, interview preparation, or as supplementary material for academic courses.

Prerequisites
-------------

Before diving into the tasks, ensure you have the following installed:

*   Java Development Kit (JDK) 17 or higher
*   An Integrated Development Environment (IDE) like IntelliJ IDEA, Eclipse, or NetBeans
*   Basic understanding of Java programming

Tasks Overview
--------------

The repository includes tasks covering various topics, such as:

*   **Loops**: Implementing and understanding different looping constructs.
*   **Arrays**: Manipulating and processing data stored in arrays.
*   **Strings**: Performing operations on string data.
*   **Object-Oriented Programming (OOP)**: Designing classes and understanding inheritance, polymorphism, and encapsulation.

Each task file contains detailed instructions and, in some cases, example inputs and expected outputs to guide your implementation.


Getting Started
---------------

To get a local copy of this repository, follow these steps:

### Clone the Repository:


    git clone https://github.com/IrinaPetrichor/JavaTestTasks.git


### Navigate to the Project Directory:


    cd JavaTestTasks


Open the project in your preferred IDE.

### Run the project in IDE:

*  Open the AppRunner class.
*  Run the code by clicking the Run button in the IDE.

Make sure the project is compiled before running the command.

Run Project via Terminal
------------------------

### Compile the Java Files:


    javac -d out src/**/*.java


This compiles all Java files and places the compiled `.class` files in the `out` directory.

### Run a Specific Task:


    java -cp out your.package.name.YourClassName


Replace `your.package.name.YourClassName` with the actual package and class name containing the `main` method.

### Example (if there's a `Main` class inside `src/main/java/com/example/Main.java`):


    java -cp out com.example.Main


License
-------

This project is licensed under the **MIT License**. See the [LICENSE](LICENSE) file for details.