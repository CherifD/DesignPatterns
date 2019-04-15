package statePatternTraficLight;

public class Client {

    public static void main(String[] args) {
        TraficLight tl = new TraficLight();

        tl.printStatus();
        tl.nextLight();
        tl.nextLight();
        tl.printStatus();
        tl.previousLight();
        tl.printStatus();
        tl.nextLight();
        tl.printStatus();
    }
}
