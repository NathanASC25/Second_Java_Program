import java.util.Scanner;
// Converts centimeters to feet and inches
public class Test{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double CM_IN_INCH = 2.54;
        final int INCH_IN_FEET = 12;
        final double CM_IN_FEET = 12 * CM_IN_INCH;
        System.out.printf("\n%s\n", "Hello! This program converts centimeters to feet and inches");
        System.out.printf("\n%s\n", "Enter the amount of centimeters:");
        double centimeters = scan.nextDouble();
        int cmToFeet = (int) (centimeters / CM_IN_FEET);
        double remainingCmToInches = INCH_IN_FEET * (centimeters / CM_IN_FEET % (int) (centimeters / CM_IN_FEET));
        System.out.printf("\nNumber in feet: %d\nNumber in inches: %f\n", cmToFeet, remainingCmToInches);
    }
}