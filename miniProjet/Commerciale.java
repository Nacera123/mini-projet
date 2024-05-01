package miniProjet;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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

        boolean ok = this.articles.remove(a);
        if (ok) {
            System.out.println("Article " + a.getDesignation() + " a été supprimée");
        } else {

            System.out.println("Article " + a.getDesignation() + " n'est pas existant dans le vecteur");
        }

    }

    // 2-e - ajouter client
    public void AjouterClient(Client c) {

        this.clients.add(c);
    }

    // 2-f - anuler article
    public void SupprimerClient(Client c) {
        boolean ok = this.clients.remove(c);

        if (ok) {
            System.out.println("Le client " + c.getIdent() + " a été supprimée");
        } else {

            System.out.println("Article " + c.getIdent() + " n'est pas existant dans le vecteur");
        }

    }

    // Methode pour afficher les article
    public void afficheArticle() {
        for (Article article : articles) {
            article.Affiche();
        }
    }

    // Methode pour afficher les article
    public void afficheClientList(List<Client> clients) {
        for (Client client : clients) {
            client.Affiche();
        }
    }

    // Methode pour afficher les article
    public void afficheClient() {
        for (Client client : clients) {
            client.Affiche();
        }
    }

    // 3- Ajout de la Main
    public static void main(String[] args) throws ParseException {

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

        System.out.println("---Avant la suppression---");
        commerciale.afficheArticle();

        // suppression article
        System.out.println("Démarrage de la suppression : ");
        commerciale.SupprimerArticle(article3);
        commerciale.afficheArticle();

        // ajout client
        Client client1 = new Client(1, "zf-123", "125, rue des codeurs", 12500);
        Client client2 = new Client(2, "zf-456", "125, rue des testeurs", 15500);

        List<Client> clientsList = new ArrayList<>();
        clientsList.addAll(List.of(client1, client2));

        for (Client client : clientsList) {
            commerciale.AjouterClient(client);
        }

        System.out.println(" Liste des clients avant suppression ");
        commerciale.afficheClientList(clientsList);

        // supprimer un client
        System.out.println("Démarrage de la suppression : ");
        commerciale.SupprimerClient(client2);
        commerciale.afficheClient();

        // passer une commande
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date date1 = dateFormat.parse("2024-05-01");
            System.out.println(date1);
            Commande commande1 = new Commande(123, date1, client1);
            commande1.Affiche();

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
