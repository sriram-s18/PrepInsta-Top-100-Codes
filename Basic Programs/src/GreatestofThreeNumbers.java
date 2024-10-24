import java.util.Scanner;

public class GreatestofThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        GreatestNum(a,b,c);
    }

    private static void GreatestNum(int a, int b, int c) {
        //ternary operator
        int ans = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(ans + " is greatest");
    }
}
