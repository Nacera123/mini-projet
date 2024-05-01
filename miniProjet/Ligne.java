package miniProjet;

public class Ligne {

    // 1- Les attributs privés
    private Commande commande;
    private Article article;
    private Client client;

    // 2- le constructeur public
    public Ligne(Commande commande, Article article, Client client) {
        this.commande = commande;
        this.article = article;
        this.client = client;
    }

    // 3- Les accesseurs publiques
    // setter
    public void setCommande(Commande commande) {
        this.commande = commande;

    }

    public void setArticle(Article article) {
        this.article = article;

    }

    public void setClient(Client client) {
        this.client = client;

    }

    // getter

    public Commande getCommande() {
        return this.commande;
    }

    public Article getArticle() {
        return this.article;
    }

    public Client getClient() {
        return this.client;
    }

}
