package observer;

import observer.interfaces.Observer;

/**
 * Created by krystian on 20.03.17.
 */
public class Subscriber implements Observer {

    public int newFilms;
    private String username;

    public Subscriber(String username) {
        this.newFilms = 0;
        this.username = username;
    }

    public void update() {
        newFilms++;
        System.out.println("Witaj " + username + ". Kanał AkademiaKodu wrzucił nowy film. Koniecznie sprawdź.");
    }

    public int getNewFilms() {
        return newFilms;
    }

    public String getUsername() {
        return username;
    }
}
