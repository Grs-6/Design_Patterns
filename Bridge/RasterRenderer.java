public class RasterRenderer implements Renderer {
    private int width, height;
    private boolean antiAliasing;
    private int colorDepth;

    public RasterRenderer(int width, int height, boolean antiAliasing, int colorDepth) {
        this.width = width;
        this.height = height;
        this.antiAliasing = antiAliasing;
        this.colorDepth = colorDepth;
    }

    @Override
    public void render(int x, int y, String strokeColor, int strokeWidth, String fillColor) {
        System.out.println("Raster Attributes:");
        System.out.println("  Resolution: " + width + "x" + height);
        System.out.println("  Anti-aliasing: " + (antiAliasing ? "enabled" : "disabled"));
        System.out.println("  Color depth: " + colorDepth);
        System.out.println("  Position: (" + x + ", " + y + ")");
        System.out.println("  Stroke color: " + strokeColor);
        System.out.println("  Stroke width: " + strokeWidth);
        System.out.println("  Fill color: " + fillColor);
    }
}
