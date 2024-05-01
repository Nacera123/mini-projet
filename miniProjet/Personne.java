package miniProjet;

public abstract class Personne {

    // 1- Attributs protégés
    protected int ident;
    protected String nomsocial;
    protected String adresse;

    // 2- le constructeur
    protected Personne(int ident, String nomsocial, String adresse) {
        this.ident = ident;
        this.nomsocial = nomsocial;
        this.adresse = adresse;
    }

    // 3- getter

    protected int getIdent() {
        return ident;
    }

    protected String getNomsocial() {
        return nomsocial;
    }

    protected String getAdresse() {
        return adresse;
    }

    // 4- setter
    protected void setIdent(int ident) {
        this.ident = ident;
    }

    protected void setNomsocial(String nomsocial) {
        this.nomsocial = nomsocial;
    }

    protected void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    // 5- Méthode pour afficher les informations de la personne
    protected void Affiche() {
        System.out.println("Identifiant : " + ident);
        System.out.println("Nom social : " + nomsocial);
        System.out.println("Adresse : " + adresse);
    }
}
