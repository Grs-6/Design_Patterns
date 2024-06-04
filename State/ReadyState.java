//state 1

public class ReadyState implements PrinterState {
    private Printer printer;

    public ReadyState(Printer printer) {
        this.printer=printer;
    }

    @Override
    public void startPrint() {
        System.out.println("Printing started.");
        printer.setState(new PrintingState(printer));
    }

    @Override
    public void cancelPrint() {
        System.out.println("No print job to cancel.");
    }

    @Override
    public void loadPaper() {
        System.out.println("Printer already has paper.");
    }
}
