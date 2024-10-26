import java.util.Scanner;

public class ArmstrongNumberinGivenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i =a; i<=b; i++){
            if(Armstrong(i)){
                System.out.println(i + " is Armstrong Number");
            }
        }
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
