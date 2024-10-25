import java.util.Scanner;

public class SumofDigitsofaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(SumofDigit(num));
    }

    static int SumofDigit(int num){
        int sum = 0;
        int temp;

        while (num>0){
            temp = num%10;
            sum = sum + temp;
            num = num/10;
        }

        return sum;
    }
}
