//state 2

public class PrintingState implements PrinterState {
    private Printer printer;

    public PrintingState(Printer printer) {
        this.printer=printer;
    }
    @Override
    public void startPrint() {
        System.out.println("Printer is already printing.");
    }

    @Override
    public void cancelPrint() {
        System.out.println("Printing cancelled.");
        printer.setState(new ReadyState(printer));
    }

    @Override
    public void loadPaper() {
        System.out.println("Cannot load paper while printing.");
    }
}
