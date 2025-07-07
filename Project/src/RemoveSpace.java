import java.util.Scanner;

public class RemoveSpace {
    public static void main(String args[]) {

        Scanner st = new Scanner(System.in);
        System.out.println("Enter the String :" );
        String input = st.nextLine();
       String whiteSpace =  input.replaceAll("\\s+", "");
        System.out.println("After removal white space , new String is : " +whiteSpace); //ABCD
    }
}
