/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/licenseprivatedefault.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.clb.ude.pb.Proyecto_De_Aula.entidades;

/**
 *
 * @author daniel
 */
public class AlumnosDestacados {
    private float notasAltas;
    
    public AlumnosDestacados() {
        
    }

    public AlumnosDestacados(float notasAltas) {
        this.notasAltas = notasAltas;
    }

    public float getNotasAltas() {
        return notasAltas;
    }

    public void setNotasAltas(float notasAltas) {
        this.notasAltas = notasAltas;
    }

    @Override
    public String toString() {
        return "AlumnosDestacados{" + "notasAltas=" + notasAltas + '}';
    }
    
    
}
