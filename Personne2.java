class Personne2 {
    private String prenom;  
    private String nom; 
    private int age; 

    public Personne2(String p, String n, int a) { 
        prenom = p; 
        nom = n; 
        age = a;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }
}

public class ProgPrincipal {
    public static void main(String[] args) {
     
        Personne p1 = new Personne("Jean", "Durand", 25);
        
        System.out.println(p1.getPrenom());  
        System.out.println(p1.getNom());    
        System.out.println(p1.getAge());    
    }
}

