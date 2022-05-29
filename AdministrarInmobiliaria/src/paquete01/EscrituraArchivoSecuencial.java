
package paquete01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;
import paquete06.Departamento;
import paquete06.Casa;

public final class EscrituraArchivoSecuencial {
    private String nombreArchivo;
    private ObjectOutputStream salida; // envía los datos a un archivo
    private Departamento registro;
    private ArrayList<Departamento> listaDepartamentos;
    private ArrayList<Casa> listaCasas;
    private ArrayList<Propietario> listaPropietarios;
    private ArrayList<Barrio> listaBarrios;
    private ArrayList<Ciudad> listaCiudades;
    private ArrayList<Constructora> listaConstructoras;

    public EscrituraArchivoSecuencial(String nombreArc) {
        nombreArchivo = nombreArc;
        establecerListaDepartamentos(); // obtener los valores (objetos)
                                    // que tiene el archivo.
        // System.out.println(obtenerListaProfesores().size());
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerListaDepartamentos().size() > 0) {
                for (int i = 0; i < obtenerListaDepartamentos().size(); i++) {
                    establecerRegistro(obtenerListaDepartamentos().get(i));
                    establecerSalida();
                }            
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        } // fin de catch
        establecerListaCasas(); // obtener los valores (objetos)
                                    // que tiene el archivo.
        // System.out.println(obtenerListaProfesores().size());
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerListaCasas().size() > 0) {
                for (int i = 0; i < obtenerListaCasas().size(); i++) {
                    establecerRegistro(obtenerListaCasas().get(i));
                    establecerSalida();
                }            
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        } // fin de catch
    }
    
    public void establecerNombreArchivo(String n){
        nombreArchivo = n;
    }
    // agrega registros al archivo
    public void establecerRegistro(Departamento p) {
        registro = p;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registro); // envía el registro como salida
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }

    // en el atributo listaProfesores obtenemos los registros 
    // del archivo
    public void establecerListaDepartamentos() {
        LecturaArchivoSecuencial l = new LecturaArchivoSecuencial(obtenerNombreArchivo());
        l.establecerListaDepartamentos();
        listaDepartamentos = l.obtenerListaDepartamento();
    }
    
    public void establecerListaCasas() {
        LecturaArchivoSecuencial l = new LecturaArchivoSecuencial(obtenerNombreArchivo());
        l.establecerListaCasas();
        listaCasas = l.obtenerListaCasas();
    }
    
    public void establecerListaPropietarios() {
        LecturaArchivoSecuencial l = new LecturaArchivoSecuencial(obtenerNombreArchivo());
        l.establecerListaPropietarios();
        listaPropietarios = l.obtenerListaPropietarios();
    }
    
    public void establecerListaBarrios() {
        LecturaArchivoSecuencial l = new LecturaArchivoSecuencial(obtenerNombreArchivo());
        l.establecerListaBarrios();
        listaBarrios = l.obtenerListaBarrios();
    }
    
    public void establecerListaCiudades() {
        LecturaArchivoSecuencial l = new LecturaArchivoSecuencial(obtenerNombreArchivo());
        l.establecerListaCiudades();
        listaCiudades = l.obtenerListaCiudades();
    }
    
    public void establecerListaConstructora() {
        LecturaArchivoSecuencial l = new LecturaArchivoSecuencial(obtenerNombreArchivo());
        l.establecerListaConstructoras();
        listaConstructoras = l.obtenerListaConstructoras();
    }

    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }
    
    public ArrayList<Departamento> obtenerListaDepartamentos() {
        return listaDepartamentos;
    }
    
    public ArrayList<Casa> obtenerListaCasas() {
        return listaCasas;
    }
    
    public ArrayList<Propietario> obtenerListaPropietarios() {
        return listaPropietarios;
    }
    
    public ArrayList<Barrio> obtenerListaBarrios() {
        return listaBarrios;
    }
    
    public ArrayList<Ciudad> obtenerListaCiudad() {
        return listaCiudades;
    }
    
    public ArrayList<Constructora> obtenerListaConstructora() {
        return listaConstructoras;
    }

    public ObjectOutputStream obtenerSalida(){
        return salida;
    }
    public void cerrarArchivo() {
        try // cierra el archivo
        {
            if (salida != null) {
                salida.close();
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            
        } // fin de catch
    } 


}
