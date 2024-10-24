import java.util.Scanner;

public class PrimeNumberinRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i=a; i<=b;i++){
            System.out.println(i +" "+ CheckPrime(i));
        }
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
