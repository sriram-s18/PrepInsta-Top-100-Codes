import java.util.Scanner;

public class PowerofaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int power = sc.nextInt();
        System.out.println(power(num,power));
    }

    static int power (int num, int power){
        int sum = 1;

        while(power>0){
            sum = sum*num;
            power--;
        }
        return sum;
    }
}
