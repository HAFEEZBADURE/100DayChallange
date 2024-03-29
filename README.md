# 100DayChallange

I want to take up 100 days challenge for upskill my knowledge

# java notes:

======================

## 1.1 Why you must learn Java

1. One of the most popular language. Java
   currently runs on 60,00,00,00,000
   devices.
2. Wide Usage (Web-apps, backend,
   Mobile apps, enterprise software).
3. High paying and a lot of Jobs
4. Object Oriented
5. Rich APIs and Community Support

## 1.2 What is a Programming Language :

Compiler converts high level languages to low level languages or machine code.

1.Humans use natural language (like Hindi/English) to communicate
2.Computers only understand 0/1 or on/off
3.Giving instructions to a computer
: - Instructions: Tells computer what to do , These instructions are called code. Human instructions are given in High level languages.

## 1.3 What is an Algorithm

An algorithm is a step-by-step procedure for solving a problem or performing a task.

## 1.4 What is Syntax

Structure of words in a sentence.
• Rules of the language.
• For programming exact syntax must be followed.

## 1.5 History of Java

Developed by James Gosling at Sun Microsystems (Early 1990s):
Originally named 'Oak', later renamed Java in 1995

1.First Release (1995): Introduced "Write Once, Run Anywhere" concept with cross-platform compatibility.
2.Developed with vision of backward compatibility. Should not break with new version release.
3.Rapid Growth and Diversification (Late 1990s - 2010s): Expanded from web applets to server-side applications; standardized into different editions for various computing platforms.
4.first version of java is JDK Beta
5.As of February 2024, the latest Java
JDK version is JDK 21. It was released on September 19, 2023, and is a long-term support (LTS) release. This means that it will be supported with updates and security fixes for at least eight years.

## 1.6 Magic of Byte Code

intermediate code generated by the compiler after the compilation of source code(JAVA Program). This intermediate code makes Java a platform-independent language.

## 1.7 How Java Changed the Internet

1.Portability with Write Once Run Anywhere
2.Security because of Code running on Virtual Machine

## 1.8 Java Buzzwords or features.

1.Robust
:- Java is robust due to its strong memory management, exception handling, and typechecking mechanisms, which help in preventing system crashes and ensuring reliable performance.
2.Multithreaded
:- Multithreading in programming is the ability of a CPU to execute multiple threads concurrently,
allowing for more efficient processing and task management.
3.Architecture Neutral
:- Java is architecturally neutral because its compiled code (bytecode) can run on any device with a Java Virtual Machine (JVM), regardless of the underlying hardware architecture.
4.Interpreted and High Performance
:-Java combines high performance with interpretability, as its bytecode is interpreted by the Java Virtual Machine (JVM), which employs Just-In-Time (JIT) compilation for efficient and fast execution.
5.Distributed
:-Java is inherently distributed, designed to facilitate networkbased application development and interaction, seamlessly integrating with Internet protocols and remote method invocation.

## 1.9 Object Oriented Programming

: Object-oriented programming (OOP) is a computer programming model that organizes software design around data, or objects, rather than functions and logic. An object can be defined as a data field that has unique attributes and behavior.

## 2. Java Basics

## 2.1 Installing JDK

steps:
1.Search JDK Download
2.Make sure to download from the oracle website.
3.Download the latest version

## 2.5 File Extensions

.Java
• Contains Java Source Code
• High Level Human Readable
• Used for Development
• File is editable

.Class
• Contains Java Bytecode
• For consumption of JVM
• Used for Execution
• Not meant to be edited

## 2.6 JDK vs JVM vs JRE

1. .JDK
   It's a software development kit required to develop Java applications.
   • Includes the JRE, an interpreter/loader (Java), a compiler (javac), a doc generator
   (Javadoc), and other tools needed for Java development.
   • Essentially, JDK is a superset of JRE

2. .JRE
   It's a part of the JDK but can be downloaded separately.
   • Provides the libraries, the JVM, and other components to run applications
   • Does not have tools and utilities for developers like compilers or debuggers.

3. .JVM
   It's a part of JRE and responsible for executing the bytecode.
   • Ensures Java’s write-once-run-anywhere capability.
   • Not platform-independent: a different JVM is needed for each type of OS.

## 2.8 Importance of the main method

public static void main(String[] args)

• Entry Point: It's the entry point of a Java program, where the execution starts.
Without the main method, the Java Virtual Machine (JVM) does not know where to
begin running the code.
• Public and Static: The main method must be public and static, ensuring it's accessible
to the JVM without needing to instantiate the class.
• Fixed Signature: The main method has a fixed signature: public static void
main(String[] args). Deviating from this signature means the JVM won't recognize it
as the starting point.

