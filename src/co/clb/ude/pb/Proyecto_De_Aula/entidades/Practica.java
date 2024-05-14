/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.clb.ude.pb.Proyecto_De_Aula.entidades;

import java.util.List;

/**
 *
 * @author daniel
 */
public class Practica {
    protected String codigoPractica;
    protected String titulo;
    protected String dificultad;
    protected int nota;
    // protected OperacionNota opercionNotas;
    protected Profesor profesores;
    protected List<Alumno> alumnos;
    protected List<ActividadPracticaGrupal> actividadesGrupales;

    public Practica(){

    }

    public Practica(String codigoPractica, String titulo, String dificultad, int nota, Profesor profesores, List<Alumno> alumnos, List<ActividadPracticaGrupal> actividadesGrupales) {
        this.codigoPractica = codigoPractica;
        this.titulo = titulo;
        this.dificultad = dificultad;
        this.nota = nota;
        this.profesores = profesores;
        this.alumnos = alumnos;
        this.actividadesGrupales = actividadesGrupales;
    }

    public String getCodigoPractica() {
        return codigoPractica;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDificultad() {
        return dificultad;
    }

    public int getNota() {
        return nota;
    }

    public Profesor getProfesores() {
        return this.profesores;
    }

    public List<Alumno> getAlumnos() {
        return this.alumnos;
    }

    public List<ActividadPracticaGrupal> getActividadesGrupales() {
        return this.actividadesGrupales;
    }

    public void setCodigoPractica(String codigoPractica) {
        this.codigoPractica = codigoPractica;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Practica{" + "codigoPractica=" + codigoPractica + ", titulo=" + titulo + ", dificultad=" + dificultad + ", nota=" + nota + ", profesores=" + profesores + ", alumnos=" + alumnos + ", actividadesGrupales=" + actividadesGrupales + '}';
    }
    
}
