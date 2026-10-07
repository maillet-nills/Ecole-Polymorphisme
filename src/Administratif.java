public class Administratif extends Employe{

    public Administratif(String nom, String prenom, String email, int age, double salaire) {
        super(nom, prenom, email, age, salaire);
    }

    @Override
    public String GetRole() {
        return "Personnel Administratif.";
    }

    @Override
    public void PrintDesc() {
        System.out.println(super.toString() + " - " + this.salaire + "€/mois - " + GetRole());
    }
}
