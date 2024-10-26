import java.util.Scanner;

public class FactorialofaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factorial(num));
    }

    static int factorial(int num){
        int sum=1;
        while (num>0){
            sum = sum * num;
            num--;
        }
        return sum;
    }
}
