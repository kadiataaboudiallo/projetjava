public class WordSearch {
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire les entrées de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir le texte à fouiller
        System.out.print("Entrez le texte à fouiller : ");
        String text = scanner.nextLine();  // Lire la ligne du texte

        // Demander à l'utilisateur de saisir le mot à rechercher
        System.out.print("Entrez le mot à trouver : ");
        String word = scanner.nextLine();  // Lire le mot à rechercher

        // Variable pour suivre la position de l'occurrence dans le texte
        int position = text.indexOf(word);  // Cherche la première occurrence du mot
        boolean found = false;

        // Si le mot est trouvé, afficher sa position et continuer la recherche
        while (position != -1) {
            found = true;
            // Afficher la position de l'occurrence du mot
            System.out.println("Le mot \"" + word + "\" apparaît à la place no." + (position + 1));

            // Rechercher la prochaine occurrence en commençant juste après la dernière position trouvée
            position = text.indexOf(word, position + 1);
        }

        // Si aucune occurrence n'est trouvée
        if (!found) {
            System.out.println("Le mot \"" + word + "\" est introuvable.");
        }

        // Fermer le scanner
        scanner.close();
    }
}