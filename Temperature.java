import java.util.Scanner;
public class Temperature{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pickScale = "";
        double temperature;
        while (!pickScale.equals("c") && !pickScale.equals("f")){
            System.out.printf("\n%s ", "Measure in fahrenheit or celsius? (Enter F or C):");
            pickScale = scan.nextLine().toLowerCase();
        }
        if (pickScale.equals("c")) {
            System.out.printf("\n%s", "You picked Celsius!");

            System.out.printf("\n%s ", "Enter the temperature:");
            temperature = scan.nextDouble();
            System.out.printf("\n%s %f %s", "Converting", temperature, "degrees Celsius to Fahrenheit...");
            temperature = (9.0 / 5) * temperature + 32;
            System.out.printf("\n%s %f", "Temperature in Fahrenheit:", temperature);
        }
        else{
            System.out.printf("\n%s", "You picked Fahrenheit!");

            System.out.printf("\n%s ", "Enter the temperature:");
            temperature = scan.nextDouble();
            System.out.printf("\n%s %f %s", "Converting", temperature, "degrees Fahrenheit to Celsius...");
            temperature = (5.0 / 9) * (temperature - 32);
            System.out.printf("\n%s %f", "Temperature in Celsius:", temperature);
        }
    }
}