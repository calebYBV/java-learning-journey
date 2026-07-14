# Digital Wallet

A simple Java console project created to practice encapsulation, static members, method overloading, data validation and interaction between objects.

## Project Description

This program simulates a basic digital wallet system.

Each wallet has:

- An owner.
- An identifier.
- A private balance.
- An active or blocked status.

The program allows users to:

- Create wallets.
- Check the current balance.
- Deposit money.
- Withdraw money.
- Transfer money between wallets.
- Block and unblock a wallet.
- Count how many wallets have been created.
- Validate invalid financial operations.

The balance cannot be modified directly from outside the wallet class. It can only change through controlled operations such as deposits, withdrawals and transfers.

## Expected Output

```text
Wallet created successfully.

Owner: Caleb
Identifier: WALLET-001
Status: Active
Balance: 100000.0

Deposit completed.
New balance: 150000.0

Transfer completed.
Transferred amount: 30000.0
Current balance: 120000.0

Total wallets created: 2
```

The exact owners, identifiers, balances and operation results depend on the objects created in the program.

## How It Works

The project contains a `Wallet` class that represents an individual digital wallet.

The class stores information such as:

```text
owner
identifier
balance
active status
```

Encapsulation is used to protect the internal state of each wallet.

The balance is private and does not have a public setter. It can only be modified through validated methods responsible for:

- Depositing money.
- Withdrawing money.
- Transferring money.
- Receiving a transfer.

Before changing the balance, each operation validates conditions such as:

- The amount must be greater than zero.
- The wallet must be active.
- A withdrawal cannot exceed the available balance.
- A transfer requires a valid destination wallet.
- The origin and destination wallets cannot be the same object.

A static attribute stores the total number of wallets created. Since this information belongs to the entire class and not to a single wallet, it is shared by all wallet objects.

Method overloading is used to provide more than one version of an operation using different parameter lists.

The main class creates wallet objects and demonstrates deposits, withdrawals, transfers, wallet blocking and the total wallet count.

## Concepts Practiced

- Object-Oriented Programming
- Encapsulation
- Access modifiers
- Private attributes
- Public methods
- Getters
- Controlled setters
- Constructors
- The `this` keyword
- Static attributes
- Static methods
- Instance attributes
- Instance methods
- Method overloading
- Method parameters
- Return values
- Data validation
- Object state
- Interaction between objects
- Passing objects as parameters
- Arithmetic operations
- Conditional statements
- Boolean values
- Transaction validation
- Problem decomposition
- Class responsibilities

## Project Restrictions

This version was developed without using:

- Graphical interfaces
- `JOptionPane`
- Databases
- Files
- Inheritance
- Interfaces
- Abstract classes
- Advanced collections
- External libraries

The project focuses on encapsulation, constructors, methods, static members, overloading, validation and interaction between objects.

## Technologies

- Java
- Apache NetBeans
- Git
- GitHub

## Project Structure

```text
05-digital-wallet/
├── README.md
└── src/
    └── digitalwallet/
        ├── Wallet.java
        └── DigitalWallet.java
```

## Learning Objective

The main objective of this project is to understand how encapsulation protects the internal state of an object.

The project also practices the difference between instance members and static members, controlled modification of private attributes, method overloading, validation of financial operations and interaction between wallet objects.

## Status

Completed.
