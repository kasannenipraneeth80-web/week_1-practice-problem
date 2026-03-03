import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2; // assumes number2 != 0

        // Print results
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);

        sc.close();
    }
}