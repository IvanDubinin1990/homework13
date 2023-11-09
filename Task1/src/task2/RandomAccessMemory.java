package task2;

public class RandomAccessMemory {

    private TypesMemory typ;

    private double volume;

    private int weight;

    public RandomAccessMemory(TypesMemory typ, double volume, int weight) {
        this.typ = typ;
        this.volume = volume;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Оперативная память типа: " + typ.getType() + ". Объём: " + volume + ". Вес ОЗУ: " + weight;
    }
}
