import java.util.Scanner;

public class EvenorOdd {

    public static String checkNumber(int num) {
        if (num % 2 == 0) {
            return "Even Number";
        } else {
            return "Odd Number";
        }
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(checkNumber(num));
    }

}