//concrete decorator 4
public class HighlightDecorator extends TextDecorator {
    public HighlightDecorator(Text text) {
        super(text);
    }

    @Override
    public String getContent() {
        return "<mark>" + decoratedText.getContent() + "</mark>";
    }
}
