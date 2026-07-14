# Multilingual Study Planner

A Java Swing desktop application created to practice graphical user interfaces, selection components, event handling, validation, internationalization, accessibility and usability.

## Project Description

This application allows users to create a personalized study session through a graphical interface.

The user can select:

- A subject from a drop-down list.
- One or more study activities.
- A difficulty level.
- The duration of the study session.
- The interface language: Spanish or English.

After validating the selected information, the application generates and displays a summary of the study plan.

The interface includes a menu bar, a toolbar, labels, text fields, selection components, buttons and messages available in Spanish and English.

## Expected Interface

```text
┌────────────────────────────────────────────────────────┐
│ File   Language   Help                                 │
├────────────────────────────────────────────────────────┤
│ [ New Plan ] [ Clear ] [ ES / EN ]                     │
├────────────────────────────────────────────────────────┤
│             Multilingual Study Planner                 │
│                                                        │
│ Subject:       [ Mathematics                 ▼ ]       │
│                                                        │
│ Activities:    ☑ Read                                  │
│                ☑ Practice exercises                    │
│                ☐ Watch a video                         │
│                                                        │
│ Difficulty:    ○ Easy   ● Medium   ○ Hard              │
│                                                        │
│ Duration:      [ 60             ] minutes              │
│                                                        │
│              [ Create Plan ] [ Clear ]                 │
│                                                        │
│ Study Plan Summary                                     │
│ ┌────────────────────────────────────────────────────┐ │
│ │ Subject: Mathematics                               │ │
│ │ Activities: Read, Practice exercises               │ │
│ │ Difficulty: Medium                                 │ │
│ │ Duration: 60 minutes                               │ │
│ └────────────────────────────────────────────────────┘ │
└────────────────────────────────────────────────────────┘
```

The exact appearance depends on the layout managers and component configuration selected during development.

## How It Works

The project separates the study-plan data from the graphical interface.

The `StudyPlannerFrame` class creates and organizes Swing components such as:

```text
JFrame
JPanel
JLabel
JTextField
JComboBox
JCheckBox
JRadioButton
ButtonGroup
JButton
JTextArea
JMenuBar
JToolBar
```

A `JComboBox` allows the user to select one subject.

Several `JCheckBox` components allow the user to select multiple study activities.

The difficulty level is represented with `JRadioButton` components placed inside a `ButtonGroup`, ensuring that only one difficulty level can be selected at a time.

A text field receives the duration of the study session.

When the user presses the create-plan button, the application:

1. Reads the selected subject.
2. Reads all selected activities.
3. Identifies the selected difficulty level.
4. Reads the duration.
5. Validates the entered information.
6. Creates the study-plan summary.
7. Displays the result in the interface.

The interface language can be changed between Spanish and English. When the language changes, visible labels, buttons, menu options and messages are updated.

The final version can use `ResourceBundle` to organize translated texts separately from the Java source code.

## Concepts Practiced

- Graphical User Interfaces
- Java Swing
- `JFrame`
- `JPanel`
- `JLabel`
- `JTextField`
- `JButton`
- `JComboBox`
- `JCheckBox`
- `JRadioButton`
- `ButtonGroup`
- `JMenuBar`
- `JMenu`
- `JMenuItem`
- `JToolBar`
- `JTextArea`
- `JOptionPane`
- Layout managers
- Event-driven programming
- `ActionListener`
- Item selection events
- Input validation
- String-to-number conversion
- Exception handling
- Interface state updates
- Study-plan generation
- Separation of interface and data
- Internationalization
- Localization
- `ResourceBundle` basics
- Language switching
- Accessibility basics
- Keyboard navigation
- Tooltips
- Usability principles
- Problem decomposition
- Modular interface development

## Project Restrictions

This version was developed without using:

- Visual GUI designers
- Automatically generated interface code
- Databases
- Files for storing study plans
- External frameworks
- External interface libraries
- Web services
- Advanced collections

The project focuses on Java Swing, selection components, events, validation, internationalization, accessibility and usability.

## Technologies

- Java
- Java Swing
- Apache NetBeans
- Git
- GitHub

## Project Structure

```text
07-multilingual-study-planner/
├── README.md
└── src/
    └── multilingualstudyplanner/
        ├── MultilingualStudyPlanner.java
        ├── StudyPlannerFrame.java
        └── StudyPlan.java
```

## Learning Objective

The main objective of this project is to understand how different Java Swing components can work together to collect information and generate a useful result.

The project also practices event handling, form validation, component organization, interface translation, accessibility considerations and separation between graphical components and study-plan data.

## Status

Completed.
