package statePatternTraficLight;

public class GreenLightState implements LightState {

    @Override
    public void next(TraficLight traficLight) {
        traficLight.setLightState(new YellowLightState());
    }

    @Override
    public void previous(TraficLight traficLight) {
        traficLight.setLightState(new RedLightState());
    }

    @Override
    public void printStatus() {
        System.out.println("The light is GREEN, go!");
    }
}
