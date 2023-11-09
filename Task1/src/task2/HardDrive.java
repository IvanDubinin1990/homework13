package task2;

public class HardDrive {

    private TypesHardDrive type;

    private double volumeMemory;

    private int weight;

    public HardDrive(TypesHardDrive type, double volumeMemory, int weight) {
        this.type = type;
        this.volumeMemory = volumeMemory;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
    @Override
    public String toString() {
        return "Жёсткий диск типа: " + type.getType() + ". Объём памяти: " + volumeMemory + ". Вес харда: " + weight;
    }
}
