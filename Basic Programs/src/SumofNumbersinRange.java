import java.util.Scanner;

public class SumofNumbersinRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a  = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(RangeSum(a,b));
    }

    static int RangeSum(int a, int b){
        int sum = 0;
        for (int i=a; i<=b; i++){
            sum = sum+i;
        }
        return sum;
    }
}
