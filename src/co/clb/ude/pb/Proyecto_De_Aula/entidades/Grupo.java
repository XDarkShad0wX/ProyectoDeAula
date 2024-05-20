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
public class Grupo {
    private String nombre;
    private List<Alumno> alumnos;
    private List<Asignatura> asignaturas;

    public Grupo(){

    }

    public Grupo(String nombre, List<Alumno> alumnos, List<Asignatura> asignaturas){
        this.nombre = nombre;
        this.alumnos = alumnos;
        this.asignaturas = asignaturas;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Alumno> getAlumnos() {
        return this.alumnos;
    }

    public List<Asignatura> getAsignaturas() {
        return this.asignaturas;
    }

    @Override
    public String toString() {
        return "Grupo{" + "nombre=" + nombre + ", alumnos=" + alumnos + ", asignaturas=" + asignaturas + '}';
    }
    
    
}
