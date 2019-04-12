package statePatternTraficLight;

public interface LightState {
    void next(TraficLight traficLight);
    void previous(TraficLight traficLight);
    void printStatus();
}
