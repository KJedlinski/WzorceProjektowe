package observer;

import observer.interfaces.Observer;
import observer.interfaces.Publisher;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by krystian on 20.03.17.
 */
public class YTCanal implements Publisher {

    private List<Observer> observers;

    public YTCanal(){
        observers = new ArrayList<Observer>();
    }

    public void register(Observer o) {
        observers.add(o);
    }

    public void unregister(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for(Observer o: observers){
            o.update();
        }
    }

    public void publishFilm(){
        System.out.println("Dodałeś nowy film!");
        notifyObservers();
    }
}
