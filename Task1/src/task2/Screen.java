package task2;

public class Screen {

    private int diagonal;
    private TypesOfScreen scr;
    private int weight;

    public Screen(int diagonal, TypesOfScreen scr, int weight) {
        this.diagonal = diagonal;
        this.scr = scr;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
    @Override
    public String toString() {
        return "Монитор диагональю: " + diagonal + ". Тип матрицы: " + scr.getType() + ". Вес монитора: " + weight;
    }
}
