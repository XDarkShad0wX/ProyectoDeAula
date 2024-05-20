/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.clb.ude.pb.Proyecto_De_Aula.entidades;

/**
 *
 * @author daniel
 */
public class ActividadPracticaGrupal extends Practica {
    private int numeroIntegrantes;
    
    public ActividadPracticaGrupal(){
    
    }

    public ActividadPracticaGrupal(int numeroIntegrantes) {
        this.numeroIntegrantes = numeroIntegrantes;
    }

    public int getNumeroIntegrantes() {
        return numeroIntegrantes;
    }

    public void setNumeroIntegrantes(int numeroIntegrantes) {
        this.numeroIntegrantes = numeroIntegrantes;
    }

    @Override
    public String toString() {
        return "ActividadPracticaGrupal{" + "numeroIntegrantes=" + numeroIntegrantes + '}';
    }
    
    
}
