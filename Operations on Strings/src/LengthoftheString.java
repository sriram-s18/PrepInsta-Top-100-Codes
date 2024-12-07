import java.util.Scanner;

public class LengthoftheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(findlength(str));
    }

    static int findlength(String str){
        int count = 0;
        for(char ch : str.toCharArray()){
            count++;
        }
         return count;
    }
}
