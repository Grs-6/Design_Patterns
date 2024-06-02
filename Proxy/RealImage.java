// RealSubject class
public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromServer();
    }

    private void loadImageFromServer() {
        System.out.println("Loading image from server: " + filename);
        try {
            Thread.sleep(2000); // Simulate network latency
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void display() {
        System.out.println("Displaying image: " + filename);
    }
}
