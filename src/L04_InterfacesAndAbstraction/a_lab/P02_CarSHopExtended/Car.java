package L04_InterfacesAndAbstraction.a_lab.P02_CarSHopExtended;

import java.io.Serializable;

public interface Car extends Serializable {
    int TYRES = 4;

    String getModel();
    String getColor();
    Integer getHorsePower();
    String countryProduced();

}