## 3.1 What are Variables?

Variables are like containers used for storing data values.

example : int result =10;

int : data types,
result : variable name;
= : assignment operator:
10 : variable values

Data types: data type is a collection or grouping of data values,

1 byte is equal to 8 bit

data types and size

1. Byte - 1 byte
2. Short - 2 byte
3. int - 4 byte
4. long - 8 byte
5. char - 2 byte
6. float - 4 byte
7. double - 8 byte
8. boolean - 1 byte.

## 3.3. Naming Conventions

camelCase
• Start with a lowercase letter. Capitalize the first letter of each
subsequent word.
• Example: myVariableName
snake_case
• Start with an lowercase letter. Separate words with underscore
• Example: my_variable_name
Kebab-case
• All lowercase letters. Separate words with hyphens. Example:
my-variable-name
Keep a Good and Short Name
• Choose names that are descriptive but not too long. It should
make it easy to understand the variab
• Example: age, firstName, isMarried

## 3.3. Java Identifier Rules

1. The only allowed characters for identifiers
   are all alphanumeric characters([A-Z],[a-z],[0-
   9]), ‘$‘ (dollar sign) and ‘\_‘ (underscore).
2. Can’t use keywords or reserved words
3. Identifiers should not start with digits([0-9]).
4. Java identifiers are case-sensitive.
5. There is no limit on the length of the identifier but it is advisable to use an optimum length of 4 – 15 letters only.

## 3.8 Type Conversion and Casting

There are 2 tpes

1. implicit - Byte -> short-> int -> long ->float -> double
2. explicit - Byte <- short <- int <- long <-float <- double

## 4. Operators, If-else & Number System

1. Assignment Operator
2. Arithmetic Operators
3. Order of Operation
4. Shorthand Operators
5. Unary Operators
6. If-else
7. Relational Operators
8. Logical Operators
9. Operator Precedence
10. Intro to Number System
11. Intro to Bitwise Operators

## 4.1 Assignment Operator

Assigns the right-hand operand's value to the left-hand operand.
Example: int a = 5;

## 4.2 Arithmetic Operators

arithmetic operators are used for mathematical operations on numeric data types.

1. Addition (+):
2. Subtraction (-):
3. Multiplication (\*):
4. Division (/):
5. Modulus (%):

## 4.3 Order of Operation

BODMAS
Bracket, Order, divide, mutiple, add ,substract
9/3\*2/6
PEMDAS
Parentheses , exponents, multiply, Divide, Add, Substract

8-5+7-1

## 4.5 Unary Operators

Minus, Pre Increment , pre descrement, post increment, post decrement

## 4.6 if-else

1. Syntax: Uses if () {} to check a condition.
2. What is if: Executes block if condition is true, skips if false.
3. What is else: Executes a block when the if condition is false.
4. Curly Braces can be omitted for single statements, but not
   recommended.
5. If-else Ladder: Multiple if and else if blocks; only one executes.
6. Use Variables: Can store conditions in variables for use in if
   statements.

## 4.7 Relational Operators

Equality
• == Checks value equality.
Inequality
• != Checks value inequality.
Relational
• > Greater than.
• < Less than.
• >= Greater than or equal to.
• <= Less than or equal to.
Order of Relational operators is less than arithmetic operators

## 4.8 Logical Operators

1. Types: && (AND), || (OR), ! (NOT)
2. AND (&&): All conditions must be true for the result to be true.
3. OR (||): Only one condition must be true for the result to be true.
4. NOT (!): Inverts the Boolean value of a condition.
5. Lower Priority than Math and Comparison operators

## 5.1 Java Comment.

1. Used to add notes in Java code
2. Not displayed on the web page
3. Helpful for code organization
4. Syntax:
   1. Single Line:
   2. Multi Line:
   3. Java Docs:

## 5.2 What is a Loop?

1. Code that runs multiple times based on a
   condition.
2. Repeated execution of code.
3. Loops automate repetitive tasks.
4. Types of Loops: while, for, while, do-while.
5. Iterations: Number of times the loop runs.

## 5.2 While Loop

1. Iterations: Number of times the loop runs.
2. Used for non-standard conditions.
3. Repeating a block of code while a condition is true.
4. Remember: Always include an update to avoid infinite loops.

## 5.3 what are functions
Definition: Blocks of reusable code.
2. DRY Principle: "Don't Repeat Yourself" it Encourages code
reusability.
3. Usage: Organizes code and performs specific tasks.
4. Naming Rules: Same as variable names: camelCase
5. Example: ”Beta Gas band kar de"

## 5.3 Method Syntax
