// Client
public class Main {
    public static void main(String[] args) {
        drawText();
    }

    private static void drawText() {

        Font style1 = FontFactory.getFont("Arial", 12, "Red");
        style1.applyFormat("Hello World", 0);

        Font style2 =FontFactory.getFont("Arial", 12, "Red");
        style2.applyFormat("Hello World", 0);

        Font style3 = FontFactory.getFont("Times New Roman", 14, "Blue");
        style3.applyFormat("Design Patterns", 12);

        Font style4 = FontFactory.getFont("Times New Roman", 14, "Blue");
        style4.applyFormat("Design Patterns", 12);
        
    }
}
