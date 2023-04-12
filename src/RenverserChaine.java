public class RenverserChaine {
    public static String renverserChaine() {
        String chaine = "azerty";
        String renverser = "";
        for (int i = chaine.length() - 1; i >= 0; i--) {
            renverser += chaine.charAt(i);
        }
        return chaine + " --> " + renverser;
    }
}