public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.startPrint();
        printer.startPrint(); 
        printer.loadPaper(); 
        printer.cancelPrint(); 

        printer.loadPaper();
        printer.startPrint(); 
        printer.cancelPrint();

        printer.setState(new OutOfPaperState(printer));

        printer.startPrint(); 
        printer.loadPaper();
        printer.startPrint();
    }
}
