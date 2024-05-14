/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.clb.ude.pb.Proyecto_De_Aula.modelo.crud;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import co.clb.ude.pb.Proyecto_De_Aula.entidades.Practica;
import co.clb.ude.pb.Proyecto_De_Aula.modelo.crud.main.ICrudModel;

/**
 *
 * @author daniel
 */
public class PracticaCrud implements ICrudModel<Practica> {

    private HashMap<String, Practica> bdPractica;


    @Override
    public void agregar(Practica objeto) throws Exception {
        try{
            if(bdPractica.containsKey(objeto.getCodigoPractica())){
                throw new UnsupportedOperationException("// No se encontro la Actividad Practica //");
            }
            bdPractica.put(objeto.getCodigoPractica(), objeto);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Practica buscar(String codigoPractica) throws Exception{
        try {
            if(!bdPractica.containsKey(codigoPractica)){
                throw new UnsupportedOperationException("// No existe //");
            }
            return bdPractica.get(codigoPractica);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void editar(Practica objeto) throws Exception {
        try {
            if(!bdPractica.containsKey(objeto.getCodigoPractica())){
                throw new Exception("// La Practica no esta registrada //");
            }
            bdPractica.put(objeto.getCodigoPractica(), objeto);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    @Override
    public void eliminar(String codigoPractica) throws Exception {
        
        try {
            if(!bdPractica.containsKey(codigoPractica)){
                throw new Exception("// El Grupo no existe //");
            }
            
            bdPractica.remove(codigoPractica);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    @Override
    public List<Practica> listarTodo() throws Exception {
        List<Practica> practicas = new ArrayList<>();
        
        try {
            
            if(bdPractica.isEmpty()){
                
            throw new Exception("// No hay elementos //");
                
            }
            for(Map.Entry<String, Practica> indentificacion : bdPractica.entrySet()){
            
            //String obligatorio = indentificacion.getKey();
            Practica practica = indentificacion.getValue();
            
            practicas.add(practica);
            }
            return practicas;
        
        } catch (Exception e){
            
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public int contar() throws Exception {
        List<Practica> numeroPracticas = listarTodo();
        
        int NumeroPracticas = 0;
        
        try {
            NumeroPracticas = numeroPracticas.size();
                if(NumeroPracticas == 0){
            
            throw new Exception("// No hay elementos //");
            }
                return NumeroPracticas;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
}
