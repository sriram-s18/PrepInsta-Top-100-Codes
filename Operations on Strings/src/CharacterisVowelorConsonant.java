import java.util.ArrayList;
import java.util.Scanner;

public class CharacterisVowelorConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(checkVowel(ch)){
            System.out.println("Vowel");
        }
        else {
            System.out.println("Character");
        }
    }

    static boolean checkVowel (char ch){

        boolean flag = false;
        String vowels = "aeiouAEIOU";

        for (int i=0; i<vowels.length(); i++){
            if(vowels.charAt(i) == ch){
                flag =true;
            }
        }

        return flag;
    }
}
