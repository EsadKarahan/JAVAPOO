public class AfficherPyramide {
    public static void afficherPyramide() {
        int n = 5;
        String symbole = "*";
        for (int i = 1; i <= n; i++) {
            // Ajouter des espaces avant le symbole pour centrer la ligne
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Ajouter le symbole
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(symbole);
            }
            // Passer à la ligne suivante
            System.out.println();
        }
    }
}