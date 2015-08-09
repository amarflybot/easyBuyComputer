package com.compAssem.model.components;

import java.io.Serializable;

/**
 * Created by amarendra on 08/08/15.
 */
public class GraphicCard  implements Serializable {
    private static final long serialVersionUID = -5841445021133264193L;

    public enum SLOT {PCI,PCIE,APCI}

    private Long OID;
    private GraphicCardSlot graphicCardSlot;

    public Long getOID() {
        return OID;
    }

    public void setOID(Long OID) {
        this.OID = OID;
    }

    public GraphicCardSlot getGraphicCardSlot() {
        return graphicCardSlot;
    }

    public void setGraphicCardSlot(GraphicCardSlot graphicCardSlot) {
        this.graphicCardSlot = graphicCardSlot;
    }
}
