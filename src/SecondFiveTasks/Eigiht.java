package SecondFiveTasks;
import java.util.Scanner;

public class Eigiht {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();
        int[] sequence = new int[n];
        generateSequences(sequence, 0, k);
    }
    public static void generateSequences(int[] sequence, int index, int k) {
        if (index == sequence.length) {
            printArray(sequence);
            return;
        }

        for (int i = 1; i <= k; i++) {
            sequence[index] = i;
            generateSequences(sequence, index + 1, k);
        }
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
