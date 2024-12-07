import java.util.Scanner;

public class ReverseaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(ReverseString(str));
    }

    static String ReverseString(String str){
        String reversestr = "";
        for(int i=str.length()-1; i>=0; i--){
            reversestr = reversestr + str.charAt(i);
        }

        return reversestr;
    }
}
