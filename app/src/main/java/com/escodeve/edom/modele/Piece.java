package com.escodeve.edom.modele;

import java.util.List;

/**
 * Created by bouza on 7/25/2016.
 */
public class Piece {

    private int id;


    private Logment logmentInstance;

    private List<Equipment> equipmentList;

    private TypePiece typePieceInstance;

    public TypePiece getTypePieceInstance() {
        return typePieceInstance;
    }

    public void setTypePieceInstance(TypePiece typePieceInstance) {
        this.typePieceInstance = typePieceInstance;
    }

    public Piece() {

    }

    public Piece(int id, Logment logmentInstance, List<Equipment> equipmentList) {
        this.id = id;
        this.logmentInstance = logmentInstance;
        this.equipmentList = equipmentList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Logment getLogmentInstance() {
        return logmentInstance;
    }

    public void setLogmentInstance(Logment logmentInstance) {
        this.logmentInstance = logmentInstance;
    }

    public List<Equipment> getEquipmentList() {
        return equipmentList;
    }

    public void setEquipmentList(List<Equipment> equipmentList) {
        this.equipmentList = equipmentList;
    }
}
