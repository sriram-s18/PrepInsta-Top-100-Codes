import java.util.Scanner;

public class GreatestofTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        GreatestNum(a,b);
    }

    private static void GreatestNum(int a, int b) {
        if (a>b){
            System.out.println(a + " is greater");
        }
        else if (a<b){
            System.out.println(b + " is greater");
        }
        else{
            System.out.println("equals");
        }
    }
}
