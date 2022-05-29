/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Scanner;
import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int op = 0;
        do {
            op = menu();
            switch(op){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:menu2();
                    break;
                default:
                    break;
            }
        } while (op!=0);    
    }
    public static int menu(){
        Scanner sc = new Scanner(System.in);
        int op = 0;
        System.out.println("Ingresar nueva Casa              [1]: ");
        System.out.println("Ingresar nuevo Departamento      [2]: ");
        System.out.println("Ingresar nuevo Propietario       [3]: ");
        System.out.println("Ingresar nuevo Barrio            [4]: ");
        System.out.println("Ingresar nueva Ciudad            [5]: ");
        System.out.println("Ingresar nueva Constructora      [6]: ");
        System.out.println("Observar Listas                  [7]: ");
        System.out.println("Salir del Programa               [0]: ");
        op = sc.nextInt();
        return op;
    }
    public static int menu2(){
        Scanner sc = new Scanner(System.in);
        int op = 0;
        System.out.println("Obervar Lista casas              [1]: ");
        System.out.println("Obervar Lista departamentos      [2]: ");
        System.out.println("Obervar Lista propietarios       [3]: ");
        System.out.println("Obervar Lista barrios            [4]: ");
        System.out.println("Obervar Lista ciudades           [5]: ");
        System.out.println("Obervar Lista constructoras      [6]: ");
        System.out.println("Regresar menu anterior:          [0]: ");
        op = sc.nextInt();
        return op;
    }
    public static Propietario buscarPro(){
        Scanner sc = new Scanner(System.in);
        String identificacion;
        String nombres="";
        String apellidos="";
        String nombreArchivo = "data/propietarios.data";
        System.out.println("Ingrese identifiacion del propietario: ");
        identificacion = sc.nextLine();
        Propietario propietarioBuscar;
        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerIdentificador(identificacion);
        lectura.establecerPropietarioBuscado();
        propietarioBuscar = lectura.obtenerPropietarioBuscado();
        if (propietarioBuscar!=null) {
            System.out.printf("Propietario encontrado %s\n",propietarioBuscar);
            return propietarioBuscar;
        }else{
            System.out.println("Ingrese los datos como NUEVO PROPIETARIO!!");
            System.out.println("Ingrese nombres del propietario: ");
            nombres = sc.nextLine();
            System.out.println("Ingrese apellidos del propietario: ");
            apellidos = sc.nextLine();
            System.out.println("Ingrese identificacion del propietario: ");
            identificacion = sc.nextLine();
            Propietario p = new Propietario(nombres,apellidos,identificacion);
            return p;
        }
    }
    public static Barrio buscarBarr(){
        Scanner sc = new Scanner(System.in);
        String nombreBarrio = "";
        String referencia = "";
        String nombreArchivo = "data/barrios.data";
        System.out.println("Ingrese nombre del barrio: ");
        nombreBarrio = sc.nextLine();
        Barrio barrioBuscar;
        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerIdentificador(nombreBarrio);
        lectura.establecerBarrioBuscado();
        barrioBuscar = lectura.obtenerBarrioBuscado();
        if (barrioBuscar!=null) {
            System.out.printf("Barrio encontrado %s\n",barrioBuscar);
            return barrioBuscar;
        }else {
            System.out.println("Barrio no encontrado, ingrese los datos como NUEVO BARRIO!!");
            System.out.println("Ingrese nombre del barrio: ");
            nombreBarrio = sc.nextLine();
            System.out.println("Ingrese referencia: ");
            referencia = sc.nextLine();
            Barrio b = new Barrio(nombreBarrio,referencia);
            return b;
        }
    }
    public static Ciudad buscarCiu(){
        Scanner sc = new Scanner(System.in);
        String nombreCiudad;
        String nombreProvincia;
        String nombreArchivo = "data/ciudades.data";
        System.out.println("Ingrese nombre ciudad: ");
        nombreCiudad = sc.nextLine();
        Ciudad ciudadBuscar;
        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerIdentificador(nombreCiudad);
        lectura.establecerCiudadBuscado();
        ciudadBuscar = lectura.obtenerCiudadBuscado();
        if (ciudadBuscar!=null) {
            System.out.printf("Ciudad encontrada %s\n",ciudadBuscar);
            return ciudadBuscar;
        }else{
            System.out.println("Ciudad no encontrada, ingrese los datos como NUEVA CIUDAD!!");
            System.out.println("Ingrese nombre de la ciudad: ");
            nombreCiudad = sc.nextLine();
            System.out.println("Ingrese nombre de la provincia: ");
            nombreProvincia = sc.nextLine();
            Ciudad c = new Ciudad(nombreCiudad, nombreProvincia);
            return c;
        }
    }
    public static Constructora buscarCons(){
        Scanner sc = new Scanner(System.in);
        String nombreConstructora;
        String idConstructora;
        String nombreArchivo = "data/constructoras.data";
        System.out.println("Ingrese id de la constructora: ");
        idConstructora = sc.nextLine();
        Constructora constructoraBuscar;
        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerIdentificador(idConstructora);
        lectura.establecerConstructoraBuscado();
        constructoraBuscar = lectura.obtenerConstructoraBuscado();
        if (constructoraBuscar!=null) {
            System.out.printf("Constructora encontrada %s\n",constructoraBuscar);
            return constructoraBuscar;
        }else {
            System.out.println("Constructora no encontrada, ingrese los datos como NUEVA CONSTRUCTORA!!");
            System.out.println("Ingrese nombre constructora: ");
            nombreConstructora = sc.nextLine();
            System.out.println("Ingrese id constructora: ");
            idConstructora = sc.nextLine();
            Constructora cons = new Constructora(nombreConstructora, idConstructora);
            return cons;
        }
    }
}
