package com.compAssem.model.components;

import java.io.Serializable;
import java.util.List;

/**
 * Created by amarendra on 08/08/15.
 */
public class PowerSupplyWatt  implements Serializable {

    private static final long serialVersionUID = -8324823113960891629L;
    private Long OID;
    private List<PowerSupply> powerSupplyList;

    public Long getOID() {
        return OID;
    }

    public void setOID(Long OID) {
        this.OID = OID;
    }

    public List<PowerSupply> getPowerSupplyList() {
        return powerSupplyList;
    }

    public void setPowerSupplyList(List<PowerSupply> powerSupplyList) {
        this.powerSupplyList = powerSupplyList;
    }
}
