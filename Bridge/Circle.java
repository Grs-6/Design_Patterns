public class Circle extends Shape {
    private int cx, cy, radius;
    private String strokeColor;
    private int strokeWidth;
    private String fillColor;

    public Circle(IRenderer renderer, int radius, int cx, int cy, String strokeColor, int strokeWidth, String fillColor) {
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
        System.out.println("Drawing Circle of radius "+this.radius);
        renderer.render(cx, cy, strokeColor, strokeWidth, fillColor);
    }

  
}
