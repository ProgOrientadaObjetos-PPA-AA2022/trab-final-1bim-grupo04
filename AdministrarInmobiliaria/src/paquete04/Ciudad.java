/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

public class Ciudad {
    private String nombreCuidad;
    private String nombreProvincia;
    
    public Ciudad (String n,String c){
        nombreCuidad = n;
        nombreProvincia = c;
    }
    
    public void establecerNombreCuidad(String n){
        nombreCuidad = n;        
    }
    
    public void establecerNombreProvincia(String c){
        nombreProvincia = c;
    }
    
    public String obtenerNombreCuidad(){
        return nombreCuidad;
    }
    
    public String obtenerNombreProvincia(){
        return nombreProvincia;
    }
    
    
    
}
