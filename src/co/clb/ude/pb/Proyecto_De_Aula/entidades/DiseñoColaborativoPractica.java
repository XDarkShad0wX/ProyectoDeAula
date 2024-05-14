/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/licenseprivatedefault.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.clb.ude.pb.Proyecto_De_Aula.entidades;

import java.util.Date;
import java.util.List;

/**
 *
 * @author daniel
 */
public class DiseñoColaborativoPractica {
    private int numeroProfesores;
    private Date fechaDiseño;
    private List<Profesor> profesores;

    public DiseñoColaborativoPractica(){

    }

    public DiseñoColaborativoPractica(int numeroProfesores, Date fechaDiseño, List<Profesor> profesores){
        this.numeroProfesores = numeroProfesores;
        this.fechaDiseño = fechaDiseño;
        this.profesores = profesores;
    }

    public int getNumeroProfesores() {
        return numeroProfesores;
    }

    public Date getFechaDiseño() {
        return fechaDiseño;
    }

    public List<Profesor> getProfesores() {
        return this.profesores;
    }

    public void setNumeroProfesores(int numeroProfesores) {
        this.numeroProfesores = numeroProfesores;
    }

    public void setFechaDiseño(Date fechaDiseño) {
        this.fechaDiseño = fechaDiseño;
    }

    @Override
    public String toString() {
        return "Dise\u00f1oColaborativoPractica{" + "numeroProfesores=" + numeroProfesores + ", fechaDise\u00f1o=" + fechaDiseño + ", profesores=" + profesores + '}';
    }
    
    
}
