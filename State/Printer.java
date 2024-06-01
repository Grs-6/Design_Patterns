//context class

public class Printer {
    private PrinterState state;

    public Printer() {
        this.state = new ReadyState(this);
    }

    public void setState(PrinterState state) {
        this.state = state;
    }

    public void startPrint() {
        state.startPrint();
    }

    public void cancelPrint() {
        state.cancelPrint();
    }

    public void loadPaper() {
        state.loadPaper();
    }
}
