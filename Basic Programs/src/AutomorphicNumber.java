//An automorphic number is a natural number that when squared,
// ends in the same digits as the number itself

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(AutomorphicNum(num));
    }

    static boolean AutomorphicNum(int num){
        int num2 = num *num;
        num2 = num2 % calc(10,digit(num));
        return num==num2;
    }

    static int digit(int num){
        int digit = 0;
        while (num>0){
            digit++;
            num = num/10;
        }
        return digit;
    }

    static int calc(int a, int b){
        int num = 1;
        while(b>0){
            num = num * a;
            b--;
        }
        return num;
    }
}
