package com.escodeve.edom.modele;

import java.util.List;

/**
 * Created by bouza on 7/25/2016.
 */
public  abstract class Equipment {

    private String id_equipement;

    private String designation;

    private Piece pieceInstance;

    private TypeEquipment typeEquipmentInstance;

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public Equipment() {
    }

    public Equipment(String id_equipement, Piece pieceInstance, TypeEquipment typeEquipmentInstance, List<Piece> pieceList) {
        this.id_equipement = id_equipement;
        this.pieceInstance = pieceInstance;
        this.typeEquipmentInstance = typeEquipmentInstance;

    }

    public String getId_equipement() {
        return id_equipement;
    }

    public void setId_equipement(String id) {
        this.id_equipement = id;
    }

    public Piece getPieceInstance() {
        return pieceInstance;
    }

    public void setPieceInstance(Piece pieceInstance) {
        this.pieceInstance = pieceInstance;
    }

    public TypeEquipment getTypeEquipmentInstance() {
        return typeEquipmentInstance;
    }

    public void setTypeEquipmentInstance(TypeEquipment typeEquipmentInstance) {
        this.typeEquipmentInstance = typeEquipmentInstance;
    }




}
