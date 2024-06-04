public class Main {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("File1");
        FileSystemComponent file2 = new File("File2");
        FileSystemComponent file3 = new File("File3");

        Directory directory1 = new Directory("Directory1");
        directory1.addcomponent(file1);
        directory1.addcomponent(file2);

        Directory directory2 = new Directory("Directory2");
        directory2.addcomponent(file3);
        directory2.addcomponent(directory1);

        directory2.showDetails();
    }
}
