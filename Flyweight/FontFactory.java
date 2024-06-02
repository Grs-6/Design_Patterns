// Flyweight Factory
import java.util.HashMap;
import java.util.Map;

public class FontFactory {
    private static final Map<String, Font> fontPool = new HashMap<>();

    public static Font getFont(String fontName, int fontSize, String color) {
        String key = fontName + "-" + fontSize + "-" + color;
        Font font = fontPool.get(key);

        if (font == null) {
            font = new Font(fontName, fontSize, color);
            fontPool.put(key, font);
            System.out.println("Creating font: " + fontName + " with size " + fontSize + " and color " + color);
        }

        return font;
    }
}
