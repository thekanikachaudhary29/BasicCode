import java.util.Scanner;

public class LengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new String");
        String word = sc.nextLine();
        String trimmed = word.trim();
        int count = 0;
        for(int i = trimmed.length()-1; i>=0; i--) {
            if(trimmed.charAt(i) != ' ') {
                count++;
            } else {
                break;
            }
        }
        System.out.println("Count of the last word is "+count);

    }
}