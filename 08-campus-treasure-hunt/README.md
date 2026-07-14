# Campus Treasure Hunt

A Java project created to integrate two-dimensional arrays, structured programming, Object-Oriented Programming and Java Swing through a simple university treasure-hunt game.

## Project Description

Campus Treasure Hunt is a local game in which the player explores a university campus represented by a two-dimensional matrix.

The map can contain:

- `#` for obstacles.
- `+` for available paths.
- `J` for the player.
- `P` for clues.
- `T` for the treasure.

The player moves through the map, searches for clues, answers riddles and attempts to reach the hidden treasure.

The project is developed progressively. The first version works entirely in the console. Graphical interface components are introduced only after the game logic works correctly.

## Expected Console Output

```text
# # # # # # # # #
# J + + # + + + #
# + # + # + # + #
# + + + + + # + #
# # # + # + + + #
# + + + + # + # #
# + # # + + + + #
# + + + # + + + #
# # # # # # # # #

Move with W, A, S or D:
```

In later versions, clues and the treasure will be added to the map.

## Map Symbols

```text
# = Obstacle
+ = Available path
J = Player
P = Clue
T = Treasure
```

## How It Works

The campus map is represented by a two-dimensional character array.

Each position in the matrix represents one location on the campus.

The program stores the player's current row and column. When the player enters a movement, the program calculates a possible new position.

Before updating the map, the program verifies that:

- The movement is valid.
- The new position is inside the matrix.
- The destination is not an obstacle.
- The destination can be entered.

If the movement is valid, the previous position becomes an available path and the new position receives the player symbol.

Later versions introduce clues, riddles, treasure discovery, object-oriented classes, victory and defeat conditions, Java Swing and language switching.

## Development Versions

### Version 1: Console Map and Player Movement

- Create the matrix.
- Display the campus map.
- Place the player.
- Read movement commands.
- Validate boundaries and obstacles.
- Update the player's position.

### Version 2: Clues and Riddles

- Place clues on the map.
- Detect when a clue is found.
- Display a riddle.
- Validate the player's answer.

### Version 3: Classes and Objects

- Create the `Player` class.
- Create the `GameMap` class.
- Create the `Clue` class.
- Create the `Treasure` class.
- Create the `Game` class.
- Separate responsibilities between objects.

### Version 4: Victory and Defeat Conditions

- Detect treasure discovery.
- Require collected clues when appropriate.
- Add victory conditions.
- Add defeat or attempt-limit conditions.
- Display the final result.

### Version 5: Basic Graphical Interface

- Create a Java Swing window.
- Display the map graphically.
- Add movement buttons.
- Add fields for answers.
- Handle interface events.
- Connect the interface to the existing game logic.

### Version 6: Menus, Accessibility and Languages

- Add a menu bar.
- Add game controls.
- Add Spanish and English texts.
- Improve keyboard navigation.
- Add tooltips and accessible descriptions.
- Improve readability and usability.

## Concepts Practiced

- Two-dimensional arrays
- Matrix creation and traversal
- Rows and columns
- Coordinate systems
- Nested loops
- Conditional statements
- Game loops
- Methods and parameters
- Return values
- Console input
- Input validation
- Boundary checking
- Obstacle detection
- Matrix updates
- Classes and objects
- Attributes
- Constructors
- Encapsulation
- Interaction between objects
- Static members
- Method overloading
- Object state
- Win and loss conditions
- Java Swing
- Event-driven programming
- Buttons and text fields
- Menu bars
- Internationalization
- Language switching
- Accessibility basics
- Usability principles
- Incremental development

## Project Restrictions

This project is developed without using:

- GPS
- QR codes
- Internet connections
- Databases
- External frameworks
- External game libraries
- Game engines
- Automatically generated GUI code
- Visual interface designers

The project focuses on Java fundamentals, Object-Oriented Programming and basic Java Swing.

## Technologies

- Java
- Java Swing
- Apache NetBeans
- Git
- GitHub

## Initial Project Structure

```text
08-campus-treasure-hunt/
├── README.md
└── src/
    └── campustreasurehunt/
        └── CampusTreasureHunt.java
```

## Planned Final Structure

```text
08-campus-treasure-hunt/
├── README.md
└── src/
    └── campustreasurehunt/
        ├── CampusTreasureHunt.java
        ├── Game.java
        ├── GameMap.java
        ├── Player.java
        ├── Clue.java
        ├── Treasure.java
        └── CampusTreasureHuntFrame.java
```

## Learning Objective

The main objective of this project is to integrate the Java concepts studied in previous projects into one progressively developed application.

The project practices matrix manipulation, movement validation, algorithm design, methods, Object-Oriented Programming, interaction between objects, Java Swing, event handling, internationalization, accessibility and usability.

## Status

In Development.
