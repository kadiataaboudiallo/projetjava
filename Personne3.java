class Personne3 {
    String prenom; 
    String nom; 
    private int age; 

    public Personne3(String p, String n, int a) { 
        prenom = p; 
        nom = n; 
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void feterAnniversaire() {
        age++;
    }
}

public class ProgPrincipal {
    public static void anniversaire(Personne p) {
        p.feterAnniversaire();  // Appel à la méthode fêterAnniversaire
    }

    public static void main(String[] args) {
        Personne p1 = new Personne("Jean", "Durand", 25);
        System.out.println("Avant l'anniversaire : " + p1.getAge());
        anniversaire(p1);  // Ajouter un an à p1
        System.out.println("Après l'anniversaire : " + p1.getAge());
    }
}