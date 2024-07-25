import java.util.List;

import batiments.Atelier;
import batiments.Batiment;
import batiments.Caserne;
import batiments.Ferme;
import batiments.Maison;
import batiments.Mur_de_Defense;
import ressources.Bois;
import ressources.Nourriture;
import ressources.Pierre;
import ressources.Ressource;
import unités.Soldat;
import unités.Villageois;
import unités.Artisan;
import unités.Chef;
import unités.Eclaireur;
import unités.Lieu;
import unités.LieuTypes;
import unités.Unite;

class Main {

    public static void main(String[] args) {

        // Construction du village
        Batiment caserne = new Caserne();
        Batiment atelier = new Atelier();
        Batiment ferme = new Ferme();
        Batiment maison = new Maison();
        Batiment mur_de_defense = new Mur_de_Defense();

        caserne.construire();
        atelier.construire();
        ferme.construire();
        maison.construire();
        mur_de_defense.construire();

        // Création des ressources disponbiles
        Ressource nourriture = new Nourriture();
        Ressource bois = new Bois();
        Ressource pierre = new Pierre();

        // Définition de la liste de villageois
        Villageois Thibault = new Villageois("Thibault");
        Villageois Sandrine = new Villageois("Sandrine");

        List<Villageois> villageois = Villageois.getList();
        System.out.println("Les villageaois : " + villageois);

        // Actions des villageaois
        Thibault.collecter(nourriture);
        Sandrine.collecter(bois);
        Villageois.getList().stream().forEach((Villageois leVillageois) -> leVillageois.collecter(pierre));
        Thibault.voguer();
        Sandrine.seReposer();

        // Définition de la liste de soldats
        Soldat JeanCharles = new Soldat("JeanCharles");
        Soldat Olivier = new Soldat("Olivier");
        System.out.println("Les soldats : " + Soldat.getList());
        
        // Actions des soldats
        Olivier.voguer();
        JeanCharles.move((Lieu) LieuTypes.MISSION);

        // Definition du Chef
        Unite chef = new Chef("Morgan");

        // Definition de l'artisan
        Unite artisan = new Artisan("Charlotte");


        // Action mené conjointement par le chef et l'artisan
        System.out.println("Le Chef du village " + chef.getName() + " et son artisan " + artisan.getName()
                + " ont réalisés les plans des maisons");

        // Definition de l'artisan
        Eclaireur eclaireur = new Eclaireur("Omar");

        // Action de l'éclaireur
        eclaireur.move((Lieu) LieuTypes.MISSION);
    }
}
