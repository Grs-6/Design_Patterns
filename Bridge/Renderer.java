interface Renderer {
    void renderCommonAttributes();
    void renderCircle(int cx, int cy, int radius, String strokeColor, int strokeWidth, String fillColor);
    void renderRectangle(int x, int y, int width, int height, String strokeColor, int strokeWidth, String fillColor);
}
