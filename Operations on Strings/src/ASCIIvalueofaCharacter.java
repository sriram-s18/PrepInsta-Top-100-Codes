import java.util.Scanner;

public class ASCIIvalueofaCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println(ASCIvalue(ch));
    }

    static int ASCIvalue(char ch){
        int a = (int) ch;
        return a;
    }
}
