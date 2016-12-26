package com.escodeve.edom.modele;



import java.util.List;

/**
 * Created by bouza on 7/25/2016.
 */

public class Logment {

    private int id;

    private String code;

    private List<User> usersList;

    private List<Piece> pieceList;

    TypeLogment typeLogmentInstance;

    private Address addressInstance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<User> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<User> usersList) {
        this.usersList = usersList;
    }

    public List<Piece> getPieceList() {
        return pieceList;
    }

    public void setPieceList(List<Piece> pieceList) {
        this.pieceList = pieceList;
    }

    public TypeLogment getTypeLogmentInstance() {
        return typeLogmentInstance;
    }

    public void setTypeLogmentInstance(TypeLogment typeLogmentInstance) {
        this.typeLogmentInstance = typeLogmentInstance;
    }

    public Address getAddressInstance() {
        return addressInstance;
    }

    public void setAddressInstance(Address addressInstance) {
        this.addressInstance = addressInstance;
    }
}
