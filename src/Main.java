import java.util.Scanner;

public class Main {
    public static void ReverseOrder(Scanner scanner,int n) {
        if (n == 0) {
            return;
        }
        int enter = scanner.nextInt();
        ReverseOrder(scanner, n - 1);
        System.out.println(enter);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ReverseOrder(scanner,n);
    }
}