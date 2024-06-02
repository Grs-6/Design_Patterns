// Concrete receiver 1
public class TV implements Device {
	@Override
	public void on() {
		System.out.println("TV is now on");
	}

	@Override
	public void off() {
		System.out.println("TV is now off");
	}

	public void changeChannel() {
		System.out.println("Channel changed");
	}
}