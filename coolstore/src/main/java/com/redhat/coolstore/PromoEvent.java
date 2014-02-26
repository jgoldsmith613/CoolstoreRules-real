package com.redhat.coolstore;

/**
 * This class was automatically generated by the data modeler tool.
 */
@org.kie.api.definition.type.Label(value = "PromoEvent")
public class PromoEvent  implements java.io.Serializable {

static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Label(value = "ItemId")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.String itemId;
    
    @org.kie.api.definition.type.Label(value = "percentOff")
    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.Double percentOff;

    public PromoEvent() {
    }

    public PromoEvent(java.lang.String itemId, java.lang.Double percentOff) {
        this.itemId = itemId;
        this.percentOff = percentOff;
    }


    
    public java.lang.String getItemId() {
        return this.itemId;
    }

    public void setItemId(  java.lang.String itemId ) {
        this.itemId = itemId;
    }
    
    public java.lang.Double getPercentOff() {
        return this.percentOff;
    }

    public void setPercentOff(  java.lang.Double percentOff ) {
        this.percentOff = percentOff;
    }
}