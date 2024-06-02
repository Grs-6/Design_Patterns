//concrete decorator 3
public class UnderlineDecorator extends TextDecorator {
    public UnderlineDecorator(Text text) {
        super(text);
    }

    @Override
    public String getContent() {
        return "<u>" + decoratedText.getContent() + "</u>";
    }
}
