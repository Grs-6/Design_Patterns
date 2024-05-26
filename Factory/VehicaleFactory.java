public class VehicaleFactory {

    public static   Vehicle CreateObject(int type) {
        Vehicle vehicle = null;

        switch (type) {
            case 1:
            vehicle = new TwoWheeler();
                break;
            case 2:
            vehicle = new FourWheeler();
            break;
            default:
            System.out.println("No object is created");
                break;
        }

        return vehicle;
    
    }
}