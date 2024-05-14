/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.clb.ude.pb.Proyecto_De_Aula.entidades;

/**
 *
 * @author daniel
 */
public class ExamenEscrito extends Evaluacion {
    private final float ponderacionTeóricoConceptual = 0.80f;
    private final float ponderacionRedacciónOrtografía = 0.20f;

    public ExamenEscrito(){

    }

    public float getPonderacionTeóricoConceptual() {
        return ponderacionTeóricoConceptual;
    }

    public float getPonderacionRedacciónOrtografía() {
        return ponderacionRedacciónOrtografía;
    }

    @Override
    public String toString() {
        return "ExamenEscrito{" + "ponderacionTe\u00f3ricoConceptual=" + ponderacionTeóricoConceptual + ", ponderacionRedacci\u00f3nOrtograf\u00eda=" + ponderacionRedacciónOrtografía + '}';
    }

    
    
}
