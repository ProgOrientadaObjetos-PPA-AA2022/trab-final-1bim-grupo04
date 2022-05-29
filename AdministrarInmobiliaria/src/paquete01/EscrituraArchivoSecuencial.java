
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
    private Departamento registroDepartamento;
    private Casa registroCasa;
    private Propietario registroPropietario;
    private Barrio registroBarrio;
    private Ciudad registroCiudad;
    private Constructora registroConstructora;
    private ArrayList<Departamento> listaDepartamentos;
    private ArrayList<Casa> listaCasas;
    private ArrayList<Propietario> listaPropietarios;
    private ArrayList<Barrio> listaBarrios;
    private ArrayList<Ciudad> listaCiudades;
    private ArrayList<Constructora> listaConstructoras;
    
    public  EscrituraArchivoSecuencial(String nombreArc) {
        nombreArchivo = nombreArc;
        establecerListaCasas();
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerListaCasas().size() > 0) {
                for (int i = 0; i < obtenerListaCasas().size(); i++) {
                    establecerRegistroCasa(obtenerListaCasas().get(i));
                    establecerSalidaCasa();
                }
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        } // fin de catch
    }
    public  EscrituraArchivoSecuencial(String nombreArc, String id1) {
        nombreArchivo = nombreArc;
        establecerListaDepartamentos();
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerListaDepartamentos().size() > 0) {
                for (int i = 0; i < obtenerListaDepartamentos().size(); i++) {
                    establecerRegistroDepartamento(obtenerListaDepartamentos().get(i));
                    establecerSalidaDepartamento();
                }
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        } // fin de catch
    }
    public void EscrituraArchivoSecuencialPropietario(String nombreArc) {
        nombreArchivo = nombreArc;
        establecerListaPropietarios();
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerListaPropietarios().size() > 0) {
                for (int i = 0; i < obtenerListaPropietarios().size(); i++) {
                    establecerRegistroPropietario(obtenerListaPropietarios().get(i));
                    establecerSalidaPropietario();
                }
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        } // fin de catch
    }
    public void EscrituraArchivoSecuencialBarrio(String nombreArc) {
        nombreArchivo = nombreArc;
        establecerListaBarrios();
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerListaBarrios().size() > 0) {
                for (int i = 0; i < obtenerListaBarrios().size(); i++) {
                    establecerRegistroBarrio(obtenerListaBarrios().get(i));
                    establecerSalidaBarrio();
                }
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        } // fin de catch
    }
    public void EscrituraArchivoSecuencialCiudad(String nombreArc) {
        nombreArchivo = nombreArc;
        establecerListaCiudades();
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerListaCiudad().size() > 0) {
                for (int i = 0; i < obtenerListaCiudad().size(); i++) {
                    establecerRegistroCiudad(obtenerListaCiudad().get(i));
                    establecerSalidaCiudad();
                }
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        } // fin de catch
    }
    public void EscrituraArchivoSecuencialConstructora(String nombreArc) {
        nombreArchivo = nombreArc;
        establecerListaConstructora();
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerListaConstructora().size() > 0) {
                for (int i = 0; i < obtenerListaConstructora().size(); i++) {
                    establecerRegistroConstructora(obtenerListaConstructora().get(i));
                    establecerSalidaConstructora();
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
    public void establecerRegistroDepartamento(Departamento p) {
        registroDepartamento = p;
    }
    public void establecerRegistroCasa(Casa c) {
        registroCasa = c;
    }
    public void establecerRegistroPropietario(Propietario p) {
        registroPropietario = p;
    }
    public void establecerRegistroBarrio(Barrio b) {
        registroBarrio = b;
    }
    public void establecerRegistroCiudad(Ciudad c) {
        registroCiudad = c;
    }
    public void establecerRegistroConstructora(Constructora c) {
        registroConstructora = c;
    }
    public void establecerSalidaDepartamento() {
        try {
            salida.writeObject(registroDepartamento); // envía el registro como salida
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }
    public void establecerSalidaCasa() {
        try {
            salida.writeObject(registroCasa); // envía el registro como salida
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }
    public void establecerSalidaPropietario() {
        try {
            salida.writeObject(registroPropietario); // envía el registro como salida
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }
    public void establecerSalidaBarrio() {
        try {
            salida.writeObject(registroBarrio); // envía el registro como salida
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }
    public void establecerSalidaCiudad() {
        try {
            salida.writeObject(registroCiudad); // envía el registro como salida
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }
    public void establecerSalidaConstructora() {
        try {
            salida.writeObject(registroConstructora); // envía el registro como salida
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
