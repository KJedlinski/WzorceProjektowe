import ClassicBuilder.Brother;
import ClassicBuilder.PrinterBuilder;
import ClassicBuilder.PrinterDirector;
import ClassicBuilder.data.Printer;
import FluentBuilder.NewCat;
import Singleton.Singleton;
import observer.Subscriber;
import observer.YTCanal;

/**
 * Created by krystian on 20.03.17.
 */
public class Main {
    public static void main(String[] args) {

//Singleton
        Singleton singleton = Singleton.getInstance();
        singleton.someText = "Ala ma kota!";

        Singleton singleton1 = Singleton.getInstance();
        singleton.someText = "Kot nie ma Ali!";

        Singleton singleton3 = Singleton.getInstance();

        System.out.println(singleton.someText);
        System.out.println(singleton1.someText);
        System.out.println(singleton3.someText);

//FluentBuilder - ułatwia tworzenie obiektów, które mają bardzo dużo pól
        NewCat newCat = new NewCat.Builder("Filemon")
                .setAge(5)
                .setColor("Pink")
                .build();

        System.out.println(newCat.getName());

//ClassicBuilder - służy do składania jednego obiektu z wielu klas (tak jak np składanie jednego komputera,
// z wielu przecież części)

        PrinterBuilder brother = new Brother();
        PrinterDirector director = new PrinterDirector(brother);
        director.makePrinter();
        Printer brotherPrinter = director.getPrinter();
        System.out.println(brotherPrinter.getPaper().getColor());

//Observer - służy do nasłuchiwania eventów

        Subscriber subscriber = new Subscriber("Oskar");
        YTCanal ytCanal = new YTCanal();

        ytCanal.register(subscriber);
        ytCanal.publishFilm();

        Subscriber subscriber1 = new Subscriber("Wojtek");
        ytCanal.register(subscriber1);

        Subscriber subscriber2 = new Subscriber("Krystian");
        ytCanal.register(subscriber2);

        ytCanal.publishFilm();

        System.out.println("Ilość filmów do obejrzenia: " + subscriber.getNewFilms()
                            + " dla subskrybenta: " + subscriber.getUsername());
        System.out.println("Ilość filmów do obejrzenia: " + subscriber2.getNewFilms()
                            +" dla subskrybenta: " + subscriber2.getUsername());
    }

//Adapter- przydaje się np do szybkiej implementacji nowego API, bez utraty starych funkcjonalności
}
