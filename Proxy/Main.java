// Client code
public class Main {
	public static void main(String[] args) {
		Image image = new ProxyImage("example.jpg");
		image.display();
		image.display();

		Image image2 = new ProxyImage("example2.jpg");
		image2.display();
		image2.display();

	}
}
