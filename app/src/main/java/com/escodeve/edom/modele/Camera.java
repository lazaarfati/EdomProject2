package com.escodeve.edom.modele;

/**
 * Created by bouza on 8/7/2016.
 */
public class Camera extends Equipment{


    private int angle;
    private boolean enableRotation;
    private boolean enableNightVision;

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public boolean isEnableRotation() {
        return enableRotation;
    }

    public void setEnableRotation(boolean enableRotation) {
        this.enableRotation = enableRotation;
    }

    public boolean isEnableNightVision() {
        return enableNightVision;
    }

    public void setEnableNightVision(boolean enableNightVision) {
        this.enableNightVision = enableNightVision;
    }
}
