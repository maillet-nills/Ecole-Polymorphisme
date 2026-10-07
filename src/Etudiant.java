import java.util.ArrayList;

public class Etudiant extends Personne {
    private ArrayList<String> listeCours;

    public Etudiant(String nom, String prenom, String email, int age, ArrayList<String> listeCours) {
        super(nom, prenom, email, age);
        this.listeCours = listeCours;
    }

    @Override
    public String GetRole() {
        String role = "Étudiant.e inscrit.e aux cours de ";
        for (int i = 0; i < listeCours.size() - 1; i++){
            role += listeCours.get(i) + ", ";
        }

        role += "et " + listeCours.getLast() + ".";

        return role;
    }

    @Override
    public void PrintDesc() {
        System.out.println(super.toString() + " - " + GetRole());
    }

    public void PrintCours(){
        for (String c : listeCours){
            System.out.println("- Cours de " + c);
        }
    }
}
