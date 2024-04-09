import java.util.*;
import java.util.Scanner;

public class Main {
    public static int SumOfSquares(int n) {
        if(n == 1) {
            return 1;
        }else{
            return n * n + SumOfSquares(n - 1);
        }
    }
    public static void main(String[] args) {
        int  result = SumOfSquares(4);
        System.out.println("Result: " + result);

    }
}