package com.escodeve.edom.modele;

/**
 * Created by Fati on 05/08/2016.
 */
public class Equipement {

    private String type;
    private int iconID;
    private String name;
    boolean selected = false;

    public Equipement(String name, int iconID, String type) {
        super();
        this.type = type;
        this.iconID = iconID;
        this.name = name;
    }

    public String gettype() {
        return type;
    }

    public int getIconID() {
        return iconID;
    }
    public String getname() {
        return name;
    }
    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

}

    
