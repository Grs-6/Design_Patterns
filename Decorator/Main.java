//main
public class Main {
    public static void main(String[] args) {

        IText text = new PlainText("Hello, World!");

        IText boldText = new BoldDecorator(text);
        System.out.println(boldText.getContent());

        IText italicBoldText = new ItalicDecorator(boldText);
        System.out.println(italicBoldText.getContent());

        IText underlinedItalicBoldText = new UnderlineDecorator(italicBoldText);
        System.out.println(underlinedItalicBoldText.getContent());

        IText highlightedUnderlinedItalicBoldText = new HighlightDecorator(underlinedItalicBoldText);
        System.out.println(highlightedUnderlinedItalicBoldText.getContent());
    }
}
