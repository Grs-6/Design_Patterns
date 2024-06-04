// Client
public class Main {
    public static void main(String[] args) {
        drawText();
    }

    private static void drawText() {

        Font arial12Red = FontFactory.getFont("Arial", 12, "Red");
        arial12Red.applyFormat("Hello World", 0);

        Font times14Blue = FontFactory.getFont("Times New Roman", 14, "Blue");
        times14Blue.applyFormat("Design Patterns", 12);

        
    }
}
