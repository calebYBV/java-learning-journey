# Cinema Seat Manager

A Java console project created to practice two-dimensional arrays through a simple cinema seat reservation system.

## Project Description

This program represents a cinema room using a two-dimensional integer array.

Each position in the matrix represents a seat:

* `0` means the seat is available.
* `1` means the seat is occupied.

The user interacts with the program through a console menu. The program allows the user to view the cinema room, reserve seats, cancel reservations, check the status of individual seats, and count available or occupied seats.

## Main Menu

The program will include the following options:

```text
1. View cinema room
2. Reserve a seat
3. Cancel a reservation
4. Check seat status
5. Count available and occupied seats
6. Exit
```

## Main Features

### View Cinema Room

Displays the complete cinema room, showing the current status of every seat.

### Reserve a Seat

Allows the user to select a seat by entering its row and column.

The reservation is completed only when the selected seat is available.

### Cancel a Reservation

Allows the user to cancel an existing reservation by entering the row and column of an occupied seat.

### Check Seat Status

Shows whether a specific seat is available or occupied.

### Count Seats

Counts and displays:

* The number of available seats.
* The number of occupied seats.
* The total number of seats in the cinema room.

## Concepts Practiced

This project is designed to practice the following Java concepts:

* Two-dimensional arrays.
* Nested loops.
* Conditional structures.
* `while` and `do-while` loops.
* Console input using `Scanner`.
* Menu-based programs.
* Matrix traversal.
* Data validation.
* Counters.
* Methods and code organization.

## Seat Representation

The cinema room uses the following numerical representation:

```text
0 = Available seat
1 = Occupied seat
```

Example:

```text
0 0 1 0 0
0 1 1 0 0
0 0 0 0 1
1 0 0 0 0
```

## Project Status

**Completed**
