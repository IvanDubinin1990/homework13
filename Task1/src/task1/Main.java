package task1;

class ArithmeticCalculator {

    private static int pervoeChislo;
    private static int vtoroeChislo;

    public ArithmeticCalculator(int pervoeChislo, int vtoroeChislo) {
        this.pervoeChislo = pervoeChislo;
        this.vtoroeChislo = vtoroeChislo;
    }

    public void calculate(Operation op) {

        if (op == Operation.ADD) {
            System.out.println("Сумма: " + (pervoeChislo + vtoroeChislo));
        }
        if (op == Operation.SUBTRACT) {
            System.out.println("Разность: " + (pervoeChislo - vtoroeChislo));
        }
        if (op == Operation.MULTIPLY) {
            System.out.println("Произведение: " + (pervoeChislo * vtoroeChislo));
        }
    }
}

public class Main {
    public static void main(String[] args) {

        ArithmeticCalculator ar1 = new ArithmeticCalculator(7, 8);
        ar1.calculate(Operation.MULTIPLY);

    }
}