//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    // Tests
    // AVEC LE POUR ALLER PLUS LOIN
    Ecole henriMatisse = new Ecole();
    ArrayList<String> prerequisCyber = new ArrayList<>();
    prerequisCyber.add("Cybersécurité");
    prerequisCyber.add("Php");

    Cours cybersecurite = new Cours(
            "Cybersécurité",
            4,
            prerequisCyber
    );

    ArrayList<Cours> coursBTS = new ArrayList<>();
    coursBTS.add(cybersecurite);

    ArrayList<String> competences = new ArrayList<>();
    competences.add("Cybersécurité");
    competences.add("Php");
    competences.add("Java");

    Professeur maximeChaumes = new Professeur(
            "Chaumes",
            "Maxime",
            "maxime.chaumes@gmail.com",
            32,
            2100,
            competences
    );

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

    cybersecurite.definirProfesseur(maximeChaumes);

    henriMatisse.exportEcole();

}
