# ☕ Java Basic Problem Solving

A collection of **50 beginner-friendly Java programming problems** for practicing fundamental problem-solving skills.

This repository covers:

- Basic Input/Output
- Arithmetic Operations
- Conditional Statements
- Loops
- Series
- Number Problems
- Arrays

The goal of this repository is to strengthen my **Java fundamentals and problem-solving skills** through regular practice.

---

## 📚 Problem List

### 🔹 Basic Problems

| No. | Problem |
|---|---|
| 01 | Sum of Two Numbers |
| 02 | Difference of Two Numbers |
| 03 | Product of Two Numbers |
| 04 | Average of Two Numbers |
| 05 | Area of a Rectangle |
| 06 | Celsius to Fahrenheit |
| 07 | Odd or Even |
| 08 | Positive, Negative or Zero |
| 09 | Greater Number |
| 10 | Largest of Three Numbers |

### 🔁 Loop Problems

| No. | Problem |
|---|---|
| 11 | Print 1 to N |
| 12 | Print N to 1 |
| 13 | Even Numbers from 1 to N |
| 14 | Odd Numbers from 1 to N |
| 15 | Sum from 1 to N |
| 16 | Sum of Even Numbers |
| 17 | Sum of Odd Numbers |
| 18 | Multiplication Table |
| 19 | Factorial |

### 📈 Series Problems

| No. | Problem |
|---|---|
| 20 | Fibonacci Series |
| 21 | Sum of Squares |
| 22 | Sum of Cubes |
| 23 | Simple Series |
| 24 | Fraction Series |
| 25 | Alternating Series |

### 🔢 Number Problems

| No. | Problem |
|---|---|
| 26 | Sum of Digits |
| 27 | Count Digits |
| 28 | Reverse a Number |
| 29 | Palindrome Number |
| 30 | Prime Number |
| 31 | Print Prime Numbers |
| 32 | Armstrong Number |
| 33 | Divisible by 5 |
| 34 | Divisible by 5 and 11 |
| 35 | GCD of Two Numbers |
| 36 | LCM of Two Numbers |
| 37 | Power of a Number |
| 38 | Product of Digits |
| 39 | First and Last Digit |
| 40 | Sum of First and Last Digit |

### 🔀 Conditional Problems

| No. | Problem |
|---|---|
| 41 | Leap Year |
| 42 | Vowel or Consonant |
| 43 | Uppercase or Lowercase |
| 44 | Pass or Fail |
| 45 | Grade Calculator |

### 📦 Array Problems

| No. | Problem |
|---|---|
| 46 | Sum of Array |
| 47 | Maximum Array Element |
| 48 | Minimum Array Element |
| 49 | Count Odd and Even Array Elements |
| 50 | Reverse an Array |

---

## 🧠 Important Concepts

### Getting the Last Digit

```java
int digit = n % 10;
```

Example:

```text
1234 % 10 = 4
```

The modulo operator `% 10` gives us the **last digit** of an integer.

### Removing the Last Digit

```java
n = n / 10;
```

Example:

```text
1234 / 10 = 123
```

Since `n` is an integer, Java removes the decimal portion.

These two operations are very useful for problems such as:

- Sum of Digits
- Count Digits
- Reverse Number
- Palindrome Number
- Armstrong Number
- Product of Digits
- First and Last Digit

---

## 💻 Example — Sum of Digits

### Problem

Read an integer `N` and calculate the sum of its digits.

### Input

```text
1234
```

### Output

```text
SUM = 10
```

### Java Solution

```java
import java.util.Scanner;

public class no26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        while(n > 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }

        System.out.println("SUM = " + sum);

        sc.close();
    }
}
```

### How It Works

For:

```text
n = 1234
```

The program performs:

| n | `n % 10` | sum | `n / 10` |
|---:|---:|---:|---:|
| 1234 | 4 | 4 | 123 |
| 123 | 3 | 7 | 12 |
| 12 | 2 | 9 | 1 |
| 1 | 1 | 10 | 0 |

Therefore:

```text
1 + 2 + 3 + 4 = 10
```

---

## 🛠️ Technologies

- **Language:** Java
- **JDK:** Java Development Kit
- **IDE/Editor:** VS Code
- **Version Control:** Git & GitHub

---

## 🎯 Learning Goals

Through these problems, I am practicing:

- Java syntax
- Variables and data types
- `Scanner` for user input
- Arithmetic and logical operators
- `if`, `else if`, and `else`
- `for` and `while` loops
- Number manipulation
- Series generation
- Arrays
- Basic algorithmic thinking

---

## 🚀 Progress

```text
Basic Problems       [01–10]  ✅
Loop Problems        [11–19]  ✅
Series Problems      [20–25]  🚧
Number Problems      [26–40]  🚧
Conditional Problems [41–45]  ⏳
Array Problems       [46–50]  ⏳
```

---

## 📌 Purpose

This repository is part of my journey to build a strong foundation in **Java programming, problem solving, and Object-Oriented Programming (OOP)**.

I will continue adding solutions as I progress through the problems.

---

### ⭐ Practice → Understand → Code → Repeat
