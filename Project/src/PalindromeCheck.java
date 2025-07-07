import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number"); //1234
        int orginalNumber = sc.nextInt();
        System.out.println("original number is " +orginalNumber);
        
        int rev = 0;
        while(orginalNumber != 0) {    //reverse number
           rev = rev*10 + orginalNumber%10;
            orginalNumber = orginalNumber/10;
        }
        System.out.println("Reverse number is " +rev);
        if(orginalNumber == rev) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }


    }
}
