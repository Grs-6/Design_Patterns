//main
public class Main {
    public static void main(String[] args) {

        Text text = new PlainText("Hello, World!");

        Text boldText = new BoldDecorator(text);
        System.out.println(boldText.getContent());

        Text italicBoldText = new ItalicDecorator(boldText);
        System.out.println(italicBoldText.getContent());

        Text underlinedItalicBoldText = new UnderlineDecorator(italicBoldText);
        System.out.println(underlinedItalicBoldText.getContent());

        Text highlightedUnderlinedItalicBoldText = new HighlightDecorator(underlinedItalicBoldText);
        System.out.println(highlightedUnderlinedItalicBoldText.getContent());
    }
}
