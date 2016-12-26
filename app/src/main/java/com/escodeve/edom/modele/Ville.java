package com.escodeve.edom.modele;

import java.util.List;

/**
 * Created by bouza on 8/18/2016.
 */
public class Ville {

    private int id;
    private String nom;


    private List<Address> addressList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }
}
