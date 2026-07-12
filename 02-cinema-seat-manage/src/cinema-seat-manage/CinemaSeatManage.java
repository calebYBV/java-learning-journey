package cinemaseatmanage;

import java.util.Scanner;

public class Cinemaseatmanage {

    public static void main(String[] args) {
        int seats[][] = new int[5][8];
        int row, column, option, selectedRow, selectedColumn, avaliableSeats, occupiedSeats;
        String row_text, column_text;
        Scanner mem = new Scanner(System.in);
        selectedRow = 0;
        selectedColumn = 0;
        row = 0;
        column = 0;
        do {
            System.out.println("Select an option\n"
                    + "1. View theater\n"
                    + "2. Reserve a seat\n"
                    + "3. Cancel reservation\n"
                    + "4. Check seat availability\n"
                    + "5. Count seats\n"
                    + "6. Log out");
            option = mem.nextInt();
            switch (option) {
                case 1:
                    showTheater(seats);
                    break;
                case 2:
                    row_text = ("Which row would you like? (1-5)");
                    column_text = ("Which column would you like? (1-8)");
                    int row_validation = row_validation(seats, selectedRow, mem, row_text);
                    int column_validation = column_validation(seats, selectedRow, selectedColumn, mem, column_text);
                    seat_reservation(seats, row_validation, column_validation);
                    break;
                case 3:
                    selectedColumn = 0;
                    selectedRow = 0;
                    row_text = ("Which row is the seat that you want to cancelled? (1-5)");
                    column_text = ("Which column is the seat that you want to cancelled? (1-8)");
                    row_validation = row_validation(seats, selectedRow, mem, row_text);
                    column_validation = column_validation(seats, selectedRow, selectedColumn, mem, column_text);
                    cancel_seat(seats, row_validation, column_validation);
                    break;
                case 4:
                    selectedColumn = 0;
                    selectedRow = 0;
                    row_text = ("In which row is the seat that you want to check? (1-5)");
                    column_text = ("In which Column is the seat that you want to check? (1-8)");
                    row_validation = row_validation(seats, selectedRow, mem, row_text);
                    column_validation = column_validation(seats, selectedRow, selectedColumn, mem, column_text);
                    seat_state(seats, row_validation, column_validation);
                    break;
                case 5:
                    avaliableSeats = 0;
                    occupiedSeats = 0;
                    available_seats(seats, avaliableSeats, occupiedSeats, row, column);

                    break;
                case 6:
                    System.out.println("process end");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (option != 6);

    }

    static void showTheater(int seats[][]) {
        int row, column;
        for (row = 0; row < seats.length; row = row + 1) {
            for (column = 0; column < seats[row].length; column = column + 1) {
                System.out.print(seats[row][column] + " ");
            }
            System.out.println();
        }

    }

    static int row_validation(int seats[][], int selectedRow, Scanner mem, String row_text) {
        do {
            System.out.println(row_text);
            selectedRow = mem.nextInt();
            selectedRow = selectedRow - 1;

            if ((selectedRow < 0) || (selectedRow >= seats.length)) {
                System.out.println("Invalid row");
            } else {
                System.out.println("Valid row");
            }
        } while ((selectedRow < 0) || (selectedRow >= seats.length));
        return selectedRow;
    }

    static int column_validation(int seats[][], int selectedRow, int selectedColumn, Scanner mem, String column_text) {
        do {
            System.out.println(column_text);
            selectedColumn = mem.nextInt();
            selectedColumn = selectedColumn - 1;
            if ((selectedColumn < 0) || (selectedColumn >= seats[selectedRow].length)) {
                System.out.println("Invalid column");
            } else {
                System.out.println("Valid Column");
            }
        } while ((selectedColumn < 0) || (selectedColumn >= seats[selectedRow].length));
        return selectedColumn;
    }

    static void seat_reservation(int seats[][], int row_validation, int column_validation) {
        if ((row_validation < 0) || (row_validation >= seats.length) && (column_validation < 0) || (column_validation >= seats[row_validation].length)) {
            System.out.println("Invalid seat");
        } else {
            System.out.println("Valid seat");
            System.out.println("reserved seat in: \n"
                    + "Row: " + row_validation + "\n"
                    + "Column: " + column_validation);
            seats[row_validation][column_validation] = 1;
        }
    }

    static void seat_state(int seats[][], int row_validation, int column_validation) {
        if (seats[row_validation][column_validation] == 1) {
            System.out.println("Seat is currently occupied");
        } else {
            System.out.println("Seat is currently free");
        }
    }

    static void cancel_seat(int seats[][], int row_validation, int column_validation) {
        if (seats[row_validation][column_validation] == 0) {
            System.out.println("Seat is currently free");
        } else {
            System.out.println("Reservation canceled");
            seats[row_validation][column_validation] = 0;
        }
    }

    static void available_seats(int seats[][], int avaliableSeats, int occupiedSeats, int row, int column) {
        for (row = 0; row < seats.length; row = row + 1) {
            for (column = 0; column < seats[row].length; column = column + 1) {
                if (seats[row][column] == 0) {
                    avaliableSeats = avaliableSeats + 1;
                } else {
                    occupiedSeats = occupiedSeats + 1;
                }
            }
        }
        System.out.println("Avalible seats: " + avaliableSeats + "\n"
                + "Occupied seats: " + occupiedSeats + "\n");
    }
}
