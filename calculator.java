import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.print("Pick an operator ( +, -, *, / ): ");
        Scanner scannerChoice = new Scanner(System.in);
        String choice = scannerChoice.next();

        System.out.print("Number 1: ");
        Scanner scannernum1 = new Scanner(System.in);
        float number1 = scannernum1.nextFloat();
        System.out.print("Number 2: ");
        Scanner scannernum2 = new Scanner(System.in);
        float number2 = scannernum2.nextFloat();

            switch (choice) {
            case "+":
                float answer = number1 + number2;
                System.out.print("The answer is: " + answer);
                break;

            case "-":
                answer = number1 - number2;
                System.out.print("The answer is: " + answer);
                break;

            case "*":
                answer = number1 * number2;
                System.out.print("The answer is: " + answer);
                break;

            case "/":
                answer = number1 / number2;
                System.out.print("The answer is: " + answer);
                break;

            default:
                System.out.print("INVALID OPERATOR: " + choice);
                break;

        }
    }
}

