package unités;

import java.util.ArrayList;
import java.util.List;

public class Soldat extends Unite implements Activité {

    // Création d'une liste de soldats
    private static List<Soldat> instances = new ArrayList<>();

    public Soldat(String name) {
        super(name);
        Soldat.instances.add(this);
    }

    public static List<Soldat> getList() {
        return Soldat.instances;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    // Le soldat peut voguer dans le village
    @Override
    public void voguer() {
        System.out.println("Le soldat " + getName() + " se déplace dans la caserne");
    }

    // 3 types de lieux où un soldat peut se déplacer
    @Override
    public void move(Lieu type) {
        if (type == LieuTypes.MISSION) {
            System.out.println("Le soldat " + getName() + " part en mission");
        } else if(type == LieuTypes.MURAILLE) {
            System.out.println("Le soldat " + getName() + " se poste sur la muraille");
        } else {
            System.out.println("Le soldat " + getName() + " reste à la caserne");
        }
    }

    @Override
    public void seReposer() {
        System.err.println("commande invalide");
    }
}

