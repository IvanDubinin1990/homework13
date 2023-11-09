package task2;

public class Processor {

    private ProcessorFrequency p1;

    private CountOfCore c1;

    private Maker m1;

    private int weight;

    public Processor (ProcessorFrequency p1, CountOfCore c1, Maker m1, int weight) {
        this.p1 = p1;
        this.c1 = c1;
        this.m1 = m1;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public ProcessorFrequency getP1() {
        return p1;
    }

    public CountOfCore getC1() {
        return c1;
    }

    public Maker getM1() {
        return m1;
    }

    @Override
    public String toString() {
        return "Процессор: " + p1.getFrequency() + ". Количество ядер: " + c1.getCore() + ". Производитель процессора: " + m1.getMake() + ". Вес процессора: " + weight;
    }
}
