//state 1

public class ReadyState implements IPrinterState {
    @Override
    public void startPrint(Printer printer) {
        System.out.println("Printing started.");
        printer.setState(new PrintingState());
    }

    @Override
    public void cancelPrint(Printer printer) {
        System.out.println("No print job to cancel.");
    }

    @Override
    public void loadPaper(Printer printer) {
        System.out.println("Printer already has paper.");
    }
}
