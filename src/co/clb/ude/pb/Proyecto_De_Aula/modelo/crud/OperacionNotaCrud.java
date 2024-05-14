/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.clb.ude.pb.Proyecto_De_Aula.modelo.crud;
import java.util.List;

import co.clb.ude.pb.Proyecto_De_Aula.entidades.OperacionNota;
import co.clb.ude.pb.Proyecto_De_Aula.modelo.crud.main.ICrudModel;

/**
 *
 * @author daniel
 */
public class OperacionNotaCrud implements ICrudModel<OperacionNota>{

    /* public float calcularPromedioPonderado(OperacionNota operacionNota) {
        List<Float> notas = operacionNota.getNotas();
        List<Float> ponderaciones = operacionNota.getPonderaciones();


            if (notas.size() != ponderaciones.size()) {
                throw new IllegalArgumentException("La cantidad de notas y ponderaciones no coincide.");
            }

        float sumaPonderada = 0;
        float sumaPonderaciones = 0;

        for (int i = 0; i < notas.size(); i++) {
            sumaPonderada += notas.get(i) * ponderaciones.get(i);
            sumaPonderaciones += ponderaciones.get(i);
        }

        if (sumaPonderaciones == 0) {
            throw new ArithmeticException("No se pueden calcular promedios si la suma de ponderaciones es cero.");
        }

        return sumaPonderada / sumaPonderaciones;
    }

    public float calcularPromedio(List<Float> notas) {
        if (notas.isEmpty()) {
            return 0;
        }

        float suma = 0;
        for (Float nota : notas) {
            suma += nota;
        }
        return suma / notas.size();
    }
    /*
    for (OperacionNota operacion : operaciones) {
            if (operacion.getSemestre().equals(semestre)) {
                // Accede a la lista de notas de prácticas individuales desde la OperacionNota
                for (float nota : operacion.getPractica().getNotas()) {
                    sumaNotas += nota;
                    contadorNotas++;
                }
            }
        }

        return contadorNotas > 0 ? sumaNotas / contadorNotas : 0;
    }

    // Otros métodos según sea necesario
    */

    @Override
    public void agregar(OperacionNota objeto) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregar'");
    }

    @Override
    public OperacionNota buscar(String texto) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscar'");
    }

    @Override
    public void editar(OperacionNota objeto) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'editar'");
    }

    @Override
    public void eliminar(String texto) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

    @Override
    public List<OperacionNota> listarTodo() throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarTodo'");
    }

    @Override
    public int contar() throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contar'");
    }
}