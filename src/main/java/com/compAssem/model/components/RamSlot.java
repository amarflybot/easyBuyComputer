package com.compAssem.model.components;

import java.io.Serializable;
import java.util.List;

/**
 * Created by amarendra on 08/08/15.
 */
public class RamSlot  implements Serializable {

    private static final long serialVersionUID = -5014611656116748793L;
    private Long OID;
    private List<Ram> ramList;

    public Long getOID() {
        return OID;
    }

    public void setOID(Long OID) {
        this.OID = OID;
    }

    public List<Ram> getRamList() {
        return ramList;
    }

    public void setRamList(List<Ram> ramList) {
        this.ramList = ramList;
    }
}
