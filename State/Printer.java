//context class

public class Printer {
    private PrinterState state;

    public Printer() {
        this.state = new ReadyState();
    }

    public void setState(PrinterState state) {
        this.state = state;
    }

    public void startPrint() {
        state.startPrint(this);
    }

    public void cancelPrint() {
        state.cancelPrint(this);
    }

    public void loadPaper() {
        state.loadPaper(this);
    }
}
