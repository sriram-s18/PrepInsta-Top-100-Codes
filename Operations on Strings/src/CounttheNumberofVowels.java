import java.util.Scanner;

public class CounttheNumberofVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(countVowels(str));
    }

    static int countVowels(String str){
        int count =0;
        String vowels = "aeiouAEIOU";
        for(int i = 0; i<vowels.length(); i++){
            for(int j=0; j<str.length(); j++){
                if(vowels.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
        }
        return count;
    }
}
