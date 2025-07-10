import java.math.BigInteger;
import java.util.Scanner;

public class LargeNumberAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first largest number");
        String str1 = sc.nextLine();
        System.out.println("Enter second largest number");
        String str2 = sc.nextLine();
        BigInteger num1 = new BigInteger(str1);
        BigInteger num2 = new BigInteger(str2);
        BigInteger sum = num1.add(num2);
        System.out.println("Total sum is "+sum);
    }
}
