package practica3;

/**
 * Esta clase, llamada 'Persona', tiene definidos los atributos 'nombre', 'DNI' y 'edad'.
 * Contiene sus setters y getters correspondientes y sus constructores vacío y completo respectivamente; también contiene el método ToString.
 * @author: Xavier Borrás Mercant
 * @version: 1.0
 */

public class Persona {
//	ATRIBUTS
	private String nombre;
	private String DNI;
	private int edad;
	
//	SETTERS
	
	/**
	 * Método set que sirve para otorgar valor a un atributo.
	 * @param nombre El parametro 'nombre', de tipo String, hace referencia al atributo de la clase.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Método set que sirve para otorgar valor a un atributo.
	 * @param DNI El parametro 'DNI', de tipo String, hace referencia al atributo de la clase.
	 */
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}
	
	/**
	 * Método set que sirve para otorgar valor a un atributo.
	 * @param edad El parametro 'edad', de tipo int, hace referencia al atributo de la clase.
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
//	GETTERS
	/**
	 * Método get que sirve para devolver el valor del atributo 'nombre'.
	 * @return Devuelve el valor del atributo 'nombre'.
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Método get que sirve para devolver el valor de un atributo.
	 * @return Devuelve el valor del atributo 'DNI'.
	 */
	public String getDNI() {
		return DNI;
	}
	
	/**
	 * Método get que sirve para devolver el valor de un atributo.
	 * @return Devuelve el valor del atributo 'edad'.
	 */
	public int getEdad() {
		return edad;
	}
	
// CONSTRUCTORES
	
	/**
	 * Constructor de la clase 'Persona', que establece sus atributos con el valor 'null', o sea, vacíos.
	 */
	public Persona() {
		this.nombre = null;
		this.DNI = null;
		this.edad = 0;
	}
	
	/**
	 * Constructor completo para otorgarle un valor por defecto a cada atributo de la clase 'Persona'.
	 * @param nombre El parámetro 'nombre' le otorga un valor en mayúsculas de tipo String al atributo 'nombre' de la clase 'Persona'.
	 * @param DNI El parámetro 'DNI' le otorga un valor de tipo String al atributo 'DNI' de la clase 'Persona'.
	 * @param nombre El parámetro 'edad' le otorga un valor de tipo int al atributo 'edad' de la clase 'Persona'.
	 */
	public Persona(String nombre, String DNI, int edad) {
		this.nombre = nombre.toUpperCase();
		this.DNI = DNI;
		this.edad = edad;
	}
	
//	TO STRING
	/**
	 * Este método permite devolver los atributos de un objeto de tipo 'Persona'.
	 */
	@Override
	public String toString() {
		return ("Nombre: "+nombre+" DNI: "+DNI+" Edad: "+edad);
	}
	
}