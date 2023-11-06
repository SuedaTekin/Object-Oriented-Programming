
import java.util.Scanner;
public class onem2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int numberOne = input.nextInt();

        System.out.println("Please enter second number: ");
        int numberTwo = input.nextInt();

        int result = numberOne + numberTwo;
        System.out.printf("the result is %d %n", result);
    }
}