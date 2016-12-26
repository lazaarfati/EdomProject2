package com.escodeve.edom.modele;

import java.util.List;

/**
 * Created by bouza on 7/25/2016.
 */
public class Role {


    private int id_role;

    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    private String nomRole;





    public Role() {
    }

    public Role(int id_role, String nomRole, List<User> userList) {
        this.id_role = id_role;
        this.nomRole = nomRole;

    }

    public int    getId_role() {
        return id_role;
    }

    public void setId(int id_role) {
        this.id_role = id_role;
    }

    public String getNomRole() {
        return nomRole;
    }

    public void setNomRole(String designation) {
        this.nomRole = designation;
    }

    public void setId_role(int id_role) {
        this.id_role = id_role;
    }





}
