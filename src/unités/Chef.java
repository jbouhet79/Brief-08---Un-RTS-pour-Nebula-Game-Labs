package unités;

public class Chef extends Unite implements Activité {

    public Chef(String name) {
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

    @Override
    public void move(Lieu lieu) {
        System.err.println("commande invalide");
    }

    //TODO : Il aura un comportement proche de celui des soldats.

}
