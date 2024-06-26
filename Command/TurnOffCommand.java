// Concrete command 2
public class TurnOffCommand implements ICommand {
	private IDevice device;

	public TurnOffCommand(IDevice device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.off();
	}
}

