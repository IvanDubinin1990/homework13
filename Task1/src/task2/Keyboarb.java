package task2;

public class Keyboarb {

    private TypesOfKeyboard t1;
    private AvailabilityIllumination a1;
    private int weight;

    public Keyboarb(TypesOfKeyboard t1, AvailabilityIllumination a1, int weight) {
        this.t1 = t1;
        this.a1 = a1;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
    @Override
    public String toString() {
        return "Клавиатура типа: " + t1.getType() + ". Наличие подсветки: " + a1.getCheck() + ". Вес процессора: " + weight;
    }
}
