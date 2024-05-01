package FirstFiveTasks;

public class SecondTask {
    public static int sumOfNel(int n, int[] arr) {
        if(n == 0) {
            return 0;
        }
        else {
            return arr[n-1] + sumOfNel(n-1, arr);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(sumOfNel(4, arr));
    }

}
