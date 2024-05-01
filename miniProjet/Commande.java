package miniProjet;

import java.util.Date;

public class Commande {

    /**
     * o Les attributs privés suivants : numcomm, datecomm, client.
     * o Les méthodes publiques :
     * ▪ Commande(int numcomm, Date datecomm, Client client) : constucteur
     * qui permet d’initialiser l’objet Commande.
     * ▪ Les accesseurs publiques (getter/setter) des attributs numcomm, datecomm et
     * client.
     */

    // 1- Les attributs privés

    private int numcomm;
    private Date datecomm;
    private Client client;

    // 2- le constructeur public
    public Commande(int numcomm, Date datecomm, Client client) {
        this.numcomm = numcomm;
        this.datecomm = datecomm;
        this.client = client;
    }

    // 3- Setter
    public void setNumcomm(int numcomm) {
        this.numcomm = numcomm;
    }

    public void setDatecomm(Date datecomm) {
        this.datecomm = datecomm;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    // 4- Getter
    public int getNumcomm() {
        return this.numcomm;
    }

    public Date getDatecomm() {
        return this.datecomm;
    }

    public Client getClient() {
        return this.client;
    }

    // 5- Affichage
    public void Affiche() {
        System.out.println("Le numéro de commade : " + numcomm);
        System.out.println("La date de commade : " + datecomm);
        System.out.println("Le client a avoir passé cette commande  : " + client);
    }

}
