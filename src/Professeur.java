import java.util.ArrayList;

public class Professeur extends Employe{

    private ArrayList<String> listeCompetences;

    public Professeur(String nom, String prenom, String email, int age, double salaire, ArrayList<String> listeCompetences) {
        super(nom, prenom, email, age, salaire);
        this.listeCompetences = listeCompetences;
    }

    public ArrayList<String> getListeCompetences() {
        return listeCompetences;
    }

    @Override
    public String GetRole() {
        String role = " A pour compétences : ";
        for (int i = 0; i < listeCompetences.size() - 1; i++){
            role += listeCompetences.get(i) + ", ";
        }

        role += "et " + listeCompetences.getLast() + ".";

        return role;
    }

    @Override
    public void PrintDesc() {
        System.out.println(super.toString() + " - " + super.salaire + "€/mois -" + GetRole());
    }

    public void PrintMatieres(){
        for (String c : listeCompetences){
            System.out.println("- Cours de " + c);
        }
    }
}
