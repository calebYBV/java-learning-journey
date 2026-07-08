# Reverse Diagonal Matrix

A simple Java console project created to practice the use of two-dimensional arrays.

## Project Description

This program creates a 9 × 9 integer matrix and places the numbers from 1 to 9 along a reverse diagonal.

The number 1 starts in the upper-right corner, and the number 9 ends in the lower-left corner. All remaining positions contain zero.

## Expected Output

```text
0 0 0 0 0 0 0 0 1
0 0 0 0 0 0 0 2 0
0 0 0 0 0 0 3 0 0
0 0 0 0 0 4 0 0 0
0 0 0 0 5 0 0 0 0
0 0 0 6 0 0 0 0 0
0 0 7 0 0 0 0 0 0
0 8 0 0 0 0 0 0 0
9 0 0 0 0 0 0 0 0
```

## How It Works

The program creates a two-dimensional integer array with 9 rows and 9 columns.

It uses two nested `for` loops to visit every position in the matrix:

- The outer loop traverses the rows.
- The inner loop traverses the columns.

A position belongs to the reverse diagonal when:

```java
row + column == 8
```

When this condition is true, the program stores a number from 1 to 9:

```java
matriz[row][column] = row + 1;
```

The remaining positions keep their default value of zero.

Finally, another pair of nested `for` loops prints the complete matrix in the console.

## Concepts Practiced

- Two-dimensional arrays
- Rows and columns
- Array indexes
- Nested `for` loops
- Conditional statements
- Matrix traversal
- Console output

## Project Restrictions

This version was developed without using:

- Custom methods
- `Scanner`
- `JOptionPane`
- Additional classes
- Graphical interfaces

All the program logic is written inside the `main` method.

## Technologies

- Java
- Apache NetBeans
- Git
- GitHub

## Project Structure

```text
01-reverse-diagonal-matrix/
├── README.md
└── src/
    └── reversediagonalmatrix/
        └── ReverseDiagonalMatrix.java
```

## Learning Objective

The main objective of this project is to understand how to create, traverse and modify a two-dimensional array using rows, columns, indexes and nested loops.

## Status

Completed.
