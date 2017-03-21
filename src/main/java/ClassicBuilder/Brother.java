package ClassicBuilder;

import ClassicBuilder.data.Paper;
import ClassicBuilder.data.Printer;

/**
 * Created by krystian on 20.03.17.
 */
public class Brother implements PrinterBuilder {

    private Printer printer;

    public Brother(){
        printer = new Printer();
    }

    public void buildPaper() {
        Paper paper = new Paper();
        paper.setColor("green");
        paper.setCount(250);
        paper.setFormat("A5");
        printer.setPaper(paper);

    }

    public void buildPrinter() {
        printer.setModel("G4");
        printer.setPagesPerMinute(15);
    }

    public Printer getPrinter() {
        return printer;
    }
}
