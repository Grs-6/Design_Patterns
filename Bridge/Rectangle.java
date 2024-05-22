public class Rectangle extends Shape {
    private int x, y, width, height;
    private String strokeColor;
    private int strokeWidth;
    private String fillColor;

    public Rectangle(Renderer renderer, int x, int y, int width, int height, String strokeColor, int strokeWidth, String fillColor) {
        super(renderer);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.strokeColor = strokeColor;
        this.strokeWidth = strokeWidth;
        this.fillColor = fillColor;
    }

    @Override
    void draw() {
        renderer.renderCommonAttributes();
        renderer.renderRectangle(x, y, width, height, strokeColor, strokeWidth, fillColor);
    }
}
