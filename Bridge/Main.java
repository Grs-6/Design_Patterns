public class Main {
    public static void main(String[] args) {
        Renderer rasterRenderer = new RasterRenderer(800, 600, true, 24);
        Renderer vectorRenderer = new VectorRenderer(0.01, 1.0, "Cartesian");

        Shape circle = new Circle(rasterRenderer, 50, 50, 40, "black", 3, "red");
        Shape rectangle = new Rectangle(vectorRenderer, 10, 10, 100, 50, "blue", 3, "green");

        circle.draw();
        rectangle.draw();
    }
}
