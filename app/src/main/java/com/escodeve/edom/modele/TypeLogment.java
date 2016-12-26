package com.escodeve.edom.modele;

import java.util.List;

/**
 * Created by bouza on 7/25/2016.
 */
public class TypeLogment {
    private int id;

    private String designation;
    List<Logment> logmentList;

    public TypeLogment() {
    }

    public TypeLogment(int id, String designation, List<Logment> logmentList) {
        this.id = id;
        this.designation = designation;
        this.logmentList = logmentList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public List<Logment> getLogmentList() {
        return logmentList;
    }

    public void setLogmentList(List<Logment> logmentList) {
        this.logmentList = logmentList;
    }
}
