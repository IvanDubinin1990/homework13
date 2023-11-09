package task2;

public enum TypesOfScreen {

    TYPES_OF_SCREEN1 ("IPS"),
    TYPES_OF_SCREEN2 ("TN"),
    TYPES_OF_SCREEN3 ("VA");

    private String type;

    TypesOfScreen(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
