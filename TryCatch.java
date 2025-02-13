import java.util.Scanner;

/**
 * The program asks the user for the radius of the a sphere
 * then gives them the volume given that input.
 *
 * @author Johnnatan Yasin Medina
 * @version 1.0
 * @since 2025-02-12
 */

public final class TryCatch {
    /**
     * This is to satisfy the style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private TryCatch() {
        throw new IllegalStateException("Utility Class");
    }

    /**
     * Main Method.
     *
     * @param args Unused.
     */
    public static void main(final String[] args) {
        // Welcoming
        System.out.println("Welcome to Johnny's Volume of a Sphere program!");
        System.out.print("Enter the radius of the sphere in cm: ");

        //Using Scanner for input
        final Scanner scanner = new Scanner(System.in);
        final String radString = scanner.nextLine();

        try {
            final double radDouble = Double.parseDouble(radString);

            if (radDouble < 0) {
                System.out.println("The radius cannot be negative.");
            } else {

                final double volume = (4f / 3f)
                * Math.PI * Math.pow(radDouble, 3f);

                //Display Volume
                System.out.print("The volume of a sphere with the radius, ");
                System.out.print(radString + "cm, is ");
                System.out.format("%.3f", volume);
                System.out.println("cm^3.");
            }
        } catch (NumberFormatException error) {
            System.out.println("Please enter a valid radius. "
                + error.getMessage());
        }
    }
}
