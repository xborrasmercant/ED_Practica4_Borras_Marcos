/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3_1;

/**
 * Esta clase, llamada 'Mascota', tiene definidos los atributos 'nombre' y 
 * 'edad'.
 * Contiene sus setters y getters correspondientes y sus constructores vacio y
 * completo respectivamente; tambien contiene el metodo ToSTring.
 * Además utiliza la interfaz 'Sonido' y su metodo 'Sonido'
 * @author: Miguel Marcos Nazco
 * @version: 1.0
 */
public class Mascota implements Sonido {
//Atributos
    private String nombre;
    private int edad;
//Setters
    /**
    Método set que sirve para otorgar valor a un atributo.
    @param nombre El parametro 'nombre',de tipo String, hace referencia al 
    *atributo de la clase.
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
    Método set que sirve para otorgar valor a un atributo.
    @param edad El parametro 'edad',de tipo int, hace referencia al 
    *atributo de la clase.
    */
    public void setEdad(int edad) {
        this.edad = edad;
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
     * Metodo get que sirve para devolver el valor del atributo 'edad'. 
     * @return 
     */
    public int getEdad() {
        return edad;
    }
//Constructores
    //Constructor Vacío
    /**
         * Constructor de la clase 'Mascota', que establece sus atributos con el 
         * valor 'null', o sea, vacios.
         */
    public Mascota() {
        this.nombre = null;
        this.edad = 0;
    }
    //Constructor Completo
        /**
         * Constructor completo para otorgarle un valor por defecto a cada 
         * atributo de la clase 'Mascota'.
         * @param nombre El parametro 'nombre' le otorga un valor tipo 'String' 
         * al atributo 'nombre' de la clase 'Mascota'
         * @param edad
         * El parametro 'edad' le otorga un valor tipo 'int' 
         * al atributo 'edad' de la clase 'Mascota'
         */
    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
//Método 'sonido' de la interfaz 'Sonido'
    @Override
    public void sonido(){
    }
//Método toString
    /**
     * Este metodo permite devolver los atrubutos de un objeto tipo 'Barco'
     * @return 
     */
    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
}
