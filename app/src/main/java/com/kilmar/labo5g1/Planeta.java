package com.kilmar.labo5g1;

/**
 * Created by uca on 04-16-18.
 */

public class Planeta {
    private int idPlaneta;
    private String nombrePlaneta;
    private String informacion;
    private boolean favorito=false;
    private int position;

    public Planeta(int idPlaneta, String nombrePlaneta, String informacion) {
        this.idPlaneta = idPlaneta;
        this.nombrePlaneta = nombrePlaneta;
        this.informacion = informacion;
    }

    public Planeta() {
    }

    public int getIdPlaneta() {
        return idPlaneta;
    }

    public String getNombrePlaneta() {
        return nombrePlaneta;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setIdPlaneta(int idPlaneta) {
        this.idPlaneta = idPlaneta;
    }

    public void setNombrePlaneta(String nombrePlaneta) {
        this.nombrePlaneta = nombrePlaneta;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }


    public void setFavorito() {
        if (favorito){
            favorito=false;
        }
        else {
            favorito=true;
        }
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
