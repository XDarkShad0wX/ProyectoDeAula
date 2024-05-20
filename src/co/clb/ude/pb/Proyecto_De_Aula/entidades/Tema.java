/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/licenseprivatedefault.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.clb.ude.pb.Proyecto_De_Aula.entidades;

/**
 *
 * @author daniel
 */
public class Tema {
    private String id;
    private String nombre;
    private String descripcion;
    private String recursosAsociados;
    private String dificultad;
    private Evaluacion evaluaciones;
    private Asignatura asignaturas;
    private Profesor profesores;
    
    public Tema(){
        
    }

    public Tema(String id, String nombre, String descripcion, String recursosAsociados, String dificultad, Evaluacion evaluaciones, Asignatura asignaturas, Profesor profesores) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.recursosAsociados = recursosAsociados;
        this.dificultad = dificultad;
        this.evaluaciones = evaluaciones;
        this.asignaturas = asignaturas;
        this.profesores = profesores;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getRecursosAsociados() {
        return recursosAsociados;
    }

    public String getDificultad() {
        return dificultad;
    }

    public Evaluacion getEvaluaciones() {
        return evaluaciones;
    }

    public Asignatura getAsignaturas() {
        return asignaturas;
    }

    public Profesor getProfesores() {
        return profesores;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setRecursosAsociados(String recursosAsociados) {
        this.recursosAsociados = recursosAsociados;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    @Override
    public String toString() {
        return "Tema{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", recursosAsociados=" + recursosAsociados + ", dificultad=" + dificultad + ", evaluaciones=" + evaluaciones + ", asignaturas=" + asignaturas + ", profesores=" + profesores + '}';
    }

    
}
