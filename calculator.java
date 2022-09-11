import java.util.Scanner;

public class calculator {

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
                float answerPlus = number1 + number2;
                System.out.print("The answer is: " + answerPlus);
                break;

            case "-":
                float answerMinus = number1 - number2;
                System.out.print("The answer is: " + answerMinus);
                break;

            case "*":
                float answerMultiply = number1 * number2;
                System.out.print("The answer is: " + answerMultiply);
                break;

            case "/":
                float answerDivide = number1 / number2;
                System.out.print("The answer is: " + answerDivide);
                break;

            default:
                System.out.print("INVALID OPERATOR: " + choice);
                break;

        }

        


    }
}


