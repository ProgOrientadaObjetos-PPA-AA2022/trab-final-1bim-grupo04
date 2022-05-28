/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;
import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

public class Departamento {
    private Propietario propietario;
    private double precioMetroCuadrados;
    private int numeroMetrosCuadrados;
    private double alicuotaMensual;
    private double valorFinal;
    private Barrio barrio;
    private Ciudad ciudad;
    private String nombreEdificio;
    private String ubicacionEdificio;
    private Constructora constructora;
    
    public void establecerPropietario(Propietario n){
        propietario = n;
    }
    
    public void establecerPrecioMetroCuadrado(double c){
        precioMetroCuadrados = c;
    }
    
    public void establecerNumeroMetrosCuadrados(int c){
        numeroMetrosCuadrados = c;
    }
    
    public void establecerAlicuotaMensual(double c){
        alicuotaMensual = c;
    }
    
    public void establecerValorFinal(){
        valorFinal = ((numeroMetrosCuadrados * precioMetroCuadrados) 
                + (alicuotaMensual * 12));
    }
    
    public void establecerBarrio(Barrio n){
        barrio = n;
    }
    
    public void establecerCuidad(Ciudad n){
        ciudad = n;
    }
    
    public void establecerNombreEdificios(String n){
        nombreEdificio = n;
    }
    
    public void establecerUbicacionEdificios(String n){
        ubicacionEdificio = n;
    }
    
    public void establecerConstructora(Constructora n){
        constructora = n;
    }
    
    public Propietario obtenerPropietario(){
        return propietario;
    }
    
    public double obtenerPrecioMetroCuadrado(){
        return precioMetroCuadrados;
    }
    
    public int obtenerNumeroMetrosCuadrados(){
        return numeroMetrosCuadrados;
    }
    
    public double obtenerAlicuotaMensual(){
        return alicuotaMensual;
    }
    
    
}
