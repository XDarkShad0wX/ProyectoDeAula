/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/licenseprivatedefault.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.clb.ude.pb.Proyecto_De_Aula.entidades;
import java.util.List;

/**
 *
 * @author daniel
 */
public class OperacionNota {
    private List<Float> notas;
    private List<Float> ponderaciones;
    
    public OperacionNota(){
        
    }

    public OperacionNota(List<Float> notas, List<Float> ponderaciones) {
        this.notas = notas;
        this.ponderaciones = ponderaciones;
    }

    public List<Float> getNotas() {
        return notas;
    }

    public List<Float> getPonderaciones() {
        return ponderaciones;
    }

    @Override
    public String toString() {
        return "OperacionNota{" + "notas=" + notas + ", ponderaciones=" + ponderaciones + '}';
    }

    
}