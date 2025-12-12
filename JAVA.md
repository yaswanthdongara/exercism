# ☕ Java Programming Fundamentals

This document summarizes essential concepts and features of the Java programming language.

---

## 💻 Language Basics

* **Static Typing:** Java is a **statically-typed** language, meaning the type of a variable is determined at **compile-time**.
* **Object-Oriented:** Java is an **object-oriented** language. All functions must be defined within a **class**.
* **Methods:** A function defined within a class is referred to as a **method**.

---

## 🧱 Variables and Methods

* **Explicit Typing:**
    * All **parameters** must be explicitly typed; there is no type inference for parameters.
    * The **return type** must also be explicit.
* **Returning Values:** Values are returned from methods using the `return` keyword.
* **Access Modifier:** To allow a method to be called by other classes, the `public` access modifier must be added.

### Example: Method Signature

```java
public static int add(int a, int b) {
    return a + b;
}
```

---

## 🔢 Data Types and Operations

### Boolean Operators

Java supports three standard boolean operators:
* `!` (**NOT**)
* `&&` (**AND**)
* `||` (**OR**)

### Numeric Types

The two most common numeric types in Java are:
* `int`: A **32-bit** integer.
* `double`: A **64-bit** floating-point number.

### Numeric Conversions

Java has two types of numeric conversions:
1.  **Implicit conversions:** No data will be lost, and no additional syntax is required (e.g., converting an `int` to a `double`).
2.  **Explicit conversions (Casting):** Data **could be lost**, and additional syntax in the form of a **cast** is required (e.g., converting a `double` to an `int`).

```java
// Explicit conversion (casting)
double myDouble = 9.99;
int myInt = (int) myDouble; // myInt is 9 - data loss occurs
```

---

## 📝 Strings, Chars, and Arrays

### Strings (Immutability)

* Once a string has been constructed, its value can **never change** (it is **immutable**).
* Any methods that appear to modify a string (e.g., `toUpperCase()`) will actually return a **new string**.

### Arrays

#### Array Initialization

The standard syntax for initializing an array is:

```java
type[] variableName = new type[size];

// 1. Declare array with explicit size (size is 2)
int[] twoInts = new int[2]; 

// 2. Declare and initialize with values (size is 3)
int[] threeIntsV1 = new int[] { 4, 9, 7 }; 
int[] threeIntsV2 = { 4, 9, 7 }; // Equivalent shorthand
```

#### Iterating with a for-each Loop

```java
char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
for(char vowel: vowels) {
    // Output the vowel
    System.out.print(vowel); // Output: aeiou
}
```

#### Array Utility Class

Java provides a helpful utility class `java.util.Arrays` that contains useful array-related methods (e.g., `Arrays.equals`).

### Characters (`char`)

* The `char` primitive type is a **16-bit** representation of a single character.
* A `char` literal is surrounded by **single quotes** (e.g., `'A'`).

#### Useful `Character` Methods

The `Character` wrapper class provides static methods for checking character types:

| Method | Example | Result |
| :--- | :--- | :--- |
| `Character.isWhitespace()` | `isWhitespace(' ')` | `true` |
| `Character.isLetter()` | `isLetter('a')` | `true` |
| `Character.isDigit()` | `isDigit('6')` | `true` |

#### Converting String to Char Array

The `String.toCharArray()` method returns a `String`'s characters as a `char` array:

```java
String text = "Hello";
char[] asArray = text.toCharArray();

for (char ch: asArray) {
    System.out.println(ch);
}
// Outputs: H, e, l, l, o (each on a new line)
```

#### Concatenating Chars and Strings

The `+` operator can be used to add a `char` to a `String`:

```java
'a' + " banana"    // => "a banana"
"banana " + 'a'    // => "banana a"
```

> ⚠️ **Be Careful:** Do **NOT** use `+` to join two `char`s together to form a `String`! Adding two `char`s results in an `int` because Java promotes the `char`s to their corresponding ASCII/Unicode integer values before addition.
>
> ```java
> 'b' + 'c'; // => 197 (This is the sum of the Unicode values, NOT the String "bc")
> ```

### StringBuilder

For efficient string construction, especially when concatenating multiple times, it is better to use `StringBuilder`:

```java
StringBuilder builder = new StringBuilder();
builder.append('a');
builder.append('b');
builder.append('c');
String builtString = builder.toString(); // builtString is "abc"
```
## Ternary Operators
The ternary operator is a lightweight, compact alternative for simple if/else statements. Usually used in (but not restricted to) return statements, it needs just one single line to make the decision, returning the left value if the expression is true and the right value if false, as follows:
```
boolean expr = 0 != 200;

// Ternary statement
int value = expr ? 22 : 33;
// => 22
```
In Java, the null literal is used to denote the absence of a value.

Primitive data types in Java all have a default value and therefore can never be null. By convention, they start with a lowercase letter e.g int.

Reference types contain the memory address of an object and can have a value of null. They generally start with an uppercase letter, e.g. String.

Attempting to assign a primitive variable a value of null will result in a compile time error 
```
//Throws compile time error stating the required type is int, but null was provided
int number = null;
```
```
//No error will occur as the String variable str is nullable
String str = null;
```
Integer id = null;   // ✔️ Valid
int id2 = null;      // ❌ Compilation error
Because Integer is a reference type, it behaves just like any other object reference — meaning it can point to nothing (null).
## class
You can think of a class as a template for creating instances of that class. To create an instance of a class (also known as an object), the new keyword is used:
```
class Car {
}

// Create two car instances
Car myCar = new Car();
Car yourCar = new Car();
```
## Randomness
An instance of the java.util.Random class can be used to generate random numbers in Java.
```
Random random = new Random();
random.nextInt();
// => -1169335537

Random random = new Random();
random.nextInt(10);
// => 6

//generate a random number from 10 through 19.
Random random = new Random();
10 + random.nextInt(10);
// => 11
```
A random double can be generated using the nextDouble() method. This will generate a value in the range from 0.0 to 1.0.
```
Random random = new Random();

random.nextDouble();
// => 0.19250004204021398
```
## List methods
```
List<String> fruits = new ArrayList<>();
fruits.add("Apple");
fruits.remove("Apple");
fruits.contains("Apple");
fruits.size();

