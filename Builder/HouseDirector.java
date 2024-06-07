public class HouseDirector {
    private HouseBuilder builder;

    public HouseDirector(HouseBuilder builder) {
        this.builder = builder;
    }

    public void constructSimpleHouse(int rooms, int bathrooms) {
        builder.buildRooms(rooms,10,10);
        builder.buildBathrooms(bathrooms);
    }

    public void constructLuxuryHouse(int rooms,int bathrooms) {
        builder.buildRooms(rooms,50,50);
        builder.buildBathrooms(bathrooms);
        builder.buildGarden(true);
        builder.buildSwimmingPool(true);
        builder.buildGarage(true);
    }

    public House getHouse() {
        return builder.getResult();
    }
}
