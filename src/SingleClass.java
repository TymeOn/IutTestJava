package src;

import java.util.UUID;

/**
 * A class implementing the Singleton design pattern.
 */
public final class SingleClass {
    
    private static SingleClass instance = null;

    private String uuid;

    /**
     * The constructor, which generates uuid.
     */
    private SingleClass() {
        super();
        uuid = UUID.randomUUID().toString();
    }
 
    /**
     * Method for returning the current instance of the SingleClass. If there is none, creates one.
     */
    public static final SingleClass getInstance() {
        if (SingleClass.instance == null) {
            SingleClass.instance = new SingleClass();
        }
        return SingleClass.instance;
    }

    /**
     * Getter for the uuid.
     */
    public String getUUID() {
        return uuid;
    }

}
