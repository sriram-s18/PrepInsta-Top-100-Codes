import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(CheckPrime(num));
    }

    private static boolean CheckPrime(int num) {

        int check = 0;

        for (int i=2; i<num; i++){
            if (num%i==0){
                check++;
            }
        }

        return check==0;
    }
}
