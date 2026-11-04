import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
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
            System.out.println("\n### " + p.nom + " " + p.prenom + " ###");
            p.PrintDesc();
        }
    }

    public void exportEcole(){
        Path path = Path.of("./exportEcole.txt");
        for (Personne p : listePersonnes){
            double salaire = 0;
            if(p.getClass().getSuperclass().getName().equals("Employe")){
                salaire = ((Employe) p).salaire;
            }
            String contenu = p.nom + ";" + p.prenom + ";" + p.email + ";" + p.getClass().getName() + ";" + salaire + "\n";
            try {
                Files.writeString(path, contenu, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                System.out.println("Écriture réussie !");
            } catch (IOException e) {
                System.err.println("Erreur d'écriture : " + e.getMessage());
            }
        }
    }
}
