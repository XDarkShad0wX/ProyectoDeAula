/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.clb.ude.pb.Proyecto_De_Aula.entidades;
import java.util.Date;
import java.util.List;
/**
 *
 * @author daniel
 */
public class Profesor extends Usuario {
    private String departamentoAcademico;
    private String cargo;
    private Date fechaInicioContrato;
    private Date fechaFinContrato;
    private List<Asignatura> AsociadasAsi;
    private List<Practica> AsociadasPr;
    private List<DiseñoColaborativoPractica> AsociadasDi;
    private List<Tema> AsociadosT;
    
    public Profesor(){
    
}

    public Profesor(String departamentoAcademico, String cargo, Date fechaInicioContrato, Date fechaFinContrato, List<Asignatura> AsociadasAsi, List<Practica> AsociadasPr, List<DiseñoColaborativoPractica> AsociadasDi, List<Tema> AsociadosT) {
        this.departamentoAcademico = departamentoAcademico;
        this.cargo = cargo;
        this.fechaInicioContrato = fechaInicioContrato;
        this.fechaFinContrato = fechaFinContrato;
        this.AsociadasAsi = AsociadasAsi;
        this.AsociadasPr = AsociadasPr;
        this.AsociadasDi = AsociadasDi;
        this.AsociadosT = AsociadosT;
    }

    public String getDepartamentoAcademico() {
        return departamentoAcademico;
    }

    public String getCargo() {
        return cargo;
    }

    public Date getFechaInicioContrato() {
        return fechaInicioContrato;
    }

    public Date getFechaFinContrato() {
        return fechaFinContrato;
    }

    public List<Asignatura> getAsociadasAsi() {
        return this.AsociadasAsi;
    }

    public List<Practica> getAsociadasPr() {
        return this.AsociadasPr;
    }

    public List<DiseñoColaborativoPractica> getAsociadasDi() {
        return this.AsociadasDi;
    }

    public List<Tema> getAsociadosT() {
        return this.AsociadosT;
    }

    public void setDepartamentoAcademico(String departamentoAcademico) {
        this.departamentoAcademico = departamentoAcademico;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setFechaInicioContrato(Date fechaInicioContrato) {
        this.fechaInicioContrato = fechaInicioContrato;
    }

    public void setFechaFinContrato(Date fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }

    @Override
    public String toString() {
        return "Profesor{" + "departamentoAcademico=" + departamentoAcademico + ", cargo=" + cargo + ", fechaInicioContrato=" + fechaInicioContrato + ", fechaFinContrato=" + fechaFinContrato + ", AsociadasAsi=" + AsociadasAsi + ", AsociadasPr=" + AsociadasPr + ", AsociadasDi=" + AsociadasDi + ", AsociadosT=" + AsociadosT + '}';
    }
    
}


    /*
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Departamento académico: " + departamentoAcademico);
        System.out.println("Cargo: " + cargo);
    }
}
*/