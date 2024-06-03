public interface HouseBuilder {
    void buildRooms(int rooms);
    void buildBathrooms(int bathrooms);
    void buildGarden(boolean hasGarden);
    void buildSwimmingPool(boolean hasSwimmingPool);
    void buildGarage(boolean hasGarage);
    House getResult();
}
