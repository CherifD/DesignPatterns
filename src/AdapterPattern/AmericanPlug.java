package AdapterPattern;

/**
 *
 * @author chdiallo
 */
public class AmericanPlug implements AmericanPlugInterface {

    private String fingerOne;
    private String fingerTwo;

    public AmericanPlug(String fingerOne, String fingerTwo) {
        this.fingerOne = fingerOne;
        this.fingerTwo = fingerTwo;
    }

    @Override
    public String plugPhone() {
        return "Awesome!!  I have charged my phone in the USA. My charger had the following teeth:\n"
                + fingerOne + " and " + fingerTwo;
    }

    public String getFingerOne() {
        return fingerOne;
    }

    public String getFingerTwo() {
        return fingerTwo;
    }

}
