import java.util.Scanner;

public class VerifierNombre {
    public static void verifierNombre() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vérifier nombre : \nEntrez un nombre entier : ");
        String entree = scanner.nextLine();

        int nombre;
        try {
            nombre = Integer.parseInt(entree);
        } catch (NumberFormatException e) {
            System.out.println("L'entrée n'est pas un nombre entier valide.");
            return;
        }

        if (nombre % 2 == 0) {
            System.out.println(nombre + " est un nombre pair.");
        } else {
            System.out.println(nombre + " est un nombre impair.");
        }

        boolean premier = true;
        for (int i = 2; i <= nombre / 2; i++) {
            if (nombre % i == 0) {
                premier = false;
                break;
            }
        }

        if (premier) {
            System.out.println(nombre + " est un nombre premier.");
        } else {
            System.out.println(nombre + " n'est pas un nombre premier.");
        }
    }
}
