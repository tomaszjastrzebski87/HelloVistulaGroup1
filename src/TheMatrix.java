public class TheMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];

        int diagonalSum = 0;

        for (int i = 0; i < 10; i++) {
            matrix[i][i] = i;
            diagonalSum += i;
        }

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println("\nThe sum of diagonal numbers is: " + diagonalSum);
    }
}