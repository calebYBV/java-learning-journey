# Console Snake Matrix

A simple Java console game created to practice two-dimensional arrays, loops, conditionals, methods, input validation, coordinate management and matrix manipulation.

## Project Description

This project implements a simplified version of the Snake game using a **15 × 20 matrix** displayed entirely in the console.

The matrix represents:

- `#` as a wall.
- `+` as an empty space.
- `$` as food.
- Numbers as the different parts of the snake.

The snake starts with only one part:

```text
0
```

The number `0` always represents the snake's head.

Every time the snake eats, a new numbered body part is added behind the head:

```text
Length 1: 0
Length 2: 1 0
Length 3: 2 1 0
Length 4: 3 2 1 0
```

The body continues increasing numerically after `9`:

```text
10 9 8 7 6 5 4 3 2 1 0
```

Therefore:

- `0` is always the head.
- `1` is the first body segment.
- The highest number represents the tail.

The player controls the snake using:

- `W` to move up.
- `S` to move down.
- `A` to move left.
- `D` to move right.

Lowercase versions of these controls may also be accepted.

Every time the snake eats:

- Its length increases by one.
- A new numbered body segment is added.
- The food appears in another empty position.
- The matrix is updated.
- The game checks for collisions and victory.

The player loses when the snake collides with:

- A wall.
- Its own body.

The player wins when the snake occupies the entire playable area inside the walls.

## Board Dimensions

The complete matrix contains:

```text
15 rows × 20 columns
```

Because the outer border is occupied by walls, the playable area contains:

```text
13 rows × 18 columns
```

The maximum playable area is therefore:

```text
234 positions
```

The player wins when the snake reaches a length of `234`.

## Expected Initial Output

```text
# # # # # # # # # # # # # # # # # # # #
# + + + + + + + + + + + + + + + + + + #
# + + + + + + + + + + + + + + + + + + #
# + + + + + + + + + + + + + + + + + + #
# + + + + + + + + + + + + + $ + + + + #
# + + + + + + + + + + + + + + + + + + #
# + + + + + + + + + + + + + + + + + + #
# + + + + + + + + + 0 + + + + + + + + #
# + + + + + + + + + + + + + + + + + + #
# + + + + + + + + + + + + + + + + + + #
# + + + + + + + + + + + + + + + + + + #
# + + + + + + + + + + + + + + + + + + #
# + + + + + + + + + + + + + + + + + + #
# + + + + + + + + + + + + + + + + + + #
# # # # # # # # # # # # # # # # # # # #

Enter movement: W
```

The exact position of the snake and food may change during the game.

## How It Works

The program uses a two-dimensional `String` array:

```java
String[][] dashboard = new String[15][20];
```

A `String` matrix is used instead of a `char` matrix because the snake can contain values with more than one digit, such as:

```text
10
11
12
```

A single `char` cannot store a complete multi-digit value.

### Board Creation

Two nested loops traverse every position in the matrix:

- The outer loop traverses the rows.
- The inner loop traverses the columns.

The positions located on the outer borders are filled with:

```text
#
```

The internal positions are initialized with:

```text
+
```

### Initial Snake Position

The snake begins near the center of the playable area.

Its initial position contains:

```text
0
```

The initial coordinates can be represented as:

```text
Row: 7
Column: 10
```

### Movement Reading

The program reads the player's direction from the console using `Scanner`.

The input method returns one movement character:

```text
W
S
A
D
```

### Position Calculation

Before modifying the matrix, the program calculates the position the snake is trying to enter.

The new position contains two values:

```text
new_position[0] → new row
new_position[1] → new column
```

The movement rules are:

```text
W → row decreases by 1
S → row increases by 1
A → column decreases by 1
D → column increases by 1
```

### Position Validation

Before moving, the program checks the content of the destination position.

The movement is invalid when the destination contains:

```text
#
```

or a number representing another part of the snake.

The movement is valid when the destination contains:

```text
+
```

or:

```text
$
```

### Snake Movement

When the movement is valid:

1. The new head position becomes `0`.
2. Each existing snake segment increases its value by one.
3. The previous tail position becomes an empty space when the snake has not eaten.
4. The matrix is updated.
5. The updated board is displayed again.

