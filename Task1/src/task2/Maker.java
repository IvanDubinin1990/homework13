package task2;

public enum Maker {

    MAKER1 ("AMD"),
    MAKER2 ("Intel");

    private String make;

    Maker (String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }
}
