package miniProjet;

public class Article {

    // 1-Les attributs privés
    private int refrence;
    private String designation;
    private double prixunitaire;
    private int quantitestock;

    // 2- public constructeur

    public Article(int refrence, String designation, double prixunitaire, int quantitestock) {
        this.refrence = refrence;
        this.designation = designation;
        this.prixunitaire = prixunitaire;
        this.quantitestock = quantitestock;
    }

    // 3- constructeur par copie
    public Article(Article a) {
        this.refrence = a.refrence;
        this.designation = a.designation;
        this.prixunitaire = a.prixunitaire;
        this.quantitestock = a.quantitestock;
    }

    // 4- setter
    public void setRefrence(int refrence) {
        this.refrence = refrence;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setPrixunitaire(double prixunitaire) {
        this.prixunitaire = prixunitaire;
    }

    public void setQuantitestock(int quantitestock) {
        this.quantitestock = quantitestock;
    }

    // 5- Getter

    public int getRefrence() {
        return this.refrence;
    }

    public String getDesignation() {
        return this.designation;
    }

    public double getPrixunitaire() {
        return this.prixunitaire;
    }

    public int getQuantitestock() {
        return this.quantitestock;
    }

    // 6- methode void qui affiche toutes les informations
    public void Affiche() {
        System.out.println("La reference de l'article : " + refrence);
        System.out.println("Le nom de l'article : " + designation);
        System.out.println("Le prix de l'article : " + prixunitaire);
        System.out.println("il y'a : " + quantitestock + "  de l'article " + designation + " en stock");
    }
}
