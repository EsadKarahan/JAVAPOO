public class CalculerSomme {
    public static int calculerSomme() {
        int n = 10000;
        int somme = 0; // La somme des nombres

        // Ajouter chaque nombre de 1 à n à la somme
        for (int i = 1; i <= n; i++) {
            somme += i;
        }

        return somme;
    }
}
