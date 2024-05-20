/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.clb.ude.pb.Proyecto_De_Aula.entidades;

/**
 *
 * @author daniel
 */
public class ExamenOtros extends Evaluacion {
    private float ponderacionX;

    public ExamenOtros(){

    }

    public ExamenOtros(float ponderacionX) {
        this.ponderacionX = ponderacionX;
    }

    public float getPonderacionX() {
        return ponderacionX;
    }

    public void setPonderacionX(float ponderacionX) {
        this.ponderacionX = ponderacionX;
    }

    @Override
    public String toString() {
        return "ExamenOtros{" + "ponderacionX=" + ponderacionX + '}';
    }

    
    
}
