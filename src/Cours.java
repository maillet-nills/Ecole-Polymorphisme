import java.util.ArrayList;

public class Cours {
    private String nom;
    private int volumeH;
    private ArrayList<String> listePrerequis;
    private Professeur professeur;

    public Cours(String nom, int volumeH, ArrayList<String> listeCompetences) {
        this.nom = nom;
        this.volumeH = volumeH;
        this.listePrerequis = listeCompetences;
    }

    public void definirProfesseur(Professeur p){
        if(p.getListeCompetences().containsAll(listePrerequis)){
            System.out.println("\nLe professeur attribué au cours de " + this.nom + " possède les compétences nécessaires.");
            this.professeur = p;
        }else{
            System.out.println("\nErreur, l'enseignant " + p.prenom + p.nom +
                    " ne dispose pas de toutes les compétences nécessaires.");
        }
    }

    public String getNom() {
        return nom;
    }
}
