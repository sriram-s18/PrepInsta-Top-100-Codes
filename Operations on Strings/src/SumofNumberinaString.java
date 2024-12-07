import java.util.Scanner;

public class SumofNumberinaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(sumofNumbers(str));
    }

    static int sumofNumbers(String str){
        int sum =0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>48 && str.charAt(i)<57){
                sum = sum + Character.getNumericValue(str.charAt(i));

            }
        }
        return sum;

    }
}
