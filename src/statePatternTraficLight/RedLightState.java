package statePatternTraficLight;

public class RedLightState implements LightState {
    @Override
    public void next(TraficLight traficLight) {
        traficLight.setLightState(new GreenLightState());
    }

    @Override
    public void previous(TraficLight traficLight) {
        traficLight.setLightState(new YellowLightState());
    }

    @Override
    public void printStatus() {
        System.out.println("The light is RED, stop!");
    }
}
