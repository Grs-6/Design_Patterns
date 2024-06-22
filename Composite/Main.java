public class Main {
    public static void main(String[] args) {
        IFileSystemComponent file1 = new File("File1");
        IFileSystemComponent file2 = new File("File2");
        IFileSystemComponent file3 = new File("File3");

        Directory directory1 = new Directory("Directory1");
        directory1.addcomponent(file1);
        directory1.addcomponent(file2);

        Directory directory2 = new Directory("Directory2");
        directory2.addcomponent(file3);
        directory2.addcomponent(directory1);

        directory2.showDetails();
    }
}
