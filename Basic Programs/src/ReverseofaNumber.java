import java.util.Scanner;

public class ReverseofaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(reverse(num));
    }

    static int reverse(int num){

        int rev = 0;
        int temp;

        while (num>0){
            temp = num%10;
            rev = rev * 10 +temp;
            num = num/10;
        }

        return rev;
    }
}
