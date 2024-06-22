// Concrete command 1
public class TurnOnCommand implements ICommand {
	private IDevice device;

	public TurnOnCommand(IDevice device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.on();
	}
}