package statePatternTraficLight;

public class TraficLight {
    private LightState lightState;

    public TraficLight() {
        this.lightState = new RedLightState();
    }

    public void setLightState(LightState lightState) {
        this.lightState = lightState;
    }

    public LightState getLightState() {
        return this.lightState;
    }

    public void nextLight() {
        this.lightState.next(this);
    }

    public void previousLight() {
        this.lightState.previous(this);
    }

    public void printStatus() {
        this.lightState.printStatus();
    }
}
