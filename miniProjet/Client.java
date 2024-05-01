package miniProjet;

public class Client extends Personne {

    // 1- ajout variable
    private double chiffreaffaire;

    // 2- constructeur
    public Client(int ident, String nomsocial, String adresse, double chiffreaffaire) {
        super(ident, nomsocial, adresse);
        this.chiffreaffaire = chiffreaffaire;
    }

    // 3- getter
    public double getChiffreaffaire() {
        return this.chiffreaffaire;
    }

    // 4- setter
    public void setChiffreaffaire(double chiffreaffaire) {
        this.chiffreaffaire = chiffreaffaire;
    }

    // 5- Méthode pour afficher les informations de la personne
    @Override
    public void Affiche() {
        super.Affiche();
        System.out.println("chiffre d'affaire : " + chiffreaffaire);
    }
}
