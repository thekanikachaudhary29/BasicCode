import java.util.Scanner;

public class FirstOccurenceInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();  //happy sad hungry
        System.out.println("Enter the word which you want to find in a string");
        String word = sc.nextLine(); //sad
        int index = str.indexOf(word);
       if(index != -1) {
           System.out.println("Index" +index);
       } else {
           System.out.println("Not Found");
       }
    }
}
