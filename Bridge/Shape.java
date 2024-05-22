abstract class Shape {
    protected Renderer renderer;

    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    abstract void draw();
    abstract int[] getDimensions();
    abstract String[] getDimensionDescriptions();
}
