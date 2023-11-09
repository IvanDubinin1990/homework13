package task2;

public enum CountOfCore {

    CORE1 (2),
    CORE2 (4),
    CORE3 (6);

    private int core;

    CountOfCore (int core) {
        this.core = core;
    }

    public int getCore() {
        return core;
    }
}
