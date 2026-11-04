import java.util.ArrayList;

public class Etudiant extends Personne {
    private ArrayList<Cours> listeCours;

    public Etudiant(String nom, String prenom, String email, int age, ArrayList<Cours> listeCours) {
        super(nom, prenom, email, age);
        this.listeCours = listeCours;
    }

    @Override
    public String GetRole() {
        String role = "Étudiant.e inscrit.e aux cours de ";
        if (listeCours.size() == 1){
            role += listeCours.get(0).getNom() + ".";
        } else{
            for (int i = 0; i < listeCours.size(); i++){
                role += listeCours.get(i).getNom() + ", ";
            }
            role += listeCours.getLast().getNom() + ".";
        }
        return role;
    }

    @Override
    public void PrintDesc() {
        System.out.println(super.toString() + " - " + GetRole());
    }

    public void PrintCours(){
        for (Cours c : listeCours){
            System.out.println("- Cours de " + c.getNom());
        }
    }
}
