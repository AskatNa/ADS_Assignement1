package FirstFiveTasks;

public class FourthTask {
    public static int SumOfSquares(int b,int n) {
        if(n == 0) {
            return 1;
        }else{
            return (int) Math.pow(b,n) + SumOfSquares(b,n - 1);
        }
    }
    public static void main(String[] args) {
        int  result = SumOfSquares(4,3);
        System.out.println("Result: " + result);
    }

}
