package src;

/**
 * A class of the project.
 */
public class ClassePrincipale {

    /**
     * The constructor.
     */
    ClassePrincipale() {}

    /**
     * Displaying a text specific to the main class.
     */
    public void afficherTexte() {
        System.out.println("Ceci est la classe principale");
        System.out.println(SingleClass.getInstance().getUUID());
    }
}
