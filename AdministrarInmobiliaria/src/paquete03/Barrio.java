/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

/**
 *
 * @author reroes
 */
public class Barrio {
    private String nombreBarrio;
    private String referencia;
    
    public Barrio(String bar, String refe){
        nombreBarrio = bar;
        referencia = refe;
    }
    public void establecerNombreBarrio(String bar){
        nombreBarrio = bar;
    }
    public String obtenerNombreBarrio(){
        return nombreBarrio;
    }
    
    public void establecerReferencia(String refe){
        referencia = refe;
    }
    public String obtenerReferencia(){
        return referencia;
    }
}
