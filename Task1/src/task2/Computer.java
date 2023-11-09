package task2;

public class Computer {

    private Processor proc;
    private RandomAccessMemory ozu;
    private HardDrive hd;
    private Screen scr;
    private Keyboarb kb;

    public final String VENDOR = "HP";
    public final String NAME = "Homecomputer";

    Computer (Processor proc, RandomAccessMemory ozu, HardDrive hd, Screen scr, Keyboarb kb) {
        this.proc = proc;
        this.ozu = ozu;
        this.hd = hd;
        this.scr = scr;
        this.kb = kb;
    }
    public int summaComp(Computer c1) {
        return proc.getWeight() + ozu.getWeight() + hd.getWeight() + scr.getWeight() + kb.getWeight();
    }

    public Processor getProc() {
        return proc;
    }

    public void setProc(Processor proc) {
        this.proc = proc;
    }

    public RandomAccessMemory getOzu() {
        return ozu;
    }

    public void setOzu(RandomAccessMemory ozu) {
        this.ozu = ozu;
    }

    public HardDrive getHd() {
        return hd;
    }

    public void setHd(HardDrive hd) {
        this.hd = hd;
    }

    public Screen getScr() {
        return scr;
    }

    public void setScr(Screen scr) {
        this.scr = scr;
    }

    public Keyboarb getKb() {
        return kb;
    }

    public void setKb(Keyboarb kb) {
        this.kb = kb;
    }

    @Override
    public String toString() {
        return "Компьютер " + VENDOR + " с именем " + NAME + " состоит из следующих компонентов:\n1. " + proc + "\n2. " + ozu +
                "\n3. " + hd + "\n4. " + scr + "\n5. " + kb;
    }
}

class Main {
    public static void main(String[] args) {

        Processor pr = new Processor(ProcessorFrequency.FREQUENCY3, CountOfCore.CORE2, Maker.MAKER1, 1500);
        RandomAccessMemory r1 = new RandomAccessMemory(TypesMemory.TYPE2, 16, 1700);
        HardDrive hd = new HardDrive(TypesHardDrive.TYPES_HARD_DRIVE2, 4, 4000);
        Screen scr = new Screen(28, TypesOfScreen.TYPES_OF_SCREEN1, 10500);
        Keyboarb key = new Keyboarb(TypesOfKeyboard.TYPES_OF_KEYBOARD1, AvailabilityIllumination.AVAILABILITY_ILLUMINATION1, 3000);

        Computer c1 = new Computer(pr,r1,hd,scr,key);

        System.out.println(c1);
        System.out.println();
        System.out.println("Вес компьютера: " + c1.summaComp(c1));

    }
}

