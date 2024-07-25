package unités;

import java.util.ArrayList;
import java.util.List;

import batiments.Constructible;
import ressources.Collectable;

public class Villageois extends Unite implements Activité {

    // creation d'une liste de villageois
    private static List<Villageois> instances = new ArrayList<>();

    public Villageois(String name) {
        super(name);
        Villageois.instances.add(this);
    }

    public static List<Villageois> getList() {
        return Villageois.instances;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    // Offre la possibilté de collecter aux villageois
    public void collecter(Collectable collectable) {
        collectable.collecter();
        System.out.println("par " + this.getName());
    }

    // Offre la possibilté de construire aux villageois
    public void construire(Constructible constructible) {
        constructible.construire();
        System.out.println("par " + this.getName());
    }

    // Le villageois peut voguer dans le village
    @Override
    public void voguer() {
        System.out.println(getName() + " vogue dans le village");
    }

    // Le villageois peut se reposer dans une maison
    @Override
    public void seReposer() {
        System.out.println(getName() + " se repose dans la maison");
    }

    @Override
    public void move(Lieu type) {
        System.err.println("commande invalide");
    }
}
