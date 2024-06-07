public class ConcreteHouseBuilder implements HouseBuilder {
    private House house;

    public ConcreteHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildRooms(int rooms,float roomWidth,float roomHeight) {
        house.setRooms(rooms,roomWidth,roomHeight);
    }

    @Override
    public void buildBathrooms(int bathrooms) {
        house.setBathrooms(bathrooms);
    }

    @Override
    public void buildGarden(boolean hasGarden) {
        house.setHasGarden(hasGarden);
    }

    @Override
    public void buildSwimmingPool(boolean hasSwimmingPool) {
        house.setHasSwimmingPool(hasSwimmingPool);
    }

    @Override
    public void buildGarage(boolean hasGarage) {
        house.setHasGarage(hasGarage);
    }

    @Override
    public House getResult() {
        return this.house;
    }
}
