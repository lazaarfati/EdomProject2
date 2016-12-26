package com.escodeve.edom.modele;

/**
 * Created by bouza on 7/25/2016.
 */

//Hibernate Inheritance: Table Per Subclass
public class Climatiseur  extends Equipment{

    private float degres;
    private int humidite;
    private float vitesse;
    private double consomation;
    private  int minutrie;
    private int angleVolet;

    public float getDegres() {
        return degres;
    }

    public void setDegres(float degres) {
        this.degres = degres;
    }

    public int getHumidite() {
        return humidite;
    }

    public void setHumidite(int humidite) {
        this.humidite = humidite;
    }

    public float getVitesse() {
        return vitesse;
    }

    public void setVitesse(float vitesse) {
        this.vitesse = vitesse;
    }

    public double getConsomation() {
        return consomation;
    }

    public void setConsomation(double consomation) {
        this.consomation = consomation;
    }

    public int getMinutrie() {
        return minutrie;
    }

    public void setMinutrie(int minutrie) {
        this.minutrie = minutrie;
    }

    public int getAngleVolet() {
        return angleVolet;
    }

    public void setAngleVolet(int angleVolet) {
        this.angleVolet = angleVolet;
    }



}
