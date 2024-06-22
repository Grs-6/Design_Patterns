public interface IHouseBuilder {
    void buildRooms(int rooms,float roomWidth,float roomHeight);
    void buildBathrooms(int bathrooms);
    void buildGarden(boolean hasGarden);
    void buildSwimmingPool(boolean hasSwimmingPool);
    void buildGarage(boolean hasGarage);
    House getResult();
}
