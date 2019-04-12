package AdapterPattern;

/**
 *
 * @author chdiallo
 */
public class FrenchPlug implements FrenchPlugInterface {

    private String fingerOne;
    private String fingerTwo;
    private String fingerThree;

    public FrenchPlug(String fingerOne, String fingerTwo, String fingerThree) {
        this.fingerOne = fingerOne;
        this.fingerTwo = fingerTwo;
        this.fingerThree = fingerThree;
    }

    public String getFingerOne() {
        return fingerOne;
    }

    public String getFingerTwo() {
        return fingerTwo;
    }

    public String getFingerThree() {
        return fingerThree;
    }

    @Override
    public String chargeMonPortable() {
        return "Fabuleux!! J'ai chargé mon téléphone en France. Mon chargeur avait les doigts suivants:\n"
                + fingerOne + "\n"
                + fingerTwo + "\n"
                + fingerThree;
    }

}
