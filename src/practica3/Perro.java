/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;

/**
 * Esta clase, llamada 'Perro', tiene definido el atributo 'raza' 
 * Contiene sus setters y getters correspondientes y sus constructores vacio y
 * completo respectivamente; tambien contiene el metodo ToSTring.
 * Ademas utiliza 'extends'lo que hace que sea una clase hija de Mascota
 * @author: Miguel Marcos Nazco
 * @version: 1.0
 */
public class Perro extends Mascota{
//Atributs
    private String raza;
//Setters
    /**
    Metodo set que sirve para otorgar valor a un atributo.
    @param raza El parametro 'nombre',de tipo String, hace referencia al 
    *atributo de la clase.
    */
    public void setRaza(String raza) {
        this.raza = raza;
    }
//Getters
    /**
     * Metodo get que sirve para devolver el valor del atributo 'raza'. 
     * @return 
     */
    public String getRaza() {
        return raza;
    }
//Constructores
    //Constructor Vacío
    /**
     * Constructor de la clase 'Perro', que establece sus atributos con el 
     * valor 'null', o sea, vacios.
     */
    public Perro() {
        this.raza = null;
    }
    //Constructor Completo
    /**
         * Constructor completo para otorgarle un valor por defecto a cada 
         * atributo de la clase 'Barco'.
         * Al utilizar 'super' utiliza los atributos de la superclase
         * @param raza EL parametro 'raza' le otorga un valor tipo 'String'
         * al atributo 'raza' de la clase 'Perro'
         * @param nombre El parametro 'nombre' le otorga un valor tipo 'String' 
         * al atributo 'nombre' de la clase 'Mascota'
         * @param edad
         *  El parametro 'edad' le otorga un valor tipo 'int' 
         * al atributo 'edad' de la clase 'Mascota'
         */
    public Perro(String raza, String nombre, int edad) {
        super(nombre, edad);
        this.raza = raza;
    }
//Método toString
    /**
     * Este metodo permite devolver los atrubutos de un objeto tipo 'Barco'
     * @return 
     */
    @Override
    public String toString() {
        return ("Nombre: " + getNombre() + "Edad: "+ getEdad() +"Raza: "+ raza);
    }
}
