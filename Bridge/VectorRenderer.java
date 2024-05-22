public class VectorRenderer implements Renderer {
    private double precision;
    private double scalingFactor;
    private String coordinateSystem;

    public VectorRenderer(double precision, double scalingFactor, String coordinateSystem) {
        this.precision = precision;
        this.scalingFactor = scalingFactor;
        this.coordinateSystem = coordinateSystem;
    }
    
    @Override
    public void renderCommonAttributes() {
        System.out.println("Common Raster Attributes:");
        System.out.println("  Precision: " + precision);
        System.out.println("  Scaling factor: " + scalingFactor);
        System.out.println("  Coordinate system: " + coordinateSystem);
    }

    @Override
    public void renderCircle(int cx, int cy, int radius, String strokeColor, int strokeWidth, String fillColor) {
        System.out.println("Rendering Circle in vector format:");
        System.out.println("  Center: (" + cx + ", " + cy + ")");
        System.out.println("  Radius: " + radius);
        System.out.println("  Stroke color: " + strokeColor);
        System.out.println("  Stroke width: " + strokeWidth);
        System.out.println("  Fill color: " + fillColor);
       
    }

    @Override
    public void renderRectangle(int x, int y, int width, int height, String strokeColor, int strokeWidth, String fillColor) {
        System.out.println("Rendering Rectangle in vector format:");
        System.out.println("  Position: (" + x + ", " + y + ")");
        System.out.println("  Width: " + width);
        System.out.println("  Height: " + height);
        System.out.println("  Stroke color: " + strokeColor);
        System.out.println("  Stroke width: " + strokeWidth);
        System.out.println("  Fill color: " + fillColor);
    }
}
