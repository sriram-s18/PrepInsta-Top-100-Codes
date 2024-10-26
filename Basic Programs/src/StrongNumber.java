//A number is called strong number if sum of the factorial of its digit is equal to number itself

import java.util.Scanner;
public class StrongNumber {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(StrongNum(num));
    }

    static boolean StrongNum(int num){
        int num1 = num;
        int tmp;
        int sum = 0;
        while (num>0){
            tmp = num%10;
            sum = sum + factorial(tmp);
            num = num/10;
        }
        return num1==sum;
    }

    static int factorial(int num){
        int sum =1;
        while (num>0){
            sum = sum*num;
            num--;
        }

        return sum;
    }
}
