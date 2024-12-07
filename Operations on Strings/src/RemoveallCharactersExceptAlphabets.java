import java.util.Scanner;

public class RemoveallCharactersExceptAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(removeNonAlpha(str));
    }

    static String removeNonAlpha(String str){

        String newstr = "";
        for(int i=0; i<str.length(); i++){
            if((str.charAt(i)>65 && str.charAt(i)<90) || (str.charAt(i)>97 && str.charAt(i)<122)){
                newstr = newstr + str.charAt(i);
            }
        }
        return newstr;
    }
}
