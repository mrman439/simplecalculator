import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.print("Pick an operator ( +, -, *, / ): ");
        Scanner scannerChoice = new Scanner(System.in);
        String choice = scannerChoice.next();

        System.out.print("Number 1: ");
        float number1 = scannerChoice.nextFloat();
        System.out.print("Number 2: ");
        float number2 = scannerChoice.nextFloat();

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

