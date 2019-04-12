package statePatternTraficLight;

public class YellowLightState implements LightState {

    @Override
    public void next(TraficLight traficLight) {
        traficLight.setLightState(new RedLightState());
    }

    @Override
    public void previous(TraficLight traficLight) {
        traficLight.setLightState(new GreenLightState());
    }

    @Override
    public void printStatus() {
        System.out.println("The light is YELLOW, proceed carefully!");
    }
}
