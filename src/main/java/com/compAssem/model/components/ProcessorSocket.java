package com.compAssem.model.components;

import java.io.Serializable;

/**
 * Created by amarendra on 08/08/15.
 */
public class ProcessorSocket  implements Serializable {

    private static final long serialVersionUID = -6686108161283164324L;
    private Long OID;

    public Long getOID() {
        return OID;
    }

    public void setOID(Long OID) {
        this.OID = OID;
    }


}
