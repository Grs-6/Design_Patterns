public class Main {
    public static void main(String[] args) {

        JunctionTrafficController controller = new JunctionTrafficController();

        ITrafficLight northLight = new NorthTrafficLight(controller);
        ITrafficLight southLight = new SouthTrafficLight(controller);
        ITrafficLight eastLight = new EastTrafficLight(controller);
        ITrafficLight westLight = new WestTrafficLight(controller);

        controller.registerTrafficLight("North", northLight);
        controller.registerTrafficLight("South", southLight);
        controller.registerTrafficLight("East", eastLight);
        controller.registerTrafficLight("West", westLight);

        northLight.changeToGreen(); 
        southLight.changeToGreen(); 
        
        northLight.changeToRed();
        eastLight.changeToGreen(); 

        westLight.changeToGreen(); 
        eastLight.changeToRed();
    }
}
