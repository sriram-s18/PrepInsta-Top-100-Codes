import java.util.Scanner;

public class SumofFirstNNaturalnumbers {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(sumNatural(num));

    }

    private static int sumNatural(int num) {
        int sum =0;
        for (int i=1;i<=num;i++){
            sum = sum +i;
        }
        return sum;
    }

}
