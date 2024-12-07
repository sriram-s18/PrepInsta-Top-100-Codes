import java.util.Scanner;

public class RemovetheVowelsfromaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(removeVowels(str));
    }

    static String removeVowels(String str) {
        String removeVowels = "";
        removeVowels = str.replaceAll("[aeiouAEIOU]","");
        return removeVowels;
    }
}
