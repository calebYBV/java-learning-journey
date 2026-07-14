# Console Snake Matrix

A simple Java console game created to practice two-dimensional arrays, loops, methods, input validation and matrix manipulation.

## Project Description

This program implements a simplified version of the Snake game using a 9 × 9 matrix displayed in the console.

The matrix represents:

* `#` as a wall.
* `+` as an empty space.
* `@` as food.
* Numbers as the different parts of the snake.

The player controls the snake using the keyboard:

* `W` to move up.
* `S` to move down.
* `A` to move left.
* `D` to move right.

Every time the snake eats food, its length increases and the food appears in another available position.

The game ends when the snake collides with a wall or with its own body. The player wins when the snake reaches the defined target length.

## Expected Output

```text
# # # # # # # # #
# + + + + + + + #
# + + + @ + + + #
# + + + + + + + #
# + + 2 1 0 + + #
# + + + + + + + #
# + + + + + + + #
# + + + + + + + #
# # # # # # # # #

Enter movement: W
```

The exact position of the snake and food can change during the game.

## How It Works

The program creates a two-dimensional character array with 9 rows and 9 columns.

Two nested loops traverse every position in the matrix:

* The outer loop traverses the rows.
* The inner loop traverses the columns.

The positions located on the borders of the matrix are filled with walls:

```text
#
```

The internal positions are initialized as empty spaces:

```text
+
```

The snake is placed inside the playable area and its position is updated according to the movement entered by the player.

Before moving the snake, the program calculates the next row and column and verifies that the new position is valid.

The program checks whether the snake:

* Collided with a wall.
* Collided with its own body.
* Reached the food.
* Reached the target length.

When the snake eats, its length increases and new food is generated in an empty position.

The game continues inside a loop until the player wins or loses.

## Concepts Practiced

* Two-dimensional arrays
* Matrix creation and initialization
* Rows and columns
* Array indexes
* Matrix traversal
* Nested loops
* Conditional statements
* Character data type
* Console input with `Scanner`
* Input validation
* Game loops
* Methods and parameters
* Return values
* Coordinate systems
* Boundary validation
* Position calculation
* Matrix updates
* Random number generation
* Collision detection
* Snake movement
* Snake growth
* Win and loss conditions
* Algorithm design
* Pseudocode
* Problem decomposition

## Project Restrictions

This version was developed without using:

* Graphical interfaces
* `JOptionPane`
* Inheritance
* Advanced collections
* External game libraries
* Multiple game windows
* Game engines

The project focuses on matrices, loops, conditionals, methods and console interaction.

## Technologies

* Java
* Apache NetBeans
* Git
* GitHub

## Project Structure

```text
02-console-snake-matrix/
├── README.md
└── src/
    └── consolesnakematrix/
        └── ConsoleSnakeMatrix.java
```

## Learning Objective

The main objective of this project is to understand how to create and update a two-dimensional array while developing a simple console game.

The project also practices coordinate management, movement calculation, input validation, collision detection, methods and game-state control.

## Status

Completed.
