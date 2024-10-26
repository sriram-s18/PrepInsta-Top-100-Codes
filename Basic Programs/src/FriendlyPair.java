//the ratio of the sum of the divisors of a number to the number itself.

import java.util.Scanner;

public class FriendlyPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(FriendPair(num1,num2));
        //FriendPair(num1,num2);
    }

    static boolean FriendPair(int num1, int num2){
        int a = sumofFactors(num1);
        int b = sumofFactors(num2);
        //System.out.println(a + " " + b);
        return a/num1==b/num2;
    }

    static int sumofFactors(int num){
        int sum = 0;
        for (int i =1; i<num; i++){
            if(num%i==0){
                sum = sum + i;
            }
        }
        return sum;
    }
}
