public class HelloWorld {
    public static void main(String[] args) {
        // Affichage du message "HelloWorld"
        System.out.println("HelloWorld");

    HelloWorld hello = new HelloWorld();
    
    }
    class O2 {
    public void afficherMessage() {
        System.out.println("Hello world");
    }
}

// Classe O1 qui contient une méthode qui appelle la méthode d'O2
class O1 {
    O2 o2; // Déclaration d'un objet O2
    
    public O1() {
        o2 = new O2(); // Initialisation de l'objet O2
    }
    
    public void m() {
        // Appel de la méthode d'O2 qui affiche le message
        o2.afficherMessage();
    }
}   
}
