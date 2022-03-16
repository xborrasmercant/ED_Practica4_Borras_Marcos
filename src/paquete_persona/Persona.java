package paquete_persona	;

/**
 * Esta clase, llamada 'Persona', tiene definidos los atributos 'nombre', 'DNI' y 'edad'.
 * Contiene sus setters y getters correspondientes y sus constructores vac�o y completo respectivamente; tambi�n contiene el m�todo ToString.
 * @author: Xavier Borr�s Mercant
 * @version: 1.0
 */

public class Persona {
//	ATRIBUTS
	private String nombre;
	private String DNI;
	private int edad;
	
//	SETTERS
	
	/**
	 * M�todo set que sirve para otorgar valor a un atributo.
	 * @param nombre El parametro 'nombre', de tipo String, hace referencia al atributo de la clase.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * M�todo set que sirve para otorgar valor a un atributo.
	 * @param DNI El parametro 'DNI', de tipo String, hace referencia al atributo de la clase.
	 */
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}
	
	/**
	 * M�todo set que sirve para otorgar valor a un atributo.
	 * @param edad El parametro 'edad', de tipo int, hace referencia al atributo de la clase.
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
//	GETTERS
	/**
	 * M�todo get que sirve para devolver el valor del atributo 'nombre'.
	 * @return Devuelve el valor del atributo 'nombre'.
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * M�todo get que sirve para devolver el valor de un atributo.
	 * @return Devuelve el valor del atributo 'DNI'.
	 */
	public String getDNI() {
		return DNI;
	}
	
	/**
	 * M�todo get que sirve para devolver el valor de un atributo.
	 * @return Devuelve el valor del atributo 'edad'.
	 */
	public int getEdad() {
		return edad;
	}
	
// CONSTRUCTORES
	
	/**
	 * Constructor de la clase 'Persona', que establece sus atributos con el valor 'null', o sea, vac�os.
	 */
	public Persona() {
        this.setNombre(null);
        this.setDNI(null);
        this.setEdad(0);
    }

    /**
     * Constructor completo para otorgarle un valor por defecto a cada atributo de la clase 'Persona'.
     * @param nombre El parámetro 'nombre' le otorga un valor en mayúsculas de tipo String al atributo 'nombre' de la clase 'Persona'.
     * @param DNI El parámetro 'DNI' le otorga un valor de tipo String al atributo 'DNI' de la clase 'Persona'.
     * @param nombre El parámetro 'edad' le otorga un valor de tipo int al atributo 'edad' de la clase 'Persona'.
     */
    public Persona(String nombre, String DNI, int edad) {
        this.setNombre(nombre.toUpperCase());
        this.setDNI(DNI);
        this.setEdad(edad);
    }
	
//	TO STRING
	/**
	 * Este m�todo permite devolver los atributos de un objeto de tipo 'Persona'.
	 */
	@Override
	public String toString() {
		return ("Nombre: "+nombre+" DNI: "+DNI+" Edad: "+edad);
	}
	
}