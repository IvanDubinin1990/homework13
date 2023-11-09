package task2;

public enum AvailabilityIllumination {

    AVAILABILITY_ILLUMINATION1 ("Yes"),
    AVAILABILITY_ILLUMINATION2 ("No");

    private String check;

    AvailabilityIllumination(String check) {
        this.check = check;
    }

    public String getCheck() {
        return check;
    }
}
