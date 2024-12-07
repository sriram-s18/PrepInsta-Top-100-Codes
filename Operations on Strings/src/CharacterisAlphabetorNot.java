import java.util.Scanner;

public class CharacterisAlphabetorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println(isAplha(ch));
    }

    static boolean isAplha(char ch){
        boolean flag;
        if((ch >='A' && ch <='Z') || (ch >='a' && ch <='z')){
            flag = true;
        }
        else{
            flag =false;
        }
        return flag;
    }
}
