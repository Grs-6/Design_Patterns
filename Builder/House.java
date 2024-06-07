public class House {
    private int rooms;
    private int bathrooms;
    private boolean hasGarden=false;
    private boolean hasSwimmingPool = false;
    private boolean hasGarage = false;
    private float roomWidth;
    private float roomHeight;

    public House() {}

    public void setRooms(int rooms,float roomWidth,float roomHeight) {
        this.rooms = rooms;
        this.roomWidth =roomWidth;
        this.roomHeight =roomHeight;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    public void setHasSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    @Override
    public String toString() {
        return "House{" +
                "rooms=" + rooms + " room width= "+ roomWidth + " room height= " + roomHeight +
                ", bathrooms=" + bathrooms +
                ", hasGarden=" + hasGarden +
                ", hasSwimmingPool=" + hasSwimmingPool +
                ", hasGarage=" + hasGarage +
                '}';
    }
}
