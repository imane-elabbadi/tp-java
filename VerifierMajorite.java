import java.util.Scanner;

public class VerifierMajorite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Vous êtes majeur.");
        } else {
            System.out.println("Vous êtes mineur.");
        }
        
        scanner.close();
    }
}
