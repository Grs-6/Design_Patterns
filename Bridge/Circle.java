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
        renderer.renderCommonAttributes();
        renderer.renderCircle(cx, cy, radius, strokeColor, strokeWidth, fillColor);
    }
}
