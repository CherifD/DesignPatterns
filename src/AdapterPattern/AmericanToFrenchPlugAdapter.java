package AdapterPattern;

/**
 *
 * @author chdiallo
 */
public class AmericanToFrenchPlugAdapter implements FrenchPlugInterface {

    private AmericanPlug americanPlug;
    private String toothOne;
    private String toothTwo;
    private String toothThree;

    public AmericanToFrenchPlugAdapter(String toothThree, AmericanPlug americanPlug) {
        this.americanPlug = americanPlug;
        this.toothOne = this.americanPlug.getFingerOne();
        this.toothTwo = this.americanPlug.getFingerTwo();

        this.toothThree = toothThree;
    }

    @Override
    public String chargeMonPortable() {
        return "Success!! ... I charged my American phone in France.  My charger had the following teeth:\n"
                + toothOne + "\n"
                + toothTwo + "\n"
                + toothThree;
    }
}
