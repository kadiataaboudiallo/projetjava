public class FullOccurrenceCount {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau : ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(21) - 10;  
        }

        // Afficher le tableau généré
        System.out.print("Tableau généré : ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Utiliser deux tableaux pour stocker les valeurs distinctes et leurs occurrences
        int[] distinctValues = new int[size];
        int[] occurrences = new int[size];
        int distinctCount = 0;

        // Parcourir le tableau pour compter les occurrences
        for (int i = 0; i < size; i++) {
            int currentValue = array[i];
            boolean found = false;

            // Vérifier si la valeur existe déjà dans distinctValues
            for (int j = 0; j < distinctCount; j++) {
                if (distinctValues[j] == currentValue) {
                    occurrences[j]++; 
                    found = true;
                    break;
                }
            }

            // Si la valeur n'est pas trouvée, l'ajouter aux tableaux distincts et occurrences
            if (!found) {
                distinctValues[distinctCount] = currentValue;
                occurrences[distinctCount] = 1;  
                distinctCount++;
            }
        }

        // Afficher les résultats
        System.out.println("Valeurs distinctes et leurs occurrences :");
        for (int i = 0; i < distinctCount; i++) {
            System.out.println(distinctValues[i] + " : " + occurrences[i]);
        }

        // Fermer le scanner
        scanner.close();
    }
}