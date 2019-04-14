package AdapterPattern;

import java.util.ArrayList;

/**
 *
 * @author chdiallo
 */
public class Client {

    public static void main(String [] args) {

        ArrayList<FrenchPlugInterface> frenchPlugList = new ArrayList<>();
        FrenchPlugInterface frenchPlug1 = new FrenchPlug("doigt1", "doight2", "doigt3");

        FrenchPlugInterface amToFrenchAdapter = new AmericanToFrenchPlugAdapter("doigt3",
                new AmericanPlug("finger1", "finger2"));

        frenchPlugList.add(frenchPlug1);
        frenchPlugList.add(amToFrenchAdapter);

        for (FrenchPlugInterface plug : frenchPlugList) {
            System.out.println(plug.chargeMonPortable());
            System.out.println();
        }
    }
}
