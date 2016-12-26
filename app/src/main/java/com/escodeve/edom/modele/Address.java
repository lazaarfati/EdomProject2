package com.escodeve.edom.modele;

/**
 * Created by bouza on 7/31/2016.
 */
public class Address {

    private int id ;

    private String codePostale;

    private String adress;

    private Logment logmentInstance;
    private Ville villeInstance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodePostale() {
        return codePostale;
    }

    public void setCodePostale(String codePostale) {
        this.codePostale = codePostale;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Logment getLogmentInstance() {
        return logmentInstance;
    }

    public void setLogmentInstance(Logment logmentInstance) {
        this.logmentInstance = logmentInstance;
    }

    public Ville getVilleInstance() {
        return villeInstance;
    }

    public void setVilleInstance(Ville villeInstance) {
        this.villeInstance = villeInstance;
    }
}
