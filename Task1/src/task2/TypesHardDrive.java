package task2;

public enum TypesHardDrive {

    TYPES_HARD_DRIVE1 ("HDD"),
    TYPES_HARD_DRIVE2 ("SSD");

    private String type;

    TypesHardDrive(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
