package practica3;

/**
 * Esta clase, llamada 'Adulto', es hija de la clase 'Persona' y tiene definidos los atributos 'NSS' y 'direccion'.
 *  Contiene sus setters y getters correspondientes y sus constructores vacío y completo respectivamente; también contiene el método ToString.
 * @author: Xavier Borrás Mercant
 * @version: 1.0
 */

public class Adulto extends Persona {
	private String NSS;
	private String direccion;
		
//	SETTERS
	/**
	 * Método set que sirve para otorgar valor a un atributo.
	 * @param NSS El parametro 'NSS', de tipo String, hace referencia al atributo de la clase.
	 */
	public void setNSS(String NSS) {
		this.NSS = NSS;
	}
	
	/**
	 * Método set que sirve para otorgar valor a un atributo.
	 * @param direccion El parametro 'direccion', de tipo String, hace referencia al atributo de la clase.
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
		
//	GETTERS
	/**
	 * Método get que sirve para devolver el valor de un atributo.
	 * @return Devuelve el valor del atributo 'NSS'.
	 */
	public String getNSS() {
		return NSS;
	}
		
	/**
	 * Método get que sirve para devolver el valor de un atributo.
	 * @return Devuelve el valor del atributo 'direccion'.
	 */
	public String getDireccion() {
		return direccion;
	}
	
	/**
	 * Constructor de la clase 'Persona', que establece sus atributos con el valor 'null', o sea, vacíos.
	 */
	// CONSTRUCTORES
	public Adulto() {
		this.NSS = null;
		this.direccion = null;
	}
	
	/**
	 * Constructor completo para otorgarle un valor por defecto a cada atributo de la clase 'Adulto'.
	 * @param NSS El parámetro 'NSS' le otorga un valor en mayúsculas de tipo String al atributo 'NSS' de la clase 'Adulto'.
	 * @param direccion El parámetro 'direccion' le otorga un valor de tipo String al atributo 'direccion' de la clase 'Adulto'.
	 */
	public Adulto(String nombre, String DNI, Integer edad, String NSS, String direccion) {
		super(nombre, DNI, edad);
		this.NSS = NSS.toUpperCase();
		this.direccion = direccion;
	}
	
//	TO STRING
	/**
	 * Este método permite devolver los atributos de un objeto de tipo 'Adulto'.
	 */
	@Override
	public String toString() {
		return ("Nombre: "+getNombre()+" DNI: "+getDNI()+" Edad: "+getEdad()+" NSS: "+NSS+" Dirección: "+direccion);
	}
}