Conceptually:

```text
Before moving:

2 1 0 +

After moving right:

+ 2 1 0
```

### Food Detection

When the new head position contains:

```text
$
```

the snake eats the food.

The program then:

1. Keeps the previous tail instead of removing it.
2. Increases the snake's length by one.
3. Generates new food in another empty position.
4. Updates the matrix.

### Food Generation

The food must only appear in a position containing:

```text
+
```

It cannot appear:

- On a wall.
- On the snake's head.
- On the snake's body.
- Outside the matrix.

Random row and column values are generated until a valid empty position is found.

### Collision Detection

The game ends in defeat when the next position contains:

```text
#
```

or any numeric value belonging to the snake.

This prevents the snake from:

- Crossing walls.
- Moving outside the playable area.
- Passing through its own body.

### Victory Detection

The game checks the snake's length after every successful movement and every food consumption.

The player wins when the snake occupies all `234` playable positions.

## Planned Method Organization

Each method should have one clear responsibility.

```text
create_dashboard
    Creates walls and empty spaces.

show_dashboard
    Displays the matrix in the console.

place_snake
    Places the initial snake head.

control_panel
    Reads and validates W, A, S or D.

control_action
    Calculates the next row and column.

valid_place
    Checks whether the destination is valid.

move_snake
    Updates the snake's position.

place_food
    Generates food in an empty position.

detect_food
    Checks whether the head reached the food.

grow_snake
    Increases the snake's length.

detect_defeat
    Checks for wall or body collisions.

detect_victory
    Checks whether the playable area is full.
```

The complete game logic follows this general order:

```text
Create the matrix.
Create the board.
Place the initial snake.
Place the first food.

While the player has not won or lost:

    Show the board.
    Read the movement.
    Calculate the new position.
    Validate the new position.

    If the position is invalid:
        End the game as a defeat.

    Otherwise:
        Detect whether the position contains food.
        Move the snake.

        If food was eaten:
            Grow the snake.
            Generate new food.

        Check the victory condition.
```

## Development Phases

The project is divided into small phases:

1. Create and display the board.
2. Place the initial snake head.
3. Read the player's movement.
4. Calculate the new position.
5. Validate walls and limits.
6. Move the snake.
7. Place and detect food.
8. Grow the snake.
9. Detect defeat.
10. Detect victory.

Each phase is developed and tested before continuing to the next one.

## Concepts Practiced

- Two-dimensional arrays
- `String[][]` matrices
- Matrix creation and initialization
- Rows and columns
- Array indexes
- Matrix traversal
- Nested loops
- Conditional statements
- `switch` statements
- Console input with `Scanner`
- Character input
- Input validation
- Game loops
- Methods
- Parameters
- Return values
- One-dimensional arrays
- Coordinate systems
- Boundary validation
- Position calculation
- Matrix searching
- Matrix updates
- Random number generation
- Collision detection
- Snake movement
- Snake growth
- Food generation
- Win and loss conditions
- Game-state control
- Algorithm design
- Pseudocode
- Problem decomposition
- Manual testing
- Desk checking

## Project Restrictions

This version is developed without using:

- Graphical interfaces
- Java Swing
- `JOptionPane`
- Inheritance
- Polymorphism
- Advanced collections
- External game libraries
- Multiple game windows
- Game engines

The project focuses primarily on:

- Matrices
- Loops
- Conditionals
- Methods
- Parameters
- Validation
- Console interaction
- Structured problem-solving

## Technologies

- Java
- Apache NetBeans
- Git
- GitHub

## Project Structure

```text
02-console-snake-matrix/
├── README.md
└── src/
    └── consolesnakematrix/
        └── ConsoleSnakeMatrix.java
```

## Learning Objective

The main objective of this project is to understand how to create, traverse, search and update a two-dimensional matrix while developing a functional console game.

The project also practices:

- Coordinate management.
- Movement calculation.
- Input validation.
- Boundary validation.
- Collision detection.
- Sequential body numbering.
- Random food generation.
- Methods and parameters.
- Return values.
- Game-state control.
- Algorithm organization.
- Problem decomposition.

This project serves as an integrative exercise for the study of two-dimensional arrays.

## Status

In development.
