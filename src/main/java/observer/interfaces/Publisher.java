package observer.interfaces;

/**
 * Created by krystian on 20.03.17.
 */
public interface Publisher {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();
}
