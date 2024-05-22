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
        System.out.println("Drawing Rectangle:");
        renderer.render(x, y, strokeColor, strokeWidth, fillColor, getDimensions(), getDimensionDescriptions());
    }

    @Override
    int[] getDimensions() {
        return new int[]{width, height};
    }

    @Override
    String[] getDimensionDescriptions() {
        return new String[]{"Width", "Height"};
    }
}
