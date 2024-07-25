package unités;

public class Eclaireur extends Unite implements Activité{

    public Eclaireur(String name) {
        super(name);
    }

    @Override
    public void seReposer() {
        System.err.println("commande invalide");
    }

    @Override
    public void voguer() {
        System.err.println("commande invalide");
    }

    //Les explorateurs peuvent partir en exploration hors du village pour découvrir les ressources a proximité
    @Override
    public void move(Lieu type) {
        System.out.println(getName() + " part en exploration hors du village");
    }

    //TODO : Une fois rentré au village il pourra prendre place dans une maison.


}
