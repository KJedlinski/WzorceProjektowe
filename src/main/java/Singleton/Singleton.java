package Singleton;

/**
 * Created by krystian on 20.03.17.
 */
public class Singleton {

    private static Singleton instance = null;
    public String someText;

    private Singleton() {

    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

