import java.util.Scanner;
import static Calc_essentials.Calc_operators.*;

public class Calculator {

    public static void main(String[] args) {

        System.out.print("Pick an operator ( +, -, *, / ): ");
        Scanner scannerChoice = new Scanner(System.in);
        String choice = scannerChoice.next();

        System.out.print("Number 1: ");
        float number1 = scannerChoice.nextFloat();
        System.out.print("Number 2: ");
        float number2 = scannerChoice.nextFloat();
        scannerChoice.close();

        switch (choice) {
            case "+":
                Add(number1, number2);
                break;

            case "-":
                Minus(number1, number2);
                break;

            case "*":
                Multiply(number1, number2);
                break;

            case "/":
                Divide(number1, number2);
                break;


            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }
    }
}
