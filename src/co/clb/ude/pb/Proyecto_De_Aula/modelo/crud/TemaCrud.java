/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.clb.ude.pb.Proyecto_De_Aula.modelo.crud;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import co.clb.ude.pb.Proyecto_De_Aula.entidades.Tema;
import co.clb.ude.pb.Proyecto_De_Aula.modelo.crud.main.ICrudModel;

/**
 *
 * @author daniel
 */
public class TemaCrud implements ICrudModel<Tema> {

    private HashMap<String, Tema> bdTema;

    @Override
    public void agregar(Tema objeto) throws Exception {
        try{
            if(bdTema.containsKey(objeto.getId())){
                throw new UnsupportedOperationException("// No se encontro el Tema //");
            }
            bdTema.put(objeto.getId(), objeto);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Tema buscar(String id) throws Exception{
        try {
            if(!bdTema.containsKey(id)){
                throw new UnsupportedOperationException("// No existe //");
            }
            return bdTema.get(id);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void editar(Tema objeto) throws Exception {
        try {
            if(!bdTema.containsKey(objeto.getNombre())){
                throw new Exception("// El Alumno no esta registrado //");
            }
            bdTema.put(objeto.getNombre(), objeto);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void eliminar(String id) throws Exception {
        
        try {
            if(!bdTema.containsKey(id)){
                throw new Exception("// El Tema no existe //");
            }
            
            bdTema.remove(id);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    @Override
    public List<Tema> listarTodo() throws Exception {
        List<Tema> temas = new ArrayList<>();
        
        try {
            
            if(bdTema.isEmpty()){
                
            throw new Exception("// No hay elementos //");
                
            }
            for(Map.Entry<String, Tema> indentificacion : bdTema.entrySet()){
            
            // String obligatorio = indentificacion.getKey();
            Tema tema = indentificacion.getValue();
            
            temas.add(tema);
            }
            return temas;
        
        } catch (Exception e){
            
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public int contar() throws Exception {
        List<Tema> numeroTemas = listarTodo();
        
        int NumeroTemas = 0;
        
        try {
            NumeroTemas = numeroTemas.size();
                if(NumeroTemas == 0){
            
            throw new Exception("// No hay elementos //");
            }
                return NumeroTemas;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
}
