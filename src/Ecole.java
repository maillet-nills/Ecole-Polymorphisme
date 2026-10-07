import java.util.ArrayList;

public class Ecole {
    private ArrayList<Personne> listePersonnes;

    public Ecole() {
        this.listePersonnes = new ArrayList<Personne>();
    }

    public void AjouterPersonne(Personne p){
        listePersonnes.add(p);
    }

    public void ListerPersonnes(){
        for (Personne p : listePersonnes){
            System.out.println("###" + p.nom + " " + p.prenom + " ###");
            p.PrintDesc();
        }
    }
}
