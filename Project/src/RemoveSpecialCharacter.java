import java.util.Scanner;

public class RemoveSpecialCharacter {
    public static void main(String[] args) {
//        String str = "K&a@ni#k%a";
//        String removeCharacter = str.replaceAll("[^a-zA-Z0-9]", "");
//        System.out.println("After Special charcter remove :" +removeCharacter);

        Scanner st = new Scanner(System.in);
        System.out.println("Enter The String"); //My #$%@na*me Kan*^$$
        String specialCharacter = st.nextLine();
        String removeSpecialCharacter = specialCharacter.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("After removal special character string is"+removeSpecialCharacter);
    }
}
