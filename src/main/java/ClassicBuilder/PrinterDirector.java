package ClassicBuilder;

import ClassicBuilder.data.Printer;

/**
 * Created by krystian on 20.03.17.
 */
public class PrinterDirector {
    private PrinterBuilder printerBuilder;

    public PrinterDirector(PrinterBuilder printerBuilder) {
        this.printerBuilder = printerBuilder;
    }

    public void makePrinter() {
        printerBuilder.buildPaper();
        printerBuilder.buildPrinter();
    }

    public Printer getPrinter() {
        return printerBuilder.getPrinter();
    }
}
