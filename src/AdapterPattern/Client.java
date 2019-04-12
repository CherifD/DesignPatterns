package AdapterPattern;

import java.util.ArrayList;

/**
 *
 * @author chdiallo
 */
public class Client {

    public static void main(String [] args) {

        ArrayList<FrenchPlugInterface> frenchPlugList = new ArrayList<>();
        FrenchPlugInterface frenchPlug1 = new FrenchPlug("roundTooth1", "roundTooth2", "roundTooth3");

        FrenchPlugInterface amToFrenchAdapter = new AmericanToFrenchPlugAdapter("DummyTooth",
                new AmericanPlug("pointyTooth", "flatTooth"));

        frenchPlugList.add(frenchPlug1);
        frenchPlugList.add(amToFrenchAdapter);

        for (FrenchPlugInterface plug : frenchPlugList) {
            System.out.println(plug.chargeMonPortable());
            System.out.println();
        }

    }
}
