public class Calculatrice {
    public static int sum;
    public static float moyenne;
    public static int nbMax;
    public static int[] newTab;
    public static int nbMin;

    public static float average(int[] tableau) {
        //additionner tous les nombres du tableau
        for (int i = 0; i < tableau.length; i++) {
            sum += tableau[i];
        }
        //puis on divise la somme par le chiffre total des nombres du tableau
        moyenne = sum / tableau.length;
        //retourne la moyenne
        return moyenne;
    }
    
    public static int max(int[] tableau) {
        for (int i = 0; i < tableau.length-1; i++) {
            int elem1 = tableau[i];
            if (elem1 > nbMax) {
                nbMax = elem1;
            }
        }

        return nbMax;
    }
    
    public static int[] sort (int[] tableau) {
        int temporary;
        for (int i = 0; i < tableau.length; i++) {
            for (int j = i+1; j < tableau.length; j++) {
                if (tableau[i] > tableau[j]) {
                    temporary = tableau[i];
                    tableau[i] = tableau[j];
                    tableau[j] = temporary;
                }
            }
        }
        return tableau;
    }
}

