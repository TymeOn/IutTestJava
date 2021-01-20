package src;

/**
 * A class inheriting from the "ClassePrincipale" class.
 */
public class ClasseFille extends ClassePrincipale {

    /**
     * The constructor.
     */
    ClasseFille() {
        super();
    }

    /**
     * Overriding the display method of the "ClassePrincipale" class.
     */
    @Override
    public void afficherTexte() {
        System.out.println("Ceci est la classe fille");
    }
}
