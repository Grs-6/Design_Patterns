// Concrete Flyweight
public class Font implements TextFormat {
    private final String fontName; // Intrinsic state
    private final int fontSize; // Intrinsic state
    private final String color; // Intrinsic state

    public Font(String fontName, int fontSize, String color) {
        this.fontName = fontName;
        this.fontSize = fontSize;
        this.color = color;
    }

    @Override
    public void applyFormat(String text, int position) {
        System.out.println("Applying font " + fontName + " with size " + fontSize + " and color " + color +
                " to text at position " + position + ": " + text);
    }
}
