import java.util.Scanner;

public class StringisPalindromeornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(checkPalindrome(str));
    }

    static boolean checkPalindrome(String str){
        String reversestr = "";
        for(int i=str.length()-1; i>=0; i--){
            reversestr = reversestr + str.charAt(i);
        }

        return reversestr.equals(str);
    }
}
