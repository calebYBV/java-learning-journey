package reversediagonalmatrix;

public class ReverseDiagonalMatrix {

    public static void main(String[] args) {
        int row, column;
        int[][] matriz = new int[9][9];

        for (row = 0; row < matriz.length; row = row + 1) {
            for (column = 0; column < matriz[row].length; column = column + 1) {

                if (row + column == 8) {
                    matriz[row][column] = row + 1;
                }
            }
        }

        for (row = 0; row < matriz.length; row = row + 1) {
            for (column = 0; column < matriz[row].length; column = column + 1) {
                System.out.print(matriz[row][column] + " ");
            }

            System.out.println();
        }
    }
}
