package task2;

public enum TypesOfKeyboard {

    TYPES_OF_KEYBOARD1 ("for work"),
    TYPES_OF_KEYBOARD2 ("for game");

    private String type;

    TypesOfKeyboard(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
