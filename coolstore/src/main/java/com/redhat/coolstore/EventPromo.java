package com.redhat.coolstore;

/**
 * This class was automatically generated by the data modeler tool.
 */
@org.kie.api.definition.type.Label(value = "Event Promotion")
public class EventPromo  implements java.io.Serializable {

static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Label(value = "Item ID")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.String itemId;

    public EventPromo() {
    }

    public EventPromo(java.lang.String itemId) {
        this.itemId = itemId;
    }


    
    public java.lang.String getItemId() {
        return this.itemId;
    }

    public void setItemId(  java.lang.String itemId ) {
        this.itemId = itemId;
    }
}