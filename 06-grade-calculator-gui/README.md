# Grade Calculator

A simple Java Swing application created to practice graphical user interfaces, event handling, input validation and separation between interface and logic.

## Project Description

This application calculates a student's average grade using three or more grades entered through a graphical interface.

The application contains:

- A main window.
- Labels that identify each grade.
- Text fields for entering grades.
- A button for calculating the average.
- An area for displaying the result.
- A message indicating whether the student passed or failed.
- A button for clearing the form.
- Validations for empty fields, letters and grades outside the allowed range.

The interface is created manually using Java Swing components and layout managers, without visual designers or automatically generated code.

## Expected Interface

```text
┌──────────────────────────────────────┐
│          Grade Calculator            │
├──────────────────────────────────────┤
│ Grade 1:  [                    ]     │
│ Grade 2:  [                    ]     │
│ Grade 3:  [                    ]     │
│                                      │
│ Average:  [ Result ]                 │
│ Status:   Passed / Failed            │
│                                      │
│        [ Calculate ] [ Clear ]       │
└──────────────────────────────────────┘
```

The exact appearance depends on the layout managers and component configuration selected during development.

## How It Works

The project separates the graphical interface from the grade-calculation logic.

The `GradeCalculatorFrame` class creates and organizes Swing components such as:

```text
JFrame
JPanel
JLabel
JTextField
JButton
```

Layout managers are used to control the position and organization of the components.

When the user presses the calculate button, an event is triggered through an `ActionListener`.

The application then:

1. Reads the text from each grade field.
2. Verifies that no field is empty.
3. Converts the text values into numbers.
4. Handles invalid text that cannot be converted.
5. Verifies that each grade is inside the permitted range.
6. Calculates the average.
7. Determines whether the student passed or failed.
8. Updates the interface with the result.

The clear button removes the entered grades and resets the displayed result.

The calculation logic is kept separate from the interface so that it can be tested and understood independently.

## Concepts Practiced

- Graphical User Interfaces
- Java Swing
- `JFrame`
- `JPanel`
- `JLabel`
- `JTextField`
- `JButton`
- `JOptionPane`
- Layout managers
- `BorderLayout`
- `GridLayout`
- `GridBagLayout`
- `FlowLayout`
- Event-driven programming
- `ActionListener`
- Button click events
- Reading text field values
- String-to-number conversion
- `Double.parseDouble`
- Input validation
- Exception handling
- `NumberFormatException`
- Conditional statements
- Arithmetic operations
- Average calculation
- Component state updates
- Clearing form fields
- Separation of interface and logic
- Methods and parameters
- User experience basics
- Problem decomposition

## Project Restrictions

This version was developed without using:

- Visual GUI designers
- Automatically generated interface code
- Databases
- Files
- External libraries
- Advanced collections
- Multiple application windows
- Web services

The project focuses on Swing components, layout managers, events, validation and separation between interface and logic.

## Technologies

- Java
- Java Swing
- Apache NetBeans
- Git
- GitHub

## Project Structure

```text
06-grade-calculator/
├── README.md
└── src/
    └── gradecalculator/
        ├── GradeCalculator.java
        ├── GradeCalculatorFrame.java
        └── GradeCalculatorLogic.java
```

## Learning Objective

The main objective of this project is to understand how to build a basic graphical interface using Java Swing.

The project also practices organizing components with layout managers, responding to button events, converting text into numbers, validating user input, handling conversion errors and separating calculation logic from interface code.

## Status

Completed.
