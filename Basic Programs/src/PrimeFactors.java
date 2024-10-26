import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.println(PrimeFact(num));
    }

    static ArrayList<Integer> PrimeFact(int num){
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i=2 ; i<=num; i++){
            while(num%i==0){
                arrayList.add(i);
                num = num/i;
            }
        }
        return arrayList;
    }
}
