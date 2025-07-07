import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number");
//        Integer number = sc.nextInt();
//
//        if(number % 2 == 0) {
//            System.out.println("Number is even");
//        } else {
//            System.out.println("Number is odd");
//        }
        int number[] = {2,6,1,3,5,4};
        for(int b : number) {
            if(b % 2 == 0) {
                System.out.println("Even number are " +b);
            } else if(b%2 != 0) {
                System.out.println("Odd number are " +b);
            }

        }

    }
}
