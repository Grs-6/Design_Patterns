abstract class Shape {
    protected IRenderer renderer;

    public Shape(IRenderer renderer) {
        this.renderer = renderer;
    }

    abstract void draw();
    
}
