package Singleton;

/**
 * Created by krystian on 21.03.17.
 */
public class SingletonExercise {

    private static SingletonExercise instance = null;
    public String message;

    private SingletonExercise() {

    }

    public static synchronized SingletonExercise getInstance() {
        if (instance == null) {
            instance = new SingletonExercise();
        }
        return instance;
    }
}
