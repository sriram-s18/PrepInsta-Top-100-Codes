import java.util.Scanner;

public class PositiveorNegative {

    public static String checkNumber(int num) {
        if (num > 0) {
            return "Positive Number";
        } else if (num < 0) {
            return "Negative Number";
        } else {
            return "neither positive nor negative";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(checkNumber(num));
    }
}