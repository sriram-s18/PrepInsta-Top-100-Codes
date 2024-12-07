import java.util.Scanner;

public class RemoveSpacesfromaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(removeSpace(str));
    }

    static String removeSpace(String str){
        String newstr = str.replaceAll(" ","");
        return newstr;
    }
}
