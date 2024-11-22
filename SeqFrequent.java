public class SeqFrequent {

    public static int compte(int[] tableau, int[] sequence) {
        int count = 0;
        for (int i = 0; i <= tableau.length - sequence.length; i++) {
            boolean match = true;
            for (int j = 0; j < sequence.length; j++) {
                if (tableau[i + j] != sequence[j]) {
                    match = false;
                    break;
                }
            }
            if (match) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau : ");
        int n = scanner.nextInt();

        System.out.print("Entrez la valeur maximale (k) des éléments du tableau : ");
        int k = scanner.nextInt();

        System.out.print("Entrez le seuil de fréquence (p) : ");
        int p = scanner.nextInt();

        int[] tableau = new int[n];
        for (int i = 0; i < n; i++) {
            tableau[i] = (int) (Math.random() * (k + 1));
        }

        System.out.print("Tableau généré : ");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println();

        List<int[]> sequencesFrequent1 = new ArrayList<>();
        for (int i = 0; i <= k; i++) {
            int[] sequence = {i}; 
            int count = compte(tableau, sequence);
            if (count >= p) {
                sequencesFrequent1.add(sequence);
            }
        }

        System.out.println("Séquences fréquentes de longueur 1 :");
        for (int[] seq : sequencesFrequent1) {
            System.out.println("[" + seq[0] + "] apparaît " + compte(tableau, seq) + " fois");
        }
        List<int[]> sequencesFrequent2 = new ArrayList<>();
        for (int i = 0; i < sequencesFrequent1.size(); i++) {
            for (int j = i; j < sequencesFrequent1.size(); j++) {
                int[] sequence = {sequencesFrequent1.get(i)[0], sequencesFrequent1.get(j)[0]};
                int count = compte(tableau, sequence);
                if (count >= p) {
                    sequencesFrequent2.add(sequence);
                }
            }
        }

        System.out.println("Séquences fréquentes de longueur 2 :");
        for (int[] seq : sequencesFrequent2) {
            System.out.print("[");
            for (int i = 0; i < seq.length; i++) {
                System.out.print(seq[i] + (i < seq.length - 1 ? ", " : ""));
            }
            System.out.println("] apparaît " + compte(tableau, seq) + " fois");
        }

        List<int[]> sequencesFrequent3 = new ArrayList<>();
        for (int i = 0; i < sequencesFrequent1.size(); i++) {
            for (int j = 0; j < sequencesFrequent2.size(); j++) {
                int[] sequence = {sequencesFrequent1.get(i)[0], sequencesFrequent2.get(j)[0]};
                int count = compte(tableau, sequence);
                if (count >= p) {
                    sequencesFrequent3.add(sequence);
                }
            }
        }

        System.out.println("Séquences fréquentes de longueur 3 :");
        for (int[] seq : sequencesFrequent3) {
            System.out.print("[");
            for (int i = 0; i < seq.length; i++) {
                System.out.print(seq[i] + (i < seq.length - 1 ? ", " : ""));
            }
            System.out.println("] apparaît " + compte(tableau, seq) + " fois");
        }

        scanner.close();
    }
}