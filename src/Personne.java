public abstract class Personne {
    protected String nom;
    protected String prenom;
    protected String email;
    protected int age;

    public Personne(String nom, String prenom, String email, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.nom + " " + this.prenom + ", " + this.age + " ans, " + this.email;
    }

    public abstract String GetRole();

    public abstract void PrintDesc();
}
