class Main {
    public static void main(String[] args) {
        Document document = new Document("Design Pattern ");
        System.out.println("Initial content: " + document.getContent());

        document.write("The types include.. ");
        System.out.println("Content after write: " + document.getContent());

        document.save(); // Saving current state

        document.write("1. creational 2. structural and 3. behavioral ");
        System.out.println("Content after more write: " + document.getContent());

        document.save(); // Saving current state

        document.overwrite("Over writting.....");
        System.out.println("Content after overwrite: " + document.getContent());

        document.restore(0); // Restoring to first save
        System.out.println("Content after restore from first save: " + document.getContent());

        document.restore(1); // Restoring to second save
        System.out.println("Content after restore from second save: " + document.getContent());
    }
}