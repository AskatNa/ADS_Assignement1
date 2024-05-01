package FirstFiveTasks;
import java.util.Scanner;

public class FifthTask {
    public static void ReverseOrder(int n) {
        if (n == 0) {
            return;
        }else{
            Scanner scanner = new Scanner(System.in);
            String enter = scanner.nextLine();
            ReverseOrder(n - 1);
            System.out.println(enter);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ReverseOrder(n);
    }

}
