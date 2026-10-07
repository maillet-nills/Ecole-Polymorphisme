import java.util.ArrayList;

public class Professeur extends Employe{

    private ArrayList<String> listeMatieres;

    public Professeur(String nom, String prenom, String email, int age, double salaire, ArrayList<String> listeMatieres) {
        super(nom, prenom, email, age, salaire);
        this.listeMatieres = listeMatieres;
    }

    @Override
    public String GetRole() {
        String role = "Enseigne les cours de ";
        for (int i = 0; i < listeMatieres.size() - 1; i++){
            role += listeMatieres.get(i) + ", ";
        }

        role += "et " + listeMatieres.getLast() + ".";

        return role;
    }

    @Override
    public void PrintDesc() {
        System.out.println(super.toString() + " - " + super.salaire + "€/mois -" + GetRole());
    }

    public void PrintMatieres(){
        for (String c : listeMatieres){
            System.out.println("- Cours de " + c);
        }
    }
}
