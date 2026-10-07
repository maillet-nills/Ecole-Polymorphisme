public abstract class Employe extends Personne{
    protected double salaire;

    public Employe(String nom, String prenom, String email, int age, double salaire) {
        super(nom, prenom, email, age);
        this.salaire = salaire;
    }
}
