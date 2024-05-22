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
    public void render(int x, int y, String strokeColor, int strokeWidth, String fillColor, int[] dimensions, String[] dimensionDescriptions) {
        System.out.println("Vector Attributes:");
        System.out.println("  Precision: " + precision);
        System.out.println("  Scaling factor: " + scalingFactor);
        System.out.println("  Coordinate system: " + coordinateSystem);
        System.out.println("  Stroke color: " + strokeColor);
        System.out.println("  Stroke width: " + strokeWidth);
        System.out.println("  Fill color: " + fillColor);
        System.out.println("  Position: (" + x + ", " + y + ")");
        for (int i = 0; i < dimensions.length; i++) {
            System.out.println("  " + dimensionDescriptions[i] + ": " + dimensions[i]);
        }
    }
}
