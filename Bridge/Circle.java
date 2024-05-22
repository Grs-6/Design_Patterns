public class Circle extends Shape {
    private int cx, cy, radius;
    private String strokeColor;
    private int strokeWidth;
    private String fillColor;

    public Circle(Renderer renderer, int cx, int cy, int radius, String strokeColor, int strokeWidth, String fillColor) {
        super(renderer);
        this.cx = cx;
        this.cy = cy;
        this.radius = radius;
        this.strokeColor = strokeColor;
        this.strokeWidth = strokeWidth;
        this.fillColor = fillColor;
    }

    @Override
    void draw() {
        System.out.println("Drawing Circle:");
        renderer.render(cx, cy, strokeColor, strokeWidth, fillColor, getDimensions(), getDimensionDescriptions());
    }

    @Override
    int[] getDimensions() {
        return new int[]{radius};
    }

    @Override
    String[] getDimensionDescriptions() {
        return new String[]{"Radius"};
    }
}
