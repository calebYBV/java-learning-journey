# Character Battle Simulator

A simple Java console project created to practice the fundamental concepts of Object-Oriented Programming.

## Project Description

This program simulates a simple turn-based battle between two characters.

Each character has:

- A name.
- Health points.
- Attack points.
- Defense points.

Each character can:

- Display its information.
- Attack another character.
- Receive damage.
- Recover health.
- Indicate whether it has been defeated.

The program creates two character objects and makes them fight in turns until one of them loses all its health points.

## Expected Output

```text
Character 1
Name: Knight
Health: 100
Attack: 25
Defense: 10

Character 2
Name: Warrior
Health: 120
Attack: 20
Defense: 8

Knight attacks Warrior.
Warrior receives 17 damage.

Warrior attacks Knight.
Knight receives 10 damage.

Knight Health: 90
Warrior Health: 103
```

The exact values and battle result depend on the characters created in the program.

## How It Works

The project contains a `Character` class that represents the characters participating in the battle.

The class stores the state of each character through attributes such as:

```text
name
health
attack
defense
```

A constructor receives the initial information and assigns it to the attributes of each new object.

The class also contains methods responsible for actions such as:

- Displaying character information.
- Attacking another character.
- Receiving damage.
- Recovering health.
- Checking whether the character has been defeated.

When one character attacks another, the attacker interacts directly with the target object.

The damage can be calculated using the attacker's attack points and the defender's defense points:

```text
damage = attacker attack - target defense
```

The target character then updates its health according to the received damage.

The main class creates two character objects and controls the battle turns until one character is defeated.

## Concepts Practiced

- Object-Oriented Programming
- Classes and objects
- Attributes
- Instance methods
- Method parameters
- Constructors
- The `this` keyword
- Object initialization
- Encapsulation basics
- Interaction between objects
- Passing objects as parameters
- Conditional statements inside methods
- Arithmetic operations
- Object state
- Updating object attributes
- Boolean return values
- Console output
- Turn-based logic
- Battle simulation
- Problem decomposition
- Class responsibilities

## Project Restrictions

This version was developed without using:

- Graphical interfaces
- `JOptionPane`
- Inheritance
- Interfaces
- Abstract classes
- Advanced collections
- External libraries
- Game engines

The project focuses on classes, objects, attributes, constructors, methods, parameters and interaction between objects.

## Technologies

- Java
- Apache NetBeans
- Git
- GitHub

## Project Structure

```text
04-character-battle-simulator/
├── README.md
└── src/
    └── characterbattlesimulator/
        ├── Character.java
        └── CharacterBattleSimulator.java
```

## Learning Objective

The main objective of this project is to understand how a class defines the attributes and behaviors shared by different objects.

The project also practices object creation, constructors, the `this` keyword, parameters, object interaction, state modification and conditional statements inside methods.

## Status

Completed.
