//state 3

public class OutOfPaperState implements PrinterState {
    private Printer printer;

    public OutOfPaperState(Printer printer) {
        this.printer=printer;
    }

    @Override
    public void startPrint() {
        System.out.println("Cannot print. The printer is out of paper.");
    }

    @Override
    public void cancelPrint() {
        System.out.println("No print job to cancel.");
    }

    @Override
    public void loadPaper() {
        System.out.println("Paper loaded.");
        printer.setState(new ReadyState(printer));
    }
}
