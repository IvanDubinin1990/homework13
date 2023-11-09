package task2;

public enum TypesMemory {

    TYPE1 ("DDR5 SDRAM"),
    TYPE2 ("DDR4 SDRAM"),
    TYPE3 ("DDR3 SDRAM"),
    TYPE4 ("DDR2 SDRAM");

    private String type;

    TypesMemory (String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
