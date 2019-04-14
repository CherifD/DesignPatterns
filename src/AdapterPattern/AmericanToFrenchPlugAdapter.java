package AdapterPattern;

/**
 * @author Cherif
 */
public class AmericanToFrenchPlugAdapter implements FrenchPlugInterface {

    private AmericanPlug americanPlug;
    private String fingerOne;
    private String fingerTwo;
    private String fingerThree;

    public AmericanToFrenchPlugAdapter(String fingerThree, AmericanPlug americanPlug) {
        this.americanPlug = americanPlug;
        this.fingerOne = this.americanPlug.getFingerOne();
        this.fingerTwo = this.americanPlug.getFingerTwo();

        this.fingerThree = fingerThree;
    }

    @Override
    public String chargeMonPortable() {
        return "Success!! ... I charged my American phone in France.  My charger had the following fingers:\n"
                + fingerOne + "\n"
                + fingerTwo + "\n"
                + fingerThree;
    }
}
