import java.util.Scanner;

public class LargestOutOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number ");
        int secondNumber = sc.nextInt();
        System.out.println("Enter third number ");
        int thirdNumber = sc.nextInt();
        int largest = firstNumber>secondNumber?firstNumber:secondNumber;
        largest = secondNumber>thirdNumber?secondNumber:thirdNumber;
        System.out.println("The largest number "+largest);
    }
}

