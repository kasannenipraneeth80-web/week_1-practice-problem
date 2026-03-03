import java.util.Scanner;

public class temparatureconversion {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt user for Celsius input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        // Apply conversion formula
        double fahrenheitResult = (celsius * 9.0 / 5.0) + 32;

        // Print the result
        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");
        
        sc.close();
    }
}