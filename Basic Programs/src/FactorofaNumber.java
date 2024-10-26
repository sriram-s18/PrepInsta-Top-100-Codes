import java.util.ArrayList;
import java.util.Scanner;

public class FactorofaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(factor(num));
    }

    static ArrayList<Integer> factor(int num){
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i=1; i<=num; i++){
            if (num%i==0){
                arrayList.add(i);
            }
        }

        return arrayList;

    }
}
