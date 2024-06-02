public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Light light = new Light();
 
        Command turnOnTVCommand = new TurnOnCommand(tv);
        Command turnOffTVCommand = new TurnOffCommand(tv);

        Command turnOnLightCommand=new TurnOnCommand(light);
        Command turnOffLightCommand=new TurnOffCommand(light);

 
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