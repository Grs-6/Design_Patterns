//concrete decorator 2
public class ItalicDecorator extends TextDecorator {
    public ItalicDecorator(IText text) {
        super(text);
    }

    @Override
    public String getContent() {
        return "<i>" + decoratedText.getContent() + "</i>";
    }
}
