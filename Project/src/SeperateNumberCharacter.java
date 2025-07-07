import java.util.Scanner;

public class SeperateNumberCharacter {
    public static void main(String[] args) {

      //  String str = "ABC123XYZ345";
        Scanner cd = new Scanner(System.in);
        System.out.println("Enter aplhanumeric string :" );
        String string = cd.nextLine();

        StringBuilder letters = new StringBuilder();
        StringBuilder num = new StringBuilder();

        for(char c: string.toCharArray()) {
            if(Character.isLetter(c)) {
                letters.append(c);
            } else if (Character.isDigit(c)) {
                num.append(c);

            }

        }





        System.out.println("Letters in a string are" +letters.toString());
        System.out.println("Numbers in a string are" +num.toString());
    }
}
