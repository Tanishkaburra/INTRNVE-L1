import java.util.Scanner;

public class EnhancedCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        String operator;

        // Get the first number with validation
        System.out.print("Enter the first number: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next();  // clear the invalid input
        }
        number1 = scanner.nextDouble();

        // Get the operator
        System.out.print("Enter an operation (+, -, *, /): ");
        operator = scanner.next();

        // Get the second number with validation
        System.out.print("Enter the second number: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next();  // clear the invalid input
        }
        number2 = scanner.nextDouble();

        // Perform the calculation
        double result = 0;
        boolean validOperation = true;

        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Error! Unsupported operator.");
                validOperation = false;
        }

        // Display the result if the operation was valid
        if (validOperation) {
            System.out.println("Result of " + number1 + " " + operator + " " + number2 + " = " + result);
        }
    }
}
