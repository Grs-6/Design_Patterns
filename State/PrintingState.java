//state 2

public class PrintingState implements IPrinterState {
    
    @Override
    public void startPrint(Printer printer) {
        System.out.println("Printer is already printing.");
    }

    @Override
    public void cancelPrint(Printer printer) {
        System.out.println("Printing cancelled.");
        printer.setState(new ReadyState());
    }

    @Override
    public void loadPaper(Printer printer) {
        System.out.println("Cannot load paper while printing.");
    }
}
