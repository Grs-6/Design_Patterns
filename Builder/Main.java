public class Main {
    public static void main(String[] args) {
        HouseBuilder builder = new ConcreteHouseBuilder();
        HouseDirector director = new HouseDirector(builder);

        // Construct a simple house
        director.constructSimpleHouse(3,2);
        House simpleHouse = director.getHouse();
        System.out.println("Simple House: " + simpleHouse);

        // Construct a luxury house
        director.constructLuxuryHouse(4,5);
        House luxuryHouse = director.getHouse();
        System.out.println("Luxury House: " + luxuryHouse);
    }
}
