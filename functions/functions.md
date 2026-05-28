# Functions

### What is function?


function is a resuable block of code which can be accssed or called from anywhere in the main code

---

### Types of functions
Pre-defined / Standard Library Methods: Built-in methods provided by Java (e.g., Math.max(), System.out.println()).

User-defined Methods: Methods created by the programmer to perform custom logic.

---
### Use of functions
Code Reusability: Write once, use multiple times without repeating code so that code reusability increase. 

Modularity: Dividing a program into separate methods allows each method to handle a specific task, making the code more organized and easier to manage.

Readability: Smaller, named methods make the code easier to read and understand.

Maintainability: It’s easier to fix bugs or update code when it's organized into methods.

---
### in java methods are used as function 

###  in java static and final method cannot be override

---
### Java Methods
All methods in Java must belong to a class. Methods are similar to functions and expose the behavior of objects.

### key component of methods
--- 
Key Components of a Method Declaration:

* Modifier: Defines access level (public, private, protected, default)

* Return Type: Specifies what value the method returns or void if no return

* Method Name: Name of the method, follows camelCase convention

* Parameters: Optional inputs passed to the method

* Method Body: Contains the logic or statements to be executed

```java
returnType methodName(parameters) {
  // method body
 return value; // optional (only if returnType is not void)
}
```
---
### Sequential flow of functions

When a method is called, the sequential flow of the program pauses.

* 1.  Control jumps to the called method.

* 2. The parameters (if any) are initialized.

* 3. The method body executes sequentially, line by line.

* 4. Upon hitting a return statement (or the closing brace }), control jumps back to the exact point where the method was originally called in the main program.

---
### Context Of the Function
Scope determines the visibility and lifecycle of variables.

* Global / Class Scope: Variables declared at the class level (instance or static variables). They can be accessed by any method within the class.

* Local / Lexical Scope: Variables declared inside a method block. They are created when the method is called and destroyed when the method finishes execution. They cannot be accessed outside that specific method.

---
### how objects are stored in functions
When you declare variables inside a method, they are stored in the Local Variable Table (LVT).

* Primitive Types (int, double, char) are stored directly in the LVT.

* Objects are created in the Heap memory, but the reference (the memory address pointing to that object) is stored in the LVT.

---
### what is stack frame?
A stack frame is a block of memory allocated on the Call Stack every time a method is invoked.
It contains:

* The Local Variable Table (LVT).

* The Operand Stack (used for intermediate mathematical or logical operations).

* Frame Data (stores the return address to go back to the calling method).
When the method completes, its stack frame is "popped" (destroyed) from the call stack.

---
### Methods in class Stack

A stack frame is a block of memory allocated on the Call Stack every time a method is invoked.
It contains:

* The Local Variable Table (LVT).

* The Operand Stack (used for intermediate mathematical or logical operations).

* Frame Data (stores the return address to go back to the calling method).
When the method completes, its stack frame is "popped" (destroyed) from the call stack.

---
### call by value call by reference

Java is strictly Call by Value. * For Primitives: A copy of the actual value is passed to the method. Changing the parameter inside the method does not affect the original variable.

* For Objects: A copy of the reference (memory address) is passed. Because the copied reference points to the same object in memory, modifying the object's internal properties will affect the original object. However, reassigning the reference to a completely new object will not.

---
### Parameterised function non-parameterised function
* Non-Parameterized: Takes no inputs. Good for static actions.

  ```Java
    public void sayHello() {
        System.out.println("Hello!");
    }
    ```
* Parameterized: Takes inputs (arguments) to perform dynamic actions.

    ```Java
    public void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }
    ```

---
### Function Overloading Function Overriding  

*    Overloading in Java:

     Overloading is a feature in Java that allows a class to have multiple methods with the same name but different parameters. 
     
     The overloaded methods must have different parameter lists, which can include different types of parameters or different numbers of parameters.  
     
     The compiler determines which method to call at compile time based on the number and types of arguments passed to the method.

```java
public class Calculator {
    public int calculate(int a, int b) {
        return a + b;
    }

    public double calculate(double a, double b) {
        return a * b;
    }
}
```

*   Overriding in Java:

    Overriding is a feature in Java that allows a subclass to provide a specific implementation of a method that is already provided by its parent class. 

    The subclass must have the same method name, return type, and parameter list as the method in the parent class. 

    The keyword @Override is used to indicate that a method is being overridden.

```java
public class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
```
