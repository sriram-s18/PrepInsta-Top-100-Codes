import java.util.Scanner;


//125 -> 1^3 + 2^3 + 5^3
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(Armstrong(num));
    }

    static boolean Armstrong(int num){
        int tmp;
        int sum=0;
        int power = digit(num);

        int tmp1 = num;

        while(num>0){
         tmp = num%10;
         sum = sum + pow(tmp,power);
         num = num/10;
        }

        return tmp1==sum;
    }

    static int digit(int num) {
        int ans = 0;
        while (num>0){
            ans++;
            num = num/10;
        }
        return ans;
    }

    static int pow(int num, int power){
        int ans = 1;
        while(power>0){
            ans = ans * num;
            power--;
        }
        return ans;
    }
}
