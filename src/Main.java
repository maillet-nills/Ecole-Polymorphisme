//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    // Tests
    Ecole henriMatisse = new Ecole();
    ArrayList<String> coursBTS = new ArrayList<>();

    coursBTS.add("Java");
    coursBTS.add("Php");
    coursBTS.add("Cybersécurité");

    Etudiant emmaBaron = new Etudiant(
            "Baron",
            "Emma",
            "baronemma31@gmail.com",
            22,
            coursBTS
    );
    Etudiant kimySechao = new Etudiant(
            "Sechao",
            "Kimy",
            "kimysechao6@gmail.com",
            19,
            coursBTS
    );
    Etudiant benjaminBastide = new Etudiant(
            "Bastide",
            "Benjamin",
            "spoltienet@gmail.com",
            21,
            coursBTS
    );

    Professeur maximeChaumes = new Professeur(
            "Chaumes",
            "Maxime",
            "maxime.chaumes@gmail.com",
            32,
            2100,
            coursBTS
    );

    Administratif kararAliHassan = new Administratif(
      "Ali Hassan",
      "Karar",
      "karar.alihassan@gmail.com",
      8,
            230
    );

    henriMatisse.AjouterPersonne(emmaBaron);
    henriMatisse.AjouterPersonne(kimySechao);
    henriMatisse.AjouterPersonne(benjaminBastide);
    henriMatisse.AjouterPersonne(maximeChaumes);
    henriMatisse.AjouterPersonne(kararAliHassan);

    henriMatisse.ListerPersonnes();

}
