import java.util.Scanner;

public class LeapYearorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(checkleapyear(year));
    }

    private static boolean checkleapyear(int year) {
        //The year must be divisible by 400.
        //The year must be divisible by 4 but not by 100.

        if (year%400==0) {
            return true;
        }
        else if ((year%4==0) && (year%100!=0)){
            return true;
        }
        else{
            return false;
        }
    }
}
