/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

/**
 *
 * @author reroes
 */
public class Constructora {
    private String nombreConstructora;
    private String idEmpresa;
    private Constructora constructura;
    
    public void Constructora(String n,String m){
        nombreConstructora = n;
        idEmpresa = m;
    }
    
    public void establecerNombreConstructora(String n){
        nombreConstructora = n;
    }
    
    public void establecerIdEmpresa(String m){
        idEmpresa = m;
    }
    
    public String obtenerNombreConstructora(){
        return nombreConstructora;
    }
    
    public String obtenerIdEmpresa(){
        return idEmpresa;
    }
}
