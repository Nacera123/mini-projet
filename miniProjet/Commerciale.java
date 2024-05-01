package miniProjet;

import java.util.Vector;

public class Commerciale {

    // 1- Les attributs de type Vector
    Vector<Article> articles = new Vector<Article>();
    Vector<Client> clients = new Vector<Client>();
    Vector<Commande> commandes = new Vector<Commande>();
    Vector<Ligne> lignes = new Vector<Ligne>();

    // 2- les méthodes publiques qui seront implémentées

    // 2-a - ajouter commande
    public void Passercommande(Commande c) {
        this.commandes.add(c);
    }

    // 2-b - anuler commande
    public void Annulercommande(Commande c) {
        this.commandes.remove(c);
    }

    // 2-c - ajouter article
    public void AjouterArticle(Article a) {
        this.articles.add(a);
    }

    // 2-d - anuler article
    public void SupprimerArticle(Article a) {
        this.articles.remove(a);
    }

    // 2-e - ajouter client
    public void AjouterClient(Client c) {
        this.clients.add(c);
    }

    // 2-f - anuler article
    public void SupprimerClient(Client c) {
        this.clients.remove(c);
    }

    // 3- Ajout de la Main
    public static void main(String[] args) {

        Commerciale commerciale = new Commerciale();
        Article article1 = new Article(1, "Robinet SOPAL", 120, 50);
        Article article2 = new Article(2, "Minigeur Evier SOPAL", 180, 40);
        Article article3 = new Article(3, "Mitigeur de Bain de douche SOPAL", 318, 30);
        Article article4 = new Article(4, "Mitigeur de lavabo SOPAL", 150, 45);
        Article article5 = new Article(5, "Robinet de toilette SOPAL", 130, 67);

        // insertion d’un article dans le vecteur
        commerciale.AjouterArticle(article1);
        commerciale.AjouterArticle(article2);
        commerciale.AjouterArticle(article3);
        commerciale.AjouterArticle(article4);
        commerciale.AjouterArticle(article5);

        // affichage du vecteur avant la suppression
        article1.Affiche();
        article2.Affiche();
        article3.Affiche();
        article4.Affiche();
        article5.Affiche();

        // suppression article

    }

}
