/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete_motor;
/**
 * Esta clase, llamada 'Barco', tiene definidos los atributos 'nombre','Date' y 
 * 'numCamarote'.
 * Contiene sus setters y getters correspondientes y sus constructores vacio y
 * completo respectivamente; tambien contiene el metodo ToSTring.
 * Ademas utiliza la interfaz 'Sonido' y su metodo 'Sonido'
 * @author: Miguel Marcos Nazco
 * @version: 1.0
 */
/**Importamos el util Date para poder utilizarlo luego
 */
import java.util.Date;
    //CLASE BARCO
//Al usar implements la clase Barco implementa la interfaz Sonido
public class Barco implements Sonido {
//ATRIBUTS
    private String nombre;
    private Date fechaConstruccion;
    private int numCamarote;
/**Llamamos a la clase Motor para poder crear una relación
*de asociacion de composicion con la misma
*/ 
    public Motor motor;

//Setters
    /**
    Metodo set que sirve para otorgar valor a un atributo.
    @param nombre El parámetro 'nombre',de tipo String, hace referencia al 
    *atributo de la clase.
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
    Metodo set que sirve para otorgar valor a un atributo.
    @param fechaConstruccion El parámetro 'fechaConstruccion',de tipo Date,
    *hace referencia al atributo de la clase.
    */
    public void setFechaConstruccion(Date fechaConstruccion) {
        this.fechaConstruccion = fechaConstruccion;
    }
    /**
    * Metodo set que sirve para otorgar valor a un atributo.
    * @param numCamarote El parámetro 'numCamarote',de tipo int,
    * hace referencia al atributo de la clase.
    */
    public void setNumCamarote(int numCamarote) {
        this.numCamarote = numCamarote;
    }
//Getters
    /**
     * Metodo get que sirve para devolver el valor del atributo 'nombre'. 
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo get que sirve para devolver el valor del atributo 
     * 'fechaConstruccion'. 
     * @return 
     */
    public Date getFechaConstruccion() {
        return fechaConstruccion;
    }
    /**
     * Metodo get que sirve para devolver el valor del atributo 'NumCamarote'. 
     * @return 
     */
    public int getNumCamarote() {
        return numCamarote;
    }
//Constructores
    //Constructor Vacio
        /**
         * Constructor de la clase 'Barco', que establece sus atributos con el 
         * valor 'null', o sea, vacios.
         */
    public Barco(){
        /De esta manera cada vez que usemos el constructor se pondra de 
        *base los atributos de la clase Motor
        */ 
        motor = new Motor();
        this.setNombre(null);
        this.setFechaConstruccion(null);
        this.setNumCamarote(0);
    }
    //Constructor Completo
        /**
         * Constructor completo para otorgarle un valor por defecto a cada 
         * atributo de la clase 'Barco'.
         * @param nombre El parametro 'nombre' le otorga un valor tipo 'String' 
         * al atributo 'nombre' de la clase 'Barco'
         * @param fechaConstruccion
         *  El parametro 'fechaConstruccion' le otorga un valor tipo 'Date' 
         * al atributo 'fechaConstruccion' de la clase 'Barco'
         * @param numCamarote 
         *  El parametro 'numCamarote' le otorga un valor tipo 'int' 
         * al atributo 'numCamarote' de la clase 'Barco'
         */
    public Barco(String nombre,Date fechaConstruccion,int numCamarote){
        motor = new Motor();
        this.setNombre(nombre);
        this.setFechaConstruccion(fechaConstruccion);
        this.setNumCamarote(numCamarote);
    }
    }
    /**
     * Metodo 'sonido' de la interfaz 'Sonido'
     */
    @Override
    public void sonido(){
    }
// ToString
    /**
     * Este metodo permite devolver los atributos de un objeto tipo 'Barco'
     * @return 
     */
    @Override
    public String toString() {
        return "Barco{" + "nombre=" + nombre + ", fechaConstruccion=" + 
                fechaConstruccion + ", numCamarote=" + numCamarote + '}';
    }
        
}
