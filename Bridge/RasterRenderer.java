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
    public void renderCommonAttributes() {
        System.out.println("Common Raster Attributes:");
        System.out.println("  Resolution: " + width + "x" + height);
        System.out.println("  Anti-aliasing: " + (antiAliasing ? "enabled" : "disabled"));
        System.out.println("  Color depth: " + colorDepth);
    }

    @Override
    public void renderCircle(int cx, int cy, int radius, String strokeColor, int strokeWidth, String fillColor) {
        System.out.println("Rendering Circle in raster format:");
        System.out.println("  Center: (" + cx + ", " + cy + ")");
        System.out.println("  Radius: " + radius);
        System.out.println("  Stroke color: " + strokeColor);
        System.out.println("  Stroke width: " + strokeWidth);
        System.out.println("  Fill color: " + fillColor);
    }

    @Override
    public void renderRectangle(int x, int y, int width, int height, String strokeColor, int strokeWidth, String fillColor) {
        System.out.println("Rendering Rectangle in raster format:");
        System.out.println("  Position: (" + x + ", " + y + ")");
        System.out.println("  Width: " + width);
        System.out.println("  Height: " + height);
        System.out.println("  Stroke color: " + strokeColor);
        System.out.println("  Stroke width: " + strokeWidth);
        System.out.println("  Fill color: " + fillColor);
    }
}
