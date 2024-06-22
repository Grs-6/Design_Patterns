//state 3

public class OutOfPaperState implements PrinterState {

    @Override
    public void startPrint(Printer printer) {
        System.out.println("Cannot print. The printer is out of paper.");
    }

    @Override
    public void cancelPrint(Printer printer) {
        System.out.println("No print job to cancel.");
    }

    @Override
    public void loadPaper(Printer printer) {
        System.out.println("Paper loaded.");
        printer.setState(new ReadyState());
    }
}
