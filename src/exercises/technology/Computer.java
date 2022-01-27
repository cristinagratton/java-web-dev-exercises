package exercises.technology;

public class Computer extends AbstractEntity{
    private int storage;
    private int ram;
    private String graphicsCard;
    private boolean hasRGB;

    public Computer(int storage, int ram, String graphicsCard) {
        this.storage = storage;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
    }

    public void increaseRam(int ramNumber) {
        this.ram = this.ram + ramNumber;
    }

    public void increaseStorage(int storageNumber) {
        this.storage = this.storage + storageNumber;
    }

    public int getStorage() {
        return storage;
    }

    public int getRam() {
        return ram;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }


}
