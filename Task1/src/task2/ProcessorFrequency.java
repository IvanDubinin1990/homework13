package task2;

public enum ProcessorFrequency {

    FREQUENCY1 (3.46),
    FREQUENCY2 (3.33),
    FREQUENCY3 (3.20);

    private double frequency;

    ProcessorFrequency (double frequency) {
        this.frequency = frequency;
    }

    public double getFrequency() {
        return frequency;
    }
}
