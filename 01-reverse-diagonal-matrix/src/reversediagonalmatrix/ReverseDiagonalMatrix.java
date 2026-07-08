package reversediagonalmatrix;

public class ReverseDiagonalMatrix {

    public static void main(String[] args) {

        int[][] matriz = new int[9][9];

        for (int row = 0; row < matriz.length; row++) {
            for (int column = 0; column < matriz[row].length; column++) {

                if (row + column == 8) {
                    matriz[row][column] = row + 1;
                }
            }
        }

        for (int row = 0; row < matriz.length; row++) {
            for (int column = 0; column < matriz[row].length; column++) {
                System.out.print(matriz[row][column] + " ");
            }

            System.out.println();
        }
    }
}
