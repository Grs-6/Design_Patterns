public class Rectangle extends Shape {
    private int x, y, width, height;
    private String strokeColor;
    private int strokeWidth;
    private String fillColor;

    public Rectangle(IRenderer renderer,int width, int height,  int x, int y, String strokeColor, int strokeWidth, String fillColor) {
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
        System.out.println("Drawing Rectangle of width "+this.width+" and height "+this.height);
        renderer.render(x, y, strokeColor, strokeWidth, fillColor);
    }

}
