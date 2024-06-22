// Client code
public class Main {
	public static void main(String[] args) {
		IImage image = new ProxyImage("example.jpg");
		image.display();
		image.display();

		IImage image2 = new ProxyImage("example2.jpg");
		image2.display();
		image2.display();

	}
}
