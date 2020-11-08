package PACKAGE_NAME;
import java.util.Scanner;

public class JavaCalculator {
    public static void main (String [] args){

        int num1, num2;
        Scanner scan = new Scanner (System.in);
        System.out.println("Please Enter First Number: ");

        num1 = scan.nextInt();
        System.out.println("Enter Second Number: ");
        num2 = scan.nextInt();

        System.out.println("Enter an operator (+, -, *, /):");
        char operator = scan.next().charAt(0);

        scan.close();
        int output;

        switch (operator)

        {
            case '+':
                output = num1 + num2;
                break;

            case '-':
                output = num1 - num2;
                break;
            case '*':
                output = num1 * num2;
                break;
            case '/':
                output = num1 / num2;
                break;

            default:
                System.out.println("You have entered the wrong operator");
                return;
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + output);
        }
}
