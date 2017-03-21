package ClassicBuilder;

import ClassicBuilder.data.Paper;
import ClassicBuilder.data.Printer;

/**
 * Created by krystian on 20.03.17.
 */
public class HPDeskJetBuilder implements PrinterBuilder {
    private Printer printer;

    public HPDeskJetBuilder() {
        printer = new Printer();
    }

    public void buildPaper() {
        Paper paper = new Paper();
        paper.setColor("white");
        paper.setCount(200);
        paper.setFormat("A4");

        printer.setPaper(paper);
    }

    public void buildPrinter() {
        printer.setModel("HP");
        printer.setPagesPerMinute(5);

    }

    public Printer getPrinter() {
        return printer;
    }
}
