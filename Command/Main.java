public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Light light = new Light();
 
        ICommand turnOnTVCommand = new TurnOnCommand(tv);
        ICommand turnOffTVCommand = new TurnOffCommand(tv);

        ICommand turnOnLightCommand=new TurnOnCommand(light);
        ICommand turnOffLightCommand=new TurnOffCommand(light);

 
        RemoteControl remote = new RemoteControl();

        remote.setCommand(turnOnLightCommand);
        remote.pressButton();
 
        remote.setCommand(turnOnTVCommand);
        remote.pressButton(); 
 
        remote.pressButton();

        remote.setCommand(turnOffTVCommand);
        remote.pressButton(); 
        
        remote.setCommand(turnOffLightCommand);
        remote.pressButton(); 
    }
}