import java.util.Scanner;

public class squareside {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read perimeter from user
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();

        // Formula: Perimeter = 4 × side
        double side = perimeter / 4.0;

        // Output result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        sc.close();
    }
}