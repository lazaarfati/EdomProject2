package com.escodeve.edom.modele;

import java.util.List;

/**
 * Created by bouza on 7/25/2016.
 */
public class TypeEquipment {

    private String id;
    private String Designation;
    List<Equipment>equipmentList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public List<Equipment> getEquipmentList() {
        return equipmentList;
    }

    public void setEquipmentList(List<Equipment> equipmentList) {
        this.equipmentList = equipmentList;
    }
}
