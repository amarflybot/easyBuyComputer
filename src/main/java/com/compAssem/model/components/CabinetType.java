package com.compAssem.model.components;

import java.io.Serializable;

/**
 * Created by amarendra on 08/08/15.
 */
public class CabinetType implements Serializable {

    private static final long serialVersionUID = -7332315824893042339L;
    private Long OID;

    private String cabinetSize;


    public String getCabinetSize() {
        return cabinetSize;
    }

    public void setCabinetSize(String cabinetSize) {
        this.cabinetSize = cabinetSize;
    }

    public Long getOID() {
        return OID;
    }

    public void setOID(Long OID) {
        this.OID = OID;
    }

}
