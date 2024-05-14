/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.clb.ude.pb.Proyecto_De_Aula.entidades;

/**
 *
 * @author daniel
 */
public class ExamenPractico extends Evaluacion {
    private float ponderacionLaboratorio = 0.70f;
    private float ponderacionEficienciaTiempo = 0.30f;

    public ExamenPractico(){

    }

    public ExamenPractico(float ponderacionLaboratorio, float ponderacionEficienciaTiempo) {
        this.ponderacionLaboratorio = ponderacionLaboratorio;
        this.ponderacionEficienciaTiempo = ponderacionEficienciaTiempo;
    }

    public float getPonderacionLaboratorio() {
        return ponderacionLaboratorio;
    }

    public float getPonderacionEficienciaTiempo() {
        return ponderacionEficienciaTiempo;
    }

    @Override
    public String toString() {
        return "ExamenPractico{" + "ponderacionLaboratorio=" + ponderacionLaboratorio + ", ponderacionEficienciaTiempo=" + ponderacionEficienciaTiempo + '}';
    }
    
}
