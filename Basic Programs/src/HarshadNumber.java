//Number that is divisible by the sum of it's digits

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(HarshadNum(num));
    }

    static boolean HarshadNum(int num){
        int Originalnum = num;
        int sum = 0;
        int tmp;
        while (num>0){
            tmp = num%10;
            sum = sum + tmp;
            num = num/10;
        }
        return Originalnum%sum==0;
    }
}
