public class Main {
    public static void main(String[] args) {
        Document document = new Document("Initial content\n");
        History history = new History();

        document.write("hi\n");
        history.addMemento(document.createMemento());  
        document.overwrite("hello\n");
        history.addMemento(document.createMemento()); 

        document.write("world\n");
        history.addMemento(document.createMemento()); 

        document.restoreFromMemento(history.getMemento(0));
        System.out.println("Restored to first memento:\n" + document.getContent()); 

        document.restoreFromMemento(history.getMemento(1));
        System.out.println("Restored to second memento:\n" + document.getContent()); 

        document.restoreFromMemento(history.getMemento(2));
        System.out.println("Restored to third memento:\n" + document.getContent());
    }
}
