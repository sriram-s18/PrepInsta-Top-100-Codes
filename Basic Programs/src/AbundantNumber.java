//Abundant Number: A number n is said to be an Abundant Number
// if the sum of all the proper divisors of the number denoted by sum(n)
// is greater than the value of the number n.

import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(AbundantNum(num));
    }

    static boolean AbundantNum(int num){
        int sum = 0;
        for (int i =1; i<num; i++){
            if (num%i==0){
                sum = sum+i;
            }
        }
        return sum>num;
    }
}
