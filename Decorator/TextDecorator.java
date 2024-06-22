//base decorator
public abstract class TextDecorator implements IText {
    protected IText decoratedText;

    public TextDecorator(IText text) {
        this.decoratedText = text;
    }

    @Override
    public String getContent() {
        return decoratedText.getContent();
    }
}
