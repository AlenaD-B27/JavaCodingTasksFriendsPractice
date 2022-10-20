
# Java Cheat Sheet

---
### This document will highlight the main points of the topics we cover.
#### Last updated: 10/05/2022

## Table of Contents:

    Click to go directly to the section
---
[Shortcuts](https://github.com/Cydeo-B27/Java-Programming-B27/blob/master/Java_Cheat_Sheet.md#shortcuts)

[Introduction to Programming](https://github.com/Cydeo-B27/Java-Programming-B27/blob/master/Java_Cheat_Sheet.md#introduction-to-programming)

[IntelliJ](https://github.com/Cydeo-B27/Java-Programming-B27/blob/master/Java_Cheat_Sheet.md#intellij)

[Java Basics](https://github.com/Cydeo-B27/Java-Programming-B27/blob/master/Java_Cheat_Sheet.md#java-basics)

[Variables](https://github.com/Cydeo-B27/Java-Programming-B27/blob/master/Java_Cheat_Sheet.md#variables)

[Operators](https://github.com/Cydeo-B27/Java-Programming-B27/blob/master/Java_Cheat_Sheet.md#operators)

[Scanner](https://github.com/Cydeo-B27/Java-Programming-B27/blob/master/Java_Cheat_Sheet.md#scanner)

[Conditional Statements](https://github.com/Cydeo-B27/Java-Programming-B27/blob/master/Java_Cheat_Sheet.md#conditional-statements)

[String](https://github.com/Cydeo-B27/Java-Programming-B27/blob/master/Java_Cheat_Sheet.md#string)

[Loops](https://github.com/Cydeo-B27/Java-Programming-B27/blob/master/Java_Cheat_Sheet.md#loops)

[Array](https://github.com/Cydeo-B27/Java-Programming-B27/blob/master/Java_Cheat_Sheet.md#array)

[Methods](https://github.com/Cydeo-B27/Java-Programming-B27/blob/master/Java_Cheat_Sheet.md#methods)

[Wrapper Classes](https://github.com/Cydeo-B27/Java-Programming-B27/blob/master/Java_Cheat_Sheet.md#wrapper-classes)

[ArrayList](https://github.com/Cydeo-B27/Java-Programming-B27/blob/master/Java_Cheat_Sheet.md#arraylist)

[Custom Classes](https://github.com/Cydeo-B27/Java-Programming-B27/blob/master/Java_Cheat_Sheet.md#custom-classes)

[Access Modifiers](https://github.com/Cydeo-B27/Java-Programming-B27/blob/master/Java_Cheat_Sheet.md#access-modifiers)

[Encapsulation](https://github.com/Cydeo-B27/Java-Programming-B27/blob/master/Java_Cheat_Sheet.md#access-modifiers)

[Inheritance](https://github.com/Cydeo-B27/Java-Programming-B27/blob/master/Java_Cheat_Sheet.md#inheritance)

[Method Overriding](https://github.com/Cydeo-B27/Java-Programming-B27/blob/master/Java_Cheat_Sheet.md#inheritance)

[Exceptions](https://github.com/Cydeo-B27/Java-Programming-B27/blob/master/Java_Cheat_Sheet.md#exceptions)

---
## Shortcuts
```
reformat code:
	mac: option + command + l
	windows: control + alt + l

search anything
    shift + shift
    
search inside of the files:
    command/control + shift + f
    
generate menu
    command/control + n
```

---

## Introduction to Programming

* computers understand binary. A language of 0s and 1s

```
   Ex: 
        00000000 -> 0
        00000100 -> 4
        10000000 -> 128
        11111111 -> 255
```

* In order to represent all characters in a computer there needs to be some way to represent characters as binary. This is done by a system that correlates numbers to a character. The number for a character can be converted to binary for the computer to process it. 

* Unicode is global standard for these number/character correlations. There are different encoding formats that determine which character is related to which number. One common encoding used is UTF-8, which is equivalent to ASCII (American Standard Code for Information Interchange), 

```
    Ex:
      Character <-> Number
          A     <->   65
          Z     <->   90
          a     <->   97
          z     <->   122
          !     <->   33
          *     <->   42 
```

* Programmers use programming languages, so they don't need to write in binary. High level languages, like Java, help a programmer write human understandable code that can later be compiled to a lower level language for the computer to understand. 

* A java program is written in a .java file. That file is compiled into a bytecode file that has the .class extension. Bytecode files are run in the JVM. The JVM interprets the bytecode as it is run.
  * JVM: Java virtual machine that allows java programs to run

---

## IntelliJ

* IntelliJ is an IDE(Integrated Development Environment) that helps us write java code
  * We could write, compile and execute java files without an IDE, but it would be slightly more difficult. IDEs make it easier by offering many shortcuts, hints, and warnings. They also allow us to compile and execute programs with a click of a button.

* We use the ultimate version of IntelliJ which is a paid version of the tool. We give everyone a year licence to be able to use this version. The paid version has a couple extra features we will use later on
    * The community edition is the free version and is just as useful. It is only missing a couple extra features provided

### Workflow in IntelliJ
    - We work in a project
    - The project has a source/root folder called src
    - We created packages in the src. Packages are folders that will help organized java files
    - In the packages we create java classes, java files to write java code

---

## Java Basics

### Java classes: In a java file there is a class defined. The class has the same name as the java file. For now all we know is classes are where we write java code

  ``` java
  public class HelloWorld {
  
  }
  ```

### Main method: How we can run java code. We will understand all the parts later.
  ``` java
  public static void main(String [] args) {
  
  }
  ```

### Print statement: Used to print information to the console
  ```
    System.out.println();
  ```

#### First program to display `Hello World` to the console
  ```java
public class FirstProgram {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
  ```
---

### Comments
#### Comments allow regular text to be written in a java file. Comments are helpful to explain how the code works for others and for your future self
```java
  
// single line comments can create a comment on one line using two forward slashes

/*
        multi line comments are declared with slightly different syntax and allow you to type comments on multiple lines
 */

/**
 *      The java doc comments help to create documentation from the java code written. 
 *      We will not need to use this comment, but we will see it used in official documentation and files
 */


```
### Escape Sequences  
#### This is a smaller topic and will not need to be used much, but they can provide some useful functions to characters within a String (double quotations)
#### When you want to add a character to a String that is also used in java syntax the backslash can be used to differentiate syntax between the character
```
Common uses:
  \n -> goes to next line
  \t -> adds a tab
  \\ -> adds a backslash character
  \" -> adds a double quotation character
```
___

## Variables
#### A variable is a way to define information into a reusable container. Variables in java are created by defining a data type and a name. After declaring a variable can be assigned a value and used as many times as needed

```
  Syntax:
      datatype variableName = value;
  Ex: 
      int num = 100;
```

#### It is possible to declare variables to get them ready to be used and then later assign them. It is also possible to declare and assign variables at the same time. Both are commonly used. It is also possible to declare/assign multiple variables that share the same datatype by using a comma to separate the variables
``` 
  declaring
    int a;
    
  assigning
    a = 1;
    
  declaring & assigning
    int b = 130;
    
  declaring multiple
    byte a1, a2, a3;
    
  declaring & assigning multiple
    short s1 = 5, s2 = 10, s3 = 15;
  
```

### Data types
#### Java has two kinds of datatypes: primitive datatype and non-primitive types(We will spend more time on these later)

```
Primitive datatypes:
    byte
    short
    int 
    long
    float
    double
    char
    boolean
```
#### `byte`, `short`, `int`, and `long` are used to hold whole numbers. They differ in the amount of memory they use, and as a result how big of a number can be held. `int` is the most commonly used type, and it is also the default for whole numbers for the compiler
#### `float` and `double` are used to hold floating numbers. `double` is the most commonly used type, and it is also the default for floating numbers for the compiler
#### `char` is used to hold a single character. The single quote ' ' is used to hold these characters
#### `boolean` can have a value of `true` or `false`

#### `String` is a non-primitive type. It is used to hold sequences of characters using double quotations " "
> We will fully understand what String is and how it works later

#### Concatenation (+) is used to combine two pieces of information together. At least one of the information being combined must be a String. The result of the concatenation is a String.
  ```
    Ex:
      String a = "hello"
      System.out.println(5 + a + 10); -> results in 5hello10
  ```

#### Primitive type casting: Converting from one primitive datatypes to another 

  > Order from the smallest type to the biggest type: byte -> short -> int -> long -> float -> double

  - Widening Convention is when you go from a smaller datatype to a bigger datatype. This direction is done automatically and does not require anything
    ```
    Ex:
      int i = 5;
      double d = i;
    ```
  - Narrowing Convention is when you go from a bigger datatype to a smaller datatype. This direction require manually casting the types to the smaller type. Casting is done with the smaller datatype in parentheses
  
> General syntax for casting: 
  >>smallerType varName = (smallerType) biggerType

```
    Ex:
      double a = 9.99;
      int b = (int)a;
``` 

  - Casting from a bigger datatype to a smaller datatypes has the possibility for data loss. If a datatype cannot hold the value being assigned to it, there will be a calculation run for represent how much data was lost. When casting floating number to whole numbers the floating numbers are also lost. No rounding happens

---

## Operators

#### Arithmetic Operators
  Operators used to perform arithmetic calculations
  ``` 
	+ addition
	- subtraction
	* multiplication
	/ division
	% remainder/modulus
  ```
- Arithmetic operations between two different datatypes result in the biggest datatype between the two

- When you do arithmetic operations with short or byte the values are changed to int for the calculation, so the result of the operation is int

#### Shorthand operators:
  Shorter syntax to use the arithmetic operators and update the value of the variable without having to manually reassign

  ``` 
    +=
    -=
    *=
    /=
    %=
  ```
```

  Ex:
    normal use:
    
      int a = 10;
      a = a + 4; // a would have a value of 14 because the original value of a is taken, 4 is added to it, and then the result is reassign back into the variable
      
    shorthand use:
    
      int b = 6;
      b += 6; // b would have a value of 12 after this line because 6 is added to the original value of the variable and that result is automatically stored into the variable. The variable updates

```

#### Unary operators:

  ```
    +       (plus) positive number
    -       (minus) negative number
    ++      incrementing, adding 1
    --      decrementing, subtracting 1
    
    Pre and Post operations:
    
        Given int num = 0;

        pre-increment: increments the value before it is used in the expression
                ++num

        pre-decrement: decrements the value before it is used in the expression
                --num

        post-increment: increments the value after it is used in the expression
                num++

        post-decrement: decrements the value after it is used in the expression
                num--

    **** We will primarily use post incrementing and we will not need to worry about the post functionality of it

  ```

#### Relational Operators
  used to compare values. The result is a boolean value
```
  > greater than
  >= greater than or equal to
  < less than
  <= less than or equal to
  == equals: checks if two values are the same
  != not equals: checks if two values are not the same
```
> Q: What is the difference between `=` and `==`
  >> we use the `=` as the assignment operator
> 
  >>we use the `==` to compare the values to check if they are equal

#### Logical Operators
  used to compare booleans. The result of a boolean value

```
  && and --> both boolean statements must be true for an and expression to be true
  || or --> at least one boolean statement must be true for the expression to be true
  ! not --> used to check the opposite value of a boolean
  
  short circuit: 2 operators form (&& ||) is more efficient in execution. 
  If the result of the logical operators is known the remain code on a line does not need to be executed
```

#### Overall precedence of operators
```
  Execution goes top to bottom. Left to right. Each operator in the same line is same priority so it executed left to right.
  
    ! + - ++ -- 
    * / %
    + -
    < > <= >= 
    == !=
    &&
    ||
    = += -= *= /= %=
```

---

### Scanner

`Scanner` is a class that has methods to allow inputs of information from different sources. We will use the `Scanner` methods to type in the console to create some dynamic programs. In the future the dynamic aspect will come from testing applications

> We will learn what classes and methods are in more details in the future

1) To use `Scanner` we need to `import` the class
   > Importing allows a file to be used outside the package it was created in. We need to import the Scanner class to use it

   > We will learn importing better in the future as well

Add the import line between the `package` and the `class`
```java
import java.util.Scanner;
```

2) Create a `Scanner` object
  > creating an object will allow us to use the methods(code) that is already written to type in the console
```
 Syntax:
    Scanner input = new Scanner(System.in);
```
  - instead of `input` its possible to use any name, because it is just a name for the object. Common names are scan, keyboard, scanner, in

> the name of the object is better known as the reference, but that is something we will learn more about later

3) Use the `Scanner` methods
  to use the methods we need to call them from the object:
```
scannerObj.method();

Scanner methods:
  nextByte()
  nextShort()
  nextInt()
  nextLong()
  nextFloat()
  nextDouble()
  nextBoolean()
  next(): returns a String, but only accepts one word
  nextLine(): returns a String, and can allow multiple words, but also accept the enter input
```
> Known issue with nextLine():
> 
> Since the nextLine() method accepts the enter inputs it can cause issues whenever trying to use it with the other Scanner methods. Whenever a different Scanner method, besides nextLine() is used before the nextLine call there is a problem because when typing in the console the enter key is used to submit the info and continue the program to the next line, but that enter input is also finishing the nextLine call without allowing you to type any for that call.
> 
> The fix is to add an extra nextLine() call between the two Scanner methods 

---

# Conditional Statements

### If statements: Allow you to control how the program will be executed based on boolean expressions
  Types of is statements:
  - `single if`: boolean expression is checked. If the boolean is true the if block will be executed, but if the boolean is false the code will resume execution after the if statement
    
  > has one boolean expression 

    ```
    if(boolean_expression){
    
    }
    ```
  - `if else`: boolean expression is checked. If the boolean is true the if block will be executed, but if the boolean is false the else block will be executed

  > has one boolean expression

    ```
    if(boolean_expression){
    
    } else {
    
    }
    ```
  - `multi branch`: boolean expression is checked. If the boolean is true the if block will be executed, but if the boolean is false the next boolean expression is checked and so on. Whenever a boolean is true that related block of code is executed

  > has multiple boolean expressions

    ```
    if(boolean_expression){
    
    } else if(boolean_expression){
    
    } else {
    
    }
    ```
  - `nested if`: if statement that is defined in another if statement.

    ```
    if(boolean_expression){
    
        if(boolean_expression){
    
        }
    
    } else {
    
    }
    ```

Note: If statements can be declared without any curly brackets. If they are the first line after the statement is the block related to the if statement, but it is not readable and cannot work when there is multiple lines that belong to one block, so in general you should always use brackets

### Ternary 
  alternative way to write `if` statements

  syntax:
> returnValue = boolean_expression ? trueValue : falseValue

  The `?` is treated as `if`

  The `:` is treated as `else`

  ```
  Example:
    
    String s = 2 > 5 ? "Two" : "Five";
  ```
---

### Switch:
> A conditional statement that is useful when the possible values are known. Only useful for comparing exact values
>
> One of the key component of the switch in comparison to `if statements` is how execution of a switch is handled.
> Not all "conditions" or in this case "cases" are checked like they would be in an if statement. When the switch gets a value it will immateriality jump to the case and begin execution from that point top to bottom until the end of the switch or a `break` keyword.

```
    syntax:
    
	switch(input value){
		case x:
		   // statements
		   break;
	}       
```

#### Keywords for switch:
   - `case`: used to define the exact value that is being checked for and define the code that should be executed when the case is matched
        - valid input value types: byte, short, int String, char
        - NOT valid types: double, float, boolean
    
   - `default`: the case that is executed if no other case is matched. Acts similar to an else block in an if statement. The default is optional, if a switch doesn't have a default and the value given is not defined as a case nothing is executed. The default case can be anywhere in the switch. The order of the cases does not matter for matching

   - `break`: stops the switch statement execution

#### Benefit of switch statements: readable, easy to maintain, generally quicker execution compared to a multibranch if statement

---
#### If statement vs Switch vs Ternary
	In most cases you will use if statements
	any switch or ternary can always be converted to an if statement
	If statements allow more flexibility by using single if, if else, multi branch, or nested 

	Switch is useful to compare the exact value, so it is a good choice when all the possible values are known (they will be the cases)
	Downsides: only compare values, no boolean logic, and the datatypes that can be compared are a little restrictive

	Ternary useful sometimes to make a quick single if statement in one line
	Can only be used when a value is returned, and you need to at least define two possible outputs

---

## String

- `String` is a class located in the `java.lang` `package`
   - the `java.lang` `package` is automatically imported because it has classes/files that are used regularly in java code

- `String` are `immutable`, which means after the object is created it cannot be changed

- Strings can be created in two ways:
  - `literal`: using double quotations | **The way we will usually create Strings**
    ```
        String s = "java";
    ```
    > String literals are created in the String pool which is a special memory location to handle the commonly used datatype. The String pool is located in the `heap`
  - using `new` keyword -- **we will talk about object creation more in the future**
    ```
        String s = new String("java")
    ```
    > objects created using `new` are created directly in the `heap` memory where all objects are created
    
Note: Do not use `==` to compare Strings. Strings are objects so the `==` compares the objects not the values

- Every character in a String has an `index`. Indexes start from 0. Indexes can be helpful with some methods to get certain characters. Whenever an index is used that does not exist the program will stop with : `StringIndexOutOfBoundsException`

#### String methods: methods are used to do some action with String objects. Use a method by calling the String `object.method()`

Return boolean
```
equals(): checks if two objects have the same characters. Does check for case sensitivity

equalsIgnoreCase(): checks if two objects have the same characters, but it will ignore the case sensitivity

startsWith(str): checks if the String object starts with the characters defined in the parenthesis

endsWith(str): checks if the String object ends with the characters defined in the parenthesis

contains(str): checks if the String object has the given characters defined in the parenthesis anywhere in the String

isEmpty(): checks if the String has no characters

isBlank(): checks if the String has only white space characters and no other characters
```
Return String
```
toUpperCase(): converts the characters all to uppercase

toLowerCase(): converts the character all to lowercase

trim(): removes any spaces from the beginning and end of the String

substring(): returns part of the String
    (int): the String returned will start from the index that was given in the parenthesis and keep every character until the end of the String
    (int, int): the String returned will start from the given index in the parenthesis and will include all the character up to the second given index number. Not including that ending index
    
replace(): allows you to modify/change a certain character/s to another given character/s. Replaces all of the occurrences of the character in the String    
    (char, char) first give the char you want change, second one is the char you are changing to   
    (String, String) first give the String you want change, second one is the String you are changing to   
    
replaceFirst(): replaces the first instance of the given String
    only works with Strings in the parenthesis     			
```
Return int
```
length(): checks how many characters are in the String

indexOf(): return an int(index) where the given character/s is located in the String. 
    If the character does not exist in the String -1 is returned
    (char): give a char in the parenthesis and it returns the index where that character is found. Only return the first occurrence of the character
    (String): give a String in the parenthesis it will look for that sequence of characters in the String and if its find that sequence it will return the index of the first character in the sequence
    (char/String, int):  give a String or a char, the value you are searching the index of, then you give a number which is the starting point to search from(starting point)
    
lastIndexOf(): returns an int(index) of the given parenthesis value, but the first occurrence of the value from the end of the String    
```
Return char
```
charAt(int): returns the character at the given index number from the parenthesis
```

Note: There is more methods that exist, we can not learn every single method created, there is many files, classes, libraries we will use that all have so many useful method. We need to get an idea of some common functions of Strings for now. For the full list of String methods check the oracle documentation: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html

---

# Loops

Used to execute the same statements multiple times

> Loop types:

    - while loop: evaluates a boolean expression to determine if the loop should iterate again
        - if the boolean expression is true: the statements in the loop body are executed
        - if the boolean expression is false: the loop stops

        while(boolean) {
            // statements
        }   

    - do while: one iteration of the statements is always guaranteed then the boolean expression is checked to determine if the loop continues or not
        - if the boolean expression is true: the loop repeats and code statements are executed again
        - if the boolean expression is false: the loop stops

		do {
                // statements
		} while(boolean);

    - for loop: used when the iterations are known. Useful loop type because of the ability to define the parts exactly how you need to use them. Has built in functions of how code is executed

        for(initialization; termination condition; update){
            // statements
        }
        
        flow of loop: variable from initialization part is created for the loop. This part only runs once. Then the boolean expression in the termination condition is checked. If the boolean is true the statement in the loop are executed. Finally to finish an iteration the update part is executed. From there the boolean expression is checked again and the cycle repeats until the boolean is false

> Note: When a loop's boolean expression will never change to false the loop will continue to execute making it an infinite loop.

> break & continue
>
>       break: stops and exits the loop
>
>       continue: skips the rest of the current iterations 

#### Nested loop
> A nested loop is a loop inside another loop.

```
Execution of a nested loop:
the outer loop executes one iteration at a time
but during each execution of the outer loop, the inner loop is executed from beginning to end each time
the inner loop starts and ends each iteration of the outer loop

    Example:
    
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 2; j++) {
            
            }   
        }
```
---
## Array
    storing multiple information of similar type to one object
    instead of using multiple variables we can use an array to group that information

#### Declaring array:

```	
declaring with values/elements

    dataType[] name = {element, elm, elm ,etc};
    String[] words = {"java", "testing", "Friday"};
```
```
declare an empty array - the array will have default values based on type

    dataType[] name = new datatType[size]
    String[] strs = new String[5];
    
    default values of different types:
        whole number: 0
        floating number: 0.0
        boolean: false
        object: null
```
### Access Elements
```
elements have an index, start from 0
arrayName[index] --> use this to read a value: use information from that array
```
### Changing/Reassigning Elements
```
arrayName[index] = value --> use this to write to the array: put information into the array
```
### Printing an array
```
Trying to print the array reference will not show the elements, but instead some hash about the object in the memory

To print an array we need to use the utility class and its method:
    Arrays.toString(arr) -> returns a String format of the array
```

### For each loop
    a loop used to iterate elements from a collection/data structure
    
    we know arrays at this point
    
        for(datatype variableName: array) {
        
        }   

    flow: goes from the first element to the last always, every iteration the variableName represent every element, one element at a time
    
    the variableName is the same as arrayName[i] in a for loop where i is the index from 0 to the end of the array

> Note: The for each loop can only be used when reading/using information from the array, but whenever specific indexes are needed, or the array needs to be modified then the for each loop cannot be used
---

### Multidimensional arrays
```
        Allows the array to hold other arrays. The element of a multidimensional array is a single array

        single array
                int [] a = { 1, 2, 3};

        2D array
                int [][] arr = {
                        {1, 2, 3},
                        {4, 5, 6}
                }

                arr[1] -> {4, 5, 6}
                arr[1] = { 10, 30 10};

                        To access the elements we will still use indexes. In this case the elements are other arrays

                - To create a 2d array you can use single array variables, or make the single arrays right away in the declaration

        Print the multidimensional arrays:

                Arrays.deepToString(arr);
```

#### declaring 2D array
```
	datatType [][] arrayName = new dataType[x][z];

		where x is how many elements the 2D array has - number of arrays

		where z is the size of each inner array
			-> is optional to define. If it is not defined then the inner arrays sizes do not matter, they can be different

	datatType [][] arrayName = { arrayName1, arrayName2, etc}

	dataType [][] arrayName = { {element, element, element, etc}, {element, element, element, etc}, {element, element, element, etc} };
```

#### Iterating through a 2D array:
```
	for each: (using double array above)

		for(double[] eachInner : prices){ <-- elements of prices are 1D, double arrays. In the loop we are calling them eachInner

			for(double eachNum : eachInner){
				// now we have access to each price number using eachNum variable
			}

		}

	traditional: 

		for(int i = 0; i < prices.length; i++){

			for(int j = 0; j < prices[i].length; j++){ // prices[i].length --> length of each inner array
					// here we have access to each price number using prices[i][j]
			}
		}
```
---

## Methods
```
	being able to create a set of statements that have a function/action that are in some code block
		-> makes it reusable, maintainable, readable

	public static RETURN_TYPE methodName(){
	
	}	

	RETURN_TYPE: 2 type of methods:
		void - nothing is given back from the method
		return type - does an action and return a single value back
		
            if a method has a return type defined instead of the void, then there must be a return value. 
                -> The return value is given using the 'return' keyword in the method

            return method work with and without parameters
```

#### Parameters: defined variables that the method needs in order to execute, the information acts are input data
```
	those parameters are defined in the parenthesis of the method

	Note: if a method has a parameter a value must be given in order to execute that method
	Note: to put multiple parameters separate by comma
		(int a, int b)
		(String s, byte b)
		(int[] arr, int n)

	the argument is the value given when calling the method

	Ex:

		public static void letter(char c){

		}

		char c --> parameters

		letter('a') --> 'a' is the argument
```
#### How to call a method:
```

    - Assuming they are static methods for now

	in the same file: only need method name

	outside the file: className.method()

	-> Anytime you want to use anything from a different package you should import the class

		import packageName.className

		order in java file: PIC -> package -> import -> class
```

#### Method Overloading
```
	method has the same name, but different parameters

		-> allow us to have different methods that share a similar idea and work with different inputs

		+ readability
		+ re usability

	Ex from String class:
		substring(int)
		substring(int, int)	

		in this class we had two method that had the same name. They have a similar idea but the result can be different based on which argument were given

			if you give one int, choose starting point and returns all characters after that point
			if you give two int, it would return the characters in the range of those numbers
			
    Q: Does changing the return type overload the method?
    
        NO, changing the parameters is what overload the method
    
        -> but if you overload correctly, then it is possible to change the return type
```
#### Variable Arguments (Var args)
```
	syntax of three dots, which represents an array, but allow you to type number directly, instead of having to create an array first

	method(int[] arr) -> parameter is an int array

	calling this method:
		method() --> argument should be int array, which means we will create one first then use the method

var arg version:

	method(int ... arr)	-> parameter is an int array
		this one allows to type numbers, separates by commas when calling the method

	calling this method:
		method(num, num2, num3, etc) --> the numbers typed here will be the elements of the array argument
```
---
## Wrapper Classes
	object representation of the primitive datatypes	

	classes are defined in java.lang

```
primitive 	|	wrapper class/object
------------------------------
byte		| 	Byte
short		|	Short
int 		|	Integer
long 		|	Long	
float 		|	Float
double 		|	Double
char 		|	Character
boolean 	|	Boolean
```
```
Why do we need these?

	1) Collections do not work with primitive datatypes
		-> ArrayList will be our first collection, so ArrayList will not work with primitive datatypes

	2) The wrapper classes have helpful methods and information

How to create the wrapper class object:

	className variable = value <- preferred way

	ex:

	Integer i = 10;

IQ: What is autoboxing and unboxing?

	* Both are done automatically
	
	autoboxing: converting the primitive datatype to a wrapper class object

	unboxing: converting from the wrapper class object to the primitive datatype

Useful methods: [See documentation for more]
	
	MAX & MIN values -> information

	Character.isDigit()
	Character.isLetter()
	Character.isUppercase()
	Character.isLowercase()

	Integer.parseInt() -> convert String to an int type

IQ: difference between parse and valueOf
	
	parse: return primitive type

	valueOf: return wrapper class objects
	
	Ex: 

		String s = "34";
		Integer.parseInt(s) --> 34 as int type
		Integer.valueOf(s) --> 34 as Integer type
```
---
## ArrayList
```
	ArrayList is a class. Part of the collection framework
		-> different collections help to work with many data

    class is located in java.util package

	ArrayList uses arrays internally
	
	ArrayList allows duplicate elements
	ArrayList is ordered. You can access the elements by indexes. Order of the elements is known(insertion order)

	* ArrayList is a dynamic array
		-> in ArrayList the size is NOT fixed
		the size will grow and shrink when needed
		
	Syntax:
	    ArrayList<DATATYPE> name = new ArrayList<>();
```
```
Array vs ArrayList

	Array
		fixed size
		use both used with primitive & non primitive types
		object type
		no methods
		in general takes less memory
		Need to use Arrays.toString() to print the array

	ArrayList
		dynamic size
		only use object types (non primitive types)
		object type
		has methods to use the data
		in general takes more memory
		can be printed using only print statement, no need for anything else
```

```
ArrayList Methods:

	size(): returns the number of elements
		return int

		last index: size() - 1

	add(element): adds the element to the end of the ArrayList
		return boolean -> returns true, we don't usually use this return value.

	add(int, element): adds the element at the given index number. All the other elements move position	

	get(int): return the element at the given index number
		return element 

	clear(): removes all the elements from the ArrayList	

	remove(int): removes the element at the given index. All elements shift over
		returns the element that is removed

			-> if you try to remove an index that doesn't exist: out of bounds

	remove(element): remove the element that was defined from the ArrayList. 
		returns boolean
			true: if the element was removed
			false: if the element was not removed - if the element did not exist

	isEmpty(): checks if there is any elements in the ArrayList
		returns boolean
			true: ArrayList is empty, no elements
			false: if there is any elements

	contains(element): checks if the ArrayList has the given element
		returns boolean
			true: ArrayList has the element
			false: ArrayList does not have the element

	equals(ArrayList) checks if the given ArrayList is equal to the ArrayList using the method
		return boolean
			true: if the two ArrayList are the same, which means they have the same elements, same order
			false: if the ArrayList are not the same
			
    indexOf(element): returns the index of the given element. The index returned will be the first occurrence of the element   
    	returns int

    set(int, element): replace the element at the given index with the given new element

```
```
Creating ArrayList in different ways

	ArrayList<type> name = new ArrayList<>();

		creates an empty ArrayList

	ArrayList<type> name = new ArrayList<>( collection type );

		collection type: there is a collection framework that has many components 
			ArrayList is a collection type

		ArrayList<type> name = new ArrayList<>( arraylist object );

	Using Arrays.asList()

		parameters: an array ( var arg )
		returns: collection type

	Use both parts together to create an ArrayList with values

	ArrayList<type> name = new ArrayList<>( Arrays.asList() );
	Ex: .asList("hello", "world", "Friday")
		.asList(3, 4, 5, 1, 5, 5)
```

#### Collections
```
	a utility class for collection types
	located in java.util package

	Collections.sort()
	Collections.max()
	Collections.min()
	Collections.frequency()

	others: shuffle, reverse, swap
	
	Note: this is just a sample of the methods. For the full list check the documentation 
```

#### Bulk Operation Methods
```
	the arguments of each methods are collection types

	addAll(collection type): add all the elements from the given argument to the ArrayList

	removeAll(collection type): removes every occurrence of every element from the given argument

	containsAll(collection type): checks if every element from the given argument is in the ArrayList 

	retainAll(collection type): keeps all the defined elements, but deletes all the others
```
```

Also ArrayList methods: arguments are different

removeIf( lambda )

to define the argument we will use a lambda expression

syntax for lambda:

	variable -> boolean expression(use that defined variable)

forEach( lambda )

	variable -> statement want to run with each element

	-> this statement is not a boolean like it was for removeIf()
	
Note: We will talk about lamdba and how these methods were working towards the end of the course
```
---

# Custom Classes

### What is a class

	a template/blueprint for objects.
	allows you to define information(variables) & actions(methods)
	-> both are instance members

### What is an object

	instance of a class, it has a copy of all the information and actions defined from the class

#### How to create an object

	ClassName varName = new ClassName();

	Note: left side of equal sign is the reference
		  right side of the equal sign is the object

	instantiation: creates an object	  

#### What is an instance variable

	variable defined in a class
	every object has a copy of these variables

#### How to print objects

	we cannot print directly because it will show some hashcode

	the toString method from the object class is inherited and this method is called when printing objects. If you want to change how the object is printed you must override the method. [See inheritance sections for more clarification ]

syntax:
```
public String toString(){
    return "information you to print"
}
```
### Constructor

	a special method that is called when an object is created
	it it called with the new operator
	the constructor is used mainly to initialize our instance variables

	the constructor should be the same as the class name and have no return type(no void either)

	if we don't create a constructor the compile will create a default constructor, which is a no argument constructor
		-> if you create a constructor, the default one is no longer there

	- We can define parameters if we need
```
Ex:

Zoom.java
    public class Zoom{
        public Zoom(){
        }
    }
```
#### this
java prioritizes local variables over instance variables

		if you have a local variable and an instance variable with the same name. The local variable will be the one used

	this keyword: acts as a reference to the object
	so it will normally be used to tell the compiler the difference between a local variable and an instance variable

	Ex:

		public class A{
			String str;
			public A(String str){
				this.str = str; // this line will assign the argument as the value to the instance variable for that object. Without the this keyword, the local str from the parameter would be assigning to itself, doesn't change the instance variable
			}
		}

#### this vs this()

	this: reference to the instance of a class
	this(): call a constructor	

#### Constructors can be overloaded

	constructor chaining: one constructor calling another constructor -> we don't have to repeat ourselves 
	
	using this() and passing the argument needed to call a specific constructor 

	- reduces repetition

	rules:
		the constructor call should be the first line
		cannot use the class name className(), you need to this()
		only call one constructor
		should not call itself or contain itself

### Static

	keyword that allows us to define members that belong to the class
		-> opposite of instance which are members that belong to the objec

#### instance vs static

	instance: members that belong to the objects
		access from the object
		every object has a copy of every instance members

	static: members that belong to the class
		access from the class name
		every static member has a single copy

		static variable: variable that had one copy belonging to the class
			-> part of constant (will come back to this later)

		static methods: methods that has on copy belonging to the class
			-> methods that are accessed quickly
			-> utility method

		static block: a block of code that is written in the class. This code block is executed once in the beginning when the class is loaded into the memory for the first time
			-> used to set up variables, calls methods

		static import: allows you to access one specific static member without giving the class name

			syntax:
				import static packageName.className.staticMember;
					or
				import static packageName.className.*;  
					wildcard allows you to access all static members in that file

---

### Access Modifiers

	keyword that define the visibility or scope
	(where you can use/access variables and methods)

	-> local variables DO NOT have access modifiers

	-> variables, methods, constructors can have any access modifier
	-> classes public or default (main classes)

	[Most Visible] public -> protected -> default -> private [Least Visible]

	public: accessible everywhere in the project

	default: accessible within the same package
		-> when there is no other access modifier

	private: accessible within the same class

	protected: accessible by the classes of the same packages and the subclasses present in any package

---

## OOP

	Object Oriented Programming

	OOP concepts:
	Encapsulation
	Inheritance
	Abstraction
	Polymorphism

--- 

### Encapsulation:

	allows us to hide information from direct access.
	We limit the access to the variables by making the variable private and created public getter and setter methods

	getter: method that is used to get/return value of that variable

	setter: method that change/reassign the values of a variable

---

### Inheritance

	allows us to pass information/inherit from one class to another
		+ gives us code re-usability and code maintainability
		+ good organization, allow us to set up ideas, connect classes with similar ideas

	The Object class is the parent of all classes automatically

#### How to inherit in java

	use extends keyword in the class declaration

	syntax: Child extends Parent

		-> Parent class passes information to the Child class

	ex:

		public class Planet{
			int distanceFromTheSun;
		}	

		public class Earth extends Planet{
		}

#### Relationship between classes
use 'is a' relation to describe how classes are connected

		child is a parent

		Ex: Earth is a Planet

#### Describe classes in inheritance

	parent == super == base
	child == sub == derived

#### What is inherited:

	all public variables & methods
	all protected variables & methods
	default variables & method that are IN THE SAME PACKAGE

#### What is not inherited:

	all private variables & methods
	default variables & methods that are NOT IN THE SAME PACKAGE
	constructors

#### How many parents can we have

	in java you can only only one direct parent
	java does not allow multi-inheritance (multiple parents at the same)

	ex: you cannot do this:
		class A extends B, C

#### this vs super

	this: reference to the current class object
	super: reference to the super class object

#### this() vs super()

	this(): calling a constructor in current class
	super(): calling a constructor in the parent class

#### constructors in inheritance

	constructors do not inherit
	but, in order to create object the super class constructors must be called
	we need to use super() call

#### Types of Inheritance

	single inheritance

		class Planet{
		}

		class Mars extends Planet{
		}

	Multi level

		class Animal {
		}

		class Dog extends Animal{
		}

		class Husky extends Dog {
		}

	Hierarchical

		class Book {
		}

		class AudioBook extends Book {
		}

		class EBook extends Book {
		}

		class TextBook extends Book{
		}

### Method Overriding

	change the implementation(code) of a method that is inherited from a super class
		-> another way to phrase it: after inheriting a method we can change how it works

	use of overriding: create method implementation that is more specific for the sub class

#### @Override

	annotation that helps make sure you override the method correctly
	using the annotation is optional, but recommended to use

#### Q: What is the difference between overloading and overriding

	overloading: having the same method name, but having different parameters
		-> this happens in the same file

	overriding: changing the implementation of a method that came from the super class
		-> this happens across multiple files (super & sub)

#### Method Overriding rules

	method needs to be inherits
	method signature should be the same
		method signature: name + parameters
	access modifier should be the same or more visible

		public > protected > default > private

	return type should be same 
		or covariant: sub class of that return type

	overriding is only for instance methods

---

#### final

	final variable: variable that cannot be reassigned, cannot be changed

		- constants: information/data that are fixed and accessible everywhere
			syntax: public static final variables

			Note: convention for creating constant variables: constant variables are created in all uppercase . underscore for spaces

	final method: method that cannot be overridden -> cannot change the implementation of the method
		sytnax: public final void method(){}

	final class: this class cannot be the parent of another class. 
		syntax: public final class name {}
---

#### Q: Can you override static methods

	NO, they can't be and overriding is for instance methods to make them more specific for its sub class object

	But if you declare a static method in the sub class that has the same name as the the method inherited you will do method hiding
		-> both exist

#### Method overriding vs method hiding:

	instance methods: can be overridden, we can change how the method works in the sub class

	static methods: it will look like we are overriding but the idea is different

		When you try to make a method with the same name and parameters it is doing method hiding
		It means you are creating a new method with the same name, in the sub class
		Because these are static you have access to both static methods with the same name, because each is accessible by their class
---

## Exceptions

#### What is an error

	stops the execution, but it caused by factors outside of the side
	so, we don't handle them

#### What is an exception

	stops the normal flow of execution because of some code
	we will handle these

#### Inheritance of Exceptions

	Throwable
		Exception -> checked exceptions
			RuntimeException -> unchecked exceptions

#### Exceptions are objects

	common methods of the objects:
    	getMessage():	returns a String of the message component of the exception
    	printStackTrace():	prints the details about the exception to the console

#### Types of exceptions:

	checked/ compile time

		these exceptions MUST be handled for the program to compile

		Ex: Thread.sleep()
			Note: this method accepts the millisecond argument to pause the execution for that time

	unchecked/ run time

		an exception that could occur and when it does it happens during execution. 
		You can handle or fix the code

		Ex: StringIndexOutOfBounds, NullPointerException

#### How to handle exceptions

	try/catch block 

	you are able to run code in the try block
	and then we are able to define possible exceptions that could happen in the catch block
		-> if the exception occurs the catch block will handle it by running whatever code was defined in the catch block

		catch block: 
			when we set up a catch block we are defining the type of exception that will be thrown so we create a reference of that object using

			(exception name)

				Note: 'e' is commonly used as the name
				this part acts like a parameter for that block
			
			Ex: catch(NullPointerException e)

    finally block:

        its optional to add to try/catch
        this code block will run no matter, if there is an exception or not

#### throw vs throws

    throws: keyword that allows you to ignore an exception

        this is NOT handling the exception, but it allows you to compile 

        -> if you use throws you are accepting that an exception can happen

        used in the method signature line
        syntax:
        	method() throws Exception {}

        Ex:
        	public static void main(String[] args) throws InterruptedException{ }

    throw: causes an exception to happen, must throw an Exception type object
    	syntax:
    		throw new ExceptionObject();

        Ex: 
        	throw new IllegalArgumentException();

---

## Abstraction:

	process that hides implementation. We can focus on the main idea of WHAT is function(action, but not worry about HOW its done (implementation)

	implementation: the function of the code, how the code actually is used

	concrete class: first non-abstract class (normal class). This class must implement all abstract that are inherited

#### in java there is two ways to achieved abstraction

	abstract class
	interface

#### abstract methods

	a method without any implementation (a method with no code body)

	ex:

		public abstract void rotate();

		-> where/ how is this method used?

			in the sub classes/concrete classes this method would be overridden and then it can be used by the sub class object

#### abstract class
    a class that is defined with the abstract keyword

	ex: public abstract class Planet {

		}

		-> the abstract class is able to define abstract methods
		-> you cannot instantiate this class (cannot create objects from this class)

	everything else about the classes is the same

#### Interface

	interface is NOT a class. An interface is a blueprint for a class

	it is possible so create abstract methods
	you cannot create an object of the interface

	implementing an interface creates an is a relation

	so how do you create an interface
		it is in the .java file

		public interface NAME  {

		}
		where the NAME is the name of the interface

	everything uses public access modifier automatically	

	methods: any method declared is public abstract automatically

	variables: any variable declares is public static final automatically 
		-> constant variables are static final
		-> interface do not have any instance variables

#### What does an interface have

	constant variables, abstract methods, static methods, default methods

#### What does an interface NOT have

	instance variables, instance methods, constructor, blocks of code

#### Methods with implementation in interface:

	static: a method with code body and it is accessed by the interface name

		-> these methods are not inherited

		static level at the interface

	default: a method with a code body and it is accessed by the object of the class that is implementing the interface

		instance level for the class that implements

		-> this is not the default access modifier. It is a keyword for these methods. Default methods are created only in interface

---

## Polymorphism

	the object taking different forms by the reference

#### What are the possible references

	itself: the reference is the same type as the object

	any super class: any direct or indirect super class can be a reference

	any implemented interface

#### Benefit of polymorphism

	To limit what you have to access, only so you interact with the most important components

	the other references(especially the interface reference), allow us to be more flexible with other code components

	polymorphic data structures (ex: arrays) store different objects are the still somewhat similar

	with methods: the parameter and returns can be super reference or interface reference which means that method is flexible

#### instanceOf

	keyword that can find the type of the object

---

## Collections Framework

    a group of interfaces and classes that define data structures that handle data differently. 
        They define how data is added, or read from etc, based on different algorithms and implementations

### Main interface of the framework

    Iterable: parent of the Collection interface. Allows data structures to be iterated with a for each loop. Defines the iterator method

    Collection: child of Iterable. The parent of the Collection types. Defines the main functions of a collection
        ex: add, remove, size

    List: ordered(index), allows duplicates 

    Set: unordered(no indexes), not allow duplicates
        SortedSet: child of Set. has the idea of sorting

    List: ordered(index), allowed duplicates

    Queue: typically FIFO (First In First Out), but not necessarily(not always)

        null not allowed because there are additional methods defined that return null

        Deque: working with data from beginning and end of the collection
            Ex: methods: addFirst, removeLast()

    Map: stores information using keys and values
        DOES NOT INHERIT THE COLLECTION INTERFACE, but still considered a part of the collection framework

### Classes that implement List:

    ArrayList: data structure that uses arrays internally. Re-sizeable array
        useful to storing and reading information

    LinkedList: data structure that uses nodes internally.
        also implements Deque -> doubly linked

        useful to manipulate the collection. adding or removing is handled efficiently 

        Node: an object that has the value, reference to the node before it and reference to node after it

    Vector: legacy version of ArrayList. it is synchronized

        -> synchronization: 
            thread safe: multiple threads cannot access at the same time

    Stack(class): LIFO (Last In First Out) -> child of Vector
        methods related to LIFO:
    
        push(): adding the element to the top of the stack. also returns the element added
        pop(): removing the element at the top of the stack. also returns that element removed
        peek(): returns the element at the top of the stack

### Classes that implement Set:

    HashSet: follows a Hashing algorithm, which means handles data fast and efficiently
        data structure that uses HashMap internally

        the order is random to view, but is based on its own algorithm

    LinkedHashSet(): data structure that uses HashTable and LinkedList implementations

        the insertion order is maintained

    TreeSet: implements the SortedSet
        Elements are stored in the natural order(sorted order, smallest to largest, lexicographical)

        null is not allowed

### Classes that implement Queue

    PriorityQueue: data structure that stores elements based on its own priority. Sometimes looks like natural order, but cannot be predicted (random)

        does not accept null

    ArrayDeque: implementing Deque. More proper queue type
        also has access to both side of the collection

        does not accept null

    Methods:
        
            add()       -----       offer()
            remove()    -----       poll()
            element()   -----       peek()
        
            The methods on the left can cause an exception to occur whenever the method fails
            The method on the right just return null

### Iterable

    any data structure that implements the Iterable, which is any data structure that implements Collection interface, can be be iterated with a for each loop

    The interface defined this abstract method:

        Iterator<T> iterator();

        this abstract method was implemented in the collection classes. The methods returns an iterator object which allows us to iterate through the elements one a at a time using the methods of the iterator. It iterates through from beginning to end

        -> think of the iterator as a pin
        -> when the iterator method is called the start point is BEFORE the first element

    methods:
        hasNext(): returns boolean. checks if there is any element next to the current position of the iterator(pin)
        next(): returns the element. first moves the iterator to the next element and it returns that element
        remove(): remove the element at the current iterator position

### Classes that implement the Map interface
    the main idea of this interface is the key / value format
        Entry: key / pair
        each key is linked to some value

        -> keys must be unique
        -> values can be duplicate

    Syntax:
        Map < keyDatatype, valueDatatype > referenceName = object
        Map<Integer, String> map = new HashMap<>();

    HashMap: order the entries is not guaranteed (random order)
        using hashing algorithm (fast and efficient)

    LinkedHashMap: insertion order of the entries is maintained

    TreeMap: 
        implements SortedMap (interface)

        The entries are sorted in a natural order(based on the keys)
            -> ascending order, smallest to biggest, lexicographical 

        null key is not allowed

    HashTable: the order is not guaranteed (random order)
        legacy class -> inheriting Dictionary
        synchronized (thread - safe)
        both null keys and values not allowed
---

## Extra topics

### Functional Interface

    not used for abstraction with inheritance
        not meant to be implemented in a class(overridden)

    custom function (method)

    has one abstract method
        -> common names for these methods: test, apply, function, accept

    Q: If the interface is not inherited how do you implement the abstract method?
        lambda expression gives the implementation

    @FunctionalInterface
        helps to check if the interface is created correctly

### Lambda expression

    function without a name

    can be created anywhere so we can use them to define the implementation of the abstract methods of functional interface

    syntax:
        () -> {};
        (parameters) -> {statements};

        Note: parenthesis for the parameters is not needed if there is only one parameters
        Note: curly brackets are not needed if there is only one statement

### Generics

    <> brackets allow us to define any object type 

    used in classes or interface to help make a flexible file because any object type can be given

        Ex: List<E>, Map<K, V>, Predicate<T>

    Method parameters and return types can also use the generic type to be even more flexible

    common names for the generic type: T, U, R

### Built Functional Interface

    Predicate<T>
        defines a function that takes one object as the argument and returns boolean

        method: boolean test(T t)

    Consumer<T>
        defines a function that takes one object as the argument and does not return anything

        method: void accept(T t)

    Function<T, R>
        defines a function that takes one object as the argument and returns one object 

        method: R apply(T t)

    BiPredicate<T, U>
        defines a function that takes two objects(any type) as the arguments and returns boolean

        method: boolean test(T t, U u)

    BiConsumer<T, U>
        defines a function that takes two objects(any type) as the arguments and doesn't return anything (void)

        method: void accept(T t, U u)

    BiFuncation<T, U, R>
        defines a function that takes two objects(any type) as the arguments and returns an object(any type)

        method: R apply(T t, U u)

---

### Stream
    added in Java 8

	not a data structure, but acts to process data quickly using its different methods

	doesn't change the data structures that is providing the data

	How to get a Steam: we will focus on
		Collections method: stream() gathers the elements and then allows you to do an action
		    or
		Stream.of(array) creates a Stream from an array

### Stream methods:

		distinct(): gets rid of duplicates

		collect(): method to take all elements to allow conversion to another type
			arguments:
				Collectors.toList(): returns elements as a List

		toArray(): elements are converted to the array
			Arrays.stream(arr).distinct().toArray();

		skip(): allows to skip a certain amount of elements from the data structure
			-> act a little like removing them

			int argument for how many elements will be skipped

		limit(): only keeps the defined number of elements

			int argument for how many elements there will be total

		map(): allows to change the elements based on given lambda argument

			Function functional interface argument

		filter(): allows to filter the elements, return specific ones

			Predicate functional interface argument

		count(): allows you to count certain elements

		forEach(): allow to iterate through the elements

		allMatch(): checks if all elements match the defined lambda

			Predicate functional interface argument
			returns boolean

		anyMatch(): checks if one element match the defined lambda

			Predicate functional interface argument
			returns boolean

		noneMatch(): checks if no element match the defined lambda

			Predicate functional interface argument
			returns boolean	

---









