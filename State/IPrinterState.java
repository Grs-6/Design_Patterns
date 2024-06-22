//state Interface

public interface IPrinterState {
    void startPrint(Printer printer);
    void cancelPrint(Printer printer);
    void loadPaper(Printer printer);
}
