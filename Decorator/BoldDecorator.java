//concrete decorator 1
public class BoldDecorator extends TextDecorator {
    public BoldDecorator(IText text) {
        super(text);
    }

    @Override
    public String getContent() {
        return "<b>" + decoratedText.getContent() + "</b>";
    }
}
