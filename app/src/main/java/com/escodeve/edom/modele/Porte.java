package com.escodeve.edom.modele;

import java.util.List;

/**
 * Created by bouza on 8/7/2016.
 */
public class Porte extends Equipment{
    private boolean isLocked;

    public Porte() {
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean Locked) {
        isLocked = Locked;
    }

    public Porte(boolean isLocked) {
        this.isLocked = isLocked;
    }

    public Porte(String id_equipement, Piece pieceInstance, TypeEquipment typeEquipmentInstance, List<Piece> pieceList, boolean isLocked) {
        super(id_equipement, pieceInstance, typeEquipmentInstance, pieceList);
        this.isLocked = isLocked;
    }
}
