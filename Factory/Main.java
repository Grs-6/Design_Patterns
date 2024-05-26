import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter vehicle type");
        int type= scanner.nextInt();
        
        Vehicle vehicle=VehicaleFactory.CreateObject(type);
        System.out.println(vehicle.printVehicle());
        
        scanner.close();

    }
}

