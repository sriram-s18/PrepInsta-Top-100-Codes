//A Number that can be represented as the sum of its factors
// except the number itself is known as the Perfect Number.

//6 = 1 + 2 + 3
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(PerfectNum(num));
    }

    static boolean PerfectNum(int num){
        int sum = 0;
        for (int i =1; i<num; i++){
            if (num%i==0){
                sum = sum + i;
            }
        }
        return num==sum;
    }

}
