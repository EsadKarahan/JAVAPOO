import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Renverser chaine : " + RenverserChaine.renverserChaine());
        System.out.println("-------------------------------------------------------");
        System.out.println("Afficher pyramide : ");
        AfficherPyramide.afficherPyramide();
        System.out.println("-------------------------------------------------------");
        System.out.println("Calculer somme jusqu'à 10 000 : " + CalculerSomme.calculerSomme());
        System.out.println("-------------------------------------------------------");
        VerifierNombre.verifierNombre();
        System.out.println("-------------------------------------------------------");
        JusteNombre.justeNombre();
        System.out.println("-------------------------------------------------------");
        CompterNombreMots.compterNombreMots();
        System.out.println("-------------------------------------------------------");
        EnregistrerFichier.enregistrerFichier();
        System.out.println("-------------------------------------------------------");
        CompterMotsFichier.compterMotsFichier();
        System.out.println("-------------------------------------------------------");
        Carre rectangle = new Carre(3,5);
        rectangle.afficherRectangle();
    }
}