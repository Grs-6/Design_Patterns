// RealSubject class
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RealImage implements Image {
    private String filename;
    private final Lock lock = new ReentrantLock();

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromServer();
    }

    private void loadImageFromServer() {
        System.out.println("Loading image from server: " + filename);
        try {
            lock.lock();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock(); 
        }
    }

    public void display() {
        System.out.println("Displaying image: " + filename);
    }
}
