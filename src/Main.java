import java.util.*;
import java.util.Scanner;

public class Main {
    public static int SumOfPositive(int n){
        if(n < 0){
            return -1;
        }
        else{
            return n + SumOfPositive(n - 1);
        }
    }
    public static void main(String[] args) {
        int result = SumOfPositive(4);
        System.out.println(result);
    }
}