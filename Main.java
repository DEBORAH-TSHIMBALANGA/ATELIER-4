import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        List<Produit> produits = new ArrayList<>();


        telephone telephone=new telephone(1,"itel", 100,"batterieRAPIDE" ,53, "android" ,"ios",60 );
        ordinateur ordinateur=new ordinateur(2 ,"lenovo", 150,"12",20,"pc haute qualite","14","20");
        accessoires accessoires=new accessoires(3,"ecouteur",30,"airpord",10,"apple");



        produits.add(telephone);
        produits.add(ordinateur);
        produits.add(accessoires);

        System.out.println("listes produits");

        for (Produit produit: produits){
            System.out.println("Produit:"+produit.getNom()+",prix:"+produit.getPrix()+"dollars");
        }
        List<client>clients=new ArrayList<>();

        client client1=new client(1,"deborah","099324812","debsemail.com");
        client client2=new client(2,"gloria","0993249912","gloriaemail.com");
        client client3=new client(3,"keren","09932491000","kerenemail.com");
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);
        List<commande>commandes=new ArrayList<>();

        while (true){
            System.out.println("/n------menu");
            System.out.println("1.afficher produits");
            System.out.println("2.passer commande");
            System.out.println("3.afficher commande");
            System.out.println("4.quittez");
            System.out.println("choississez option:");
            int choix = scanner.nextInt();
            scanner.nextLine();


            switch (choix) {
                case 1:
                    System.out.println("/nProduits disponibles:");
                    for (Produit produit : produits) {
                        produit.ajouterProduit();
                    }
                    break;


                case 2:
                    System.out.println("/nselectionner client:");
                    for (client client : clients) {
                        client.passerCommande();

                        System.out.println(client.getIdClient() + "." + client.getNom());

                    }
                    System.out.println("choississez client:");

                    int idClient = scanner.nextInt();
                    scanner.nextLine();
                    client client = clients.get(idClient - 1);


                    System.out.println("/nselectionner produits:");

                    for (Produit produit : produits) {
                        produit.ajouterProduit();
                        System.out.println(produit.getIdProduit() + "." + produit.getNom() + "-prix;" + produit.getPrix() + "dollars");

                    }
                        System.out.println("choississez produit:");
                        int idProduit = scanner.nextInt();
                        scanner.nextLine();
                        Produit produit1 = produits.get(idProduit - 1);

                        System.out.println("ENTREZ LA DATE DE COMMANDE:");
                        String dateCommande = scanner.nextLine();


                        commande commande = new commande(1, "15.04.2025", "lenovo");


                    commande.afficherDetail();

                        System.out.println("\ncommande passee avec sucees");
                        break;



                case 3:



                    System.out.println("\nListe des commandes:");
                    for (commande commande1 :commandes ){
                        commande1.afficherDetail();

                    }
                    break;
                case 4:
                System.out.println("Merci");
                return;

                default:
                    System.out.println("invalide");

            }














            }
        }





            commande commande2 =new commande(2,"20.04.2025", "ordinateur");
        commande commande3 =new commande(3,"25.04.2025", "Accessoire");




            }


