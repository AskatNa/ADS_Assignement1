public class Main {
    public static void main(String[] args) {
        String input1 = "AB";;
        printPermutations(input1.toCharArray(), 0);

        String input2 = "IOX";
        printPermutations(input2.toCharArray(), 0);
    }

    public static void printPermutations(char[] chars, int currentIndex) {
        if (currentIndex == chars.length - 1) {
            System.out.println(String.valueOf(chars));
            return;
        }

        for (int i = currentIndex; i < chars.length; i++) {
            swap(chars, currentIndex, i);
            printPermutations(chars, currentIndex + 1);
            swap(chars, currentIndex, i);
        }
    }

    public static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
