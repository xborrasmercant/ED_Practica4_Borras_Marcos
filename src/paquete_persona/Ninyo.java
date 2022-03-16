package paquete_persona;

/**
 * Esta clase, llamada 'Ninyo', es hija de la clase 'Persona' y tiene definidos un atributo: 'colegio'.
 *  Contiene sus setters y getters correspondientes y sus constructores vac�o y completo respectivamente; tambi�n contiene el m�todo ToString.
 * @author: Xavier Borr�s Mercant
 * @version: 1.0
 */

public class Ninyo extends Persona {
//	ATRIBUTS
	private String colegio;
				
//	SETTERS
	/**
	 * M�todo set que sirve para otorgar valor a un atributo.
	 * @param colegio El par�metro 'colegio', de tipo String, hace referencia al atributo de la clase.
	 */
	public void setColegio(String colegio) {
		this.colegio = colegio;
	}
					
//	GETTERS
	/**
	 * M�todo get que sirve para devolver el valor de un atributo.
	 * @return Devuelve el valor del atributo 'colegio'.
	 */
	public String getColegio() {
		return colegio;
	}
			
	// CONSTRUCTORES
	/**
	 * Constructor de la clase 'Ninyo', que establece sus atributos con el valor 'null', o sea, vac�os.
	 */
	public Ninyo() {
		this.colegio = null;
	}
	
	/**
	 * Constructor completo para otorgarle un valor por defecto a cada atributo de la clase 'Ninyo'.
	 * @param colegio El par�metro 'colegio' le otorga un valor de tipo String al atributo 'colegio' de la clase 'Ninyo'.
	 */
	public Ninyo(String nombre, String DNI, Integer edad, String colegio) {
		super(nombre, DNI, edad);
		this.colegio = colegio;
	}	
	
//	TO STRING
	/**
	 * Este m�todo permite devolver los atributos de un objeto de tipo 'Ninyo'.
	 */
	@Override
	public String toString() {
		return ("Nombre: "+getNombre()+" DNI: "+getDNI()+" Edad: "+getEdad()+" Colegio: "+colegio);
	}
	
}