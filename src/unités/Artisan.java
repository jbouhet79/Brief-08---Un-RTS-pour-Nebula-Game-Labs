package unités;

public class Artisan extends Unite implements Activité {

    public Artisan(String name) {
        super(name);
    }

    @Override
    public void move(Lieu type) {
        System.out.println(getName() + " part en exploration hors du village");

    }

    @Override
    public void voguer() {
        System.err.println("commande invalide");


    }

    @Override
    public void seReposer() {
        System.err.println("commande invalide");

    }

    //TODO : Produit des outils et des armes

    //TODO : améliore les bâtiments

    //TODO : Pour travailler il pourra être placé dans un Atelier, ou sur un emplacement de batisse

    //TODO : Hors travail il pourra voguer dans le village ou se reposer dans une maison.


}
