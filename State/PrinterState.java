//state Interface

public interface PrinterState {
    void startPrint(Printer printer);
    void cancelPrint(Printer printer);
    void loadPaper(Printer printer);
}
