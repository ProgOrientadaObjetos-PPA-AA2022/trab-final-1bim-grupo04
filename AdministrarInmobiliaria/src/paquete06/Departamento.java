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
    
    public void establecerUbicacionEdificio(String n){
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
    
    public double obtenerValorFinal(){
        return valorFinal;
    }
    
    public Barrio obtenerBarrio(){
        return barrio;
    }
    
    public Ciudad obtenerCiudad(){
        return ciudad;
    }
    
    public String obtenerNombreEdificio(){
        return nombreEdificio;
    }
    
    public String obtenerUbicacionEdificio(){
        return ubicacionEdificio;
    }
    
    public Constructora obtenerConstructora(){
        return constructora;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Informacion del Departamento\n"
                + "PROPIETARIO\n"
                + "Nombres: %s Apellidos: %s Identificacion: %s\n"
                + "ESPECIFICACIONES\n"
                + "Nombre Edificio: %s Ubicación Edificio: %s\n"
                + "Precio por metro cuadrado: %.2f Numero de metros cuadrados: %d\n"
                + "Valor Alícuota Mensual: %.2f Costo final: %.2f\n"
                + "BARRIO\n"
                + "Nombre Barrio: %s Referencia%s\n"
                + "CIUDAD\n"
                + "Nombre Ciudad: %s Nombre Provincia: %s\n"
                + "CONSTRUCTORA\n"
                + "Nombre Constructora: %s ID Empresa: %s",
                propietario.obtenerNombres(), propietario.obtenerApellidos(),
                propietario.obtenerIdentificacion(),nombreEdificio,
                ubicacionEdificio,precioMetroCuadrados,numeroMetrosCuadrados,
                alicuotaMensual, valorFinal,barrio.obtenerNombreBarrio(),
                barrio.obtenerReferencia(),ciudad.obtenerNombreCuidad(),
                ciudad.obtenerNombreProvincia(),
                constructora.obtenerNombreConstructora(),
                constructora.obtenerIdEmpresa());
        return cadena;            
    }        
    
}
