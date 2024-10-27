import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        System.out.println(fib(num));
    }

    static ArrayList<Integer> fib (int num){
        int a =0;
        int b =1;
        int c;
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (num > 0) {
            arrayList.add(a);
            c = a+b;
            a=b;
            b=c;

            num--;
        }

        return arrayList;
    }
}
