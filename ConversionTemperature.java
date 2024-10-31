import java.util.Scanner;

public class ConversionTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la température en degrés Celsius : ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + " degrés Celsius équivalent à " + fahrenheit + " degrés Fahrenheit.");

        scanner.close();
    }
}
