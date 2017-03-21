import Singleton.SingletonExercise;

/**
 * Created by krystian on 21.03.17.
 */
public class MainExercise {
    public static void main(String[] args) {

//Ćwiczenia ze wzorców projektowych
    //Singleton
        SingletonExercise singleton = SingletonExercise.getInstance();
        singleton.message = "You are disconnected";

        SingletonExercise singleton2 = SingletonExercise.getInstance();
        singleton2.message = "You are connected";

        System.out.println(singleton.message);
    }
}
