package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int x = 1;
        for (int y = 1; y <= power; y++){
            x *= numberToPrint;
        }
        System.out.println(x);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
