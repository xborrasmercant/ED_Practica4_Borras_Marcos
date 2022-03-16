package practica3;

/**
 * Esta clase, llamada 'Ninyo', es hija de la clase 'Persona' y tiene definidos un atributo: 'colegio'.
 *  Contiene sus setters y getters correspondientes y sus constructores vacío y completo respectivamente; también contiene el método ToString.
 * @author: Xavier Borrás Mercant
 * @version: 1.0
 */

public class Ninyo extends Persona {
//	ATRIBUTS
	private String colegio;
				
//	SETTERS
	/**
	 * Método set que sirve para otorgar valor a un atributo.
	 * @param colegio El parámetro 'colegio', de tipo String, hace referencia al atributo de la clase.
	 */
	public void setColegio(String colegio) {
		this.colegio = colegio;
	}
					
//	GETTERS
	/**
	 * Método get que sirve para devolver el valor de un atributo.
	 * @return Devuelve el valor del atributo 'colegio'.
	 */
	public String getColegio() {
		return colegio;
	}
			
	// CONSTRUCTORES
	/**
	 * Constructor de la clase 'Ninyo', que establece sus atributos con el valor 'null', o sea, vacíos.
	 */
	public Ninyo() {
		this.colegio = null;
	}
	
	/**
	 * Constructor completo para otorgarle un valor por defecto a cada atributo de la clase 'Ninyo'.
	 * @param colegio El parámetro 'colegio' le otorga un valor de tipo String al atributo 'colegio' de la clase 'Ninyo'.
	 */
	public Ninyo(String nombre, String DNI, Integer edad, String colegio) {
		super(nombre, DNI, edad);
		this.colegio = colegio;
	}	
	
//	TO STRING
	/**
	 * Este método permite devolver los atributos de un objeto de tipo 'Ninyo'.
	 */
	@Override
	public String toString() {
		return ("Nombre: "+getNombre()+" DNI: "+getDNI()+" Edad: "+getEdad()+" Colegio: "+colegio);
	}
	
}