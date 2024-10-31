import java.util.ArrayList;
import java.util.Scanner;

public class CharacterisVowelorConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String vowels = "aeiouAEIOU";
        char a = sc.next().charAt(0);

        boolean flag = false;

        for (int i =0; i<vowels.length(); i++){
            if(vowels.charAt(i)==a){
                flag =true;
            }
        }

        if(flag){
            System.out.println("vowels");
        }
        else{
            System.out.println("consonant");
        }

    }
}
