package ClassicBuilder;

import ClassicBuilder.data.Printer;

/**
 * Created by krystian on 20.03.17.
 */
public interface PrinterBuilder {
    public void buildPaper();
    public void buildPrinter();
    public Printer getPrinter();
}
