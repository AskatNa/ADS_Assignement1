package SecondFiveTasks;

public class SeventhTask {
    public static void main(String[] args) {
        printSpiralSquare(3);
        System.out.println();
        printSpiralSquare(4);
    }

    public static void printSpiralSquare(int n) {
        int[][] matrix = new int[n][n];
        fillMatrix(matrix, 0, n - 1, 1);
        printMatrix(matrix);
    }

    public static void fillMatrix(int[][] matrix, int start, int end, int num) {
        if (start > end) return;

        for (int i = start; i <= end; i++) {
            matrix[start][i] = num++;
        }

        for (int i = start + 1; i <= end; i++) {
            matrix[i][end] = num++;
        }

        for (int i = end - 1; i >= start; i--) {
            matrix[end][i] = num++;
        }

        for (int i = end - 1; i > start; i--) {
            matrix[i][start] = num++;
        }

        fillMatrix(matrix, start + 1, end - 1, num);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");}}

    }

}
