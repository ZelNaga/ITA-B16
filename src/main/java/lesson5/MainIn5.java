package lesson5;

import lesson5.services.Electricity;
import lesson5.services.Gas;

/**
 * Created by asv on 26.05.17.
 */
public class MainIn5 {

    public static void main(String[] args) {

        Gas gas = new Gas();
        Electricity electricity = new Electricity();

        House house = new House();

        house.addService(gas);
        house.addService(electricity);

        house.useAllServicesWithForLoop();
    }
}
