import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(checkPalindronme(num));
    }

    static boolean checkPalindronme(int num1){

        int num2 = reverseNumber(num1);
        return num1==num2;
    }

    static int reverseNumber(int num1) {
        int temp;
        int rev=0;
        while (num1>0)
        {
            temp = num1%10;
            rev = rev * 10 + temp;
            num1 = num1/10;
        }
        return rev;
    }
}
