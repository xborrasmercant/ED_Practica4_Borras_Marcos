package paquete_persona;

/**
 * Esta clase, llamada 'Adulto', es hija de la clase 'Persona' y tiene definidos los atributos 'NSS' y 'direccion'.
 *  Contiene sus setters y getters correspondientes y sus constructores vac�o y completo respectivamente; tambi�n contiene el m�todo ToString.
 * @author: Xavier Borr�s Mercant
 * @version: 1.0
 */

public class Adulto extends Persona {
	private String NSS;
	private String direccion;
		
//	SETTERS
	/**
	 * M�todo set que sirve para otorgar valor a un atributo.
	 * @param NSS El parametro 'NSS', de tipo String, hace referencia al atributo de la clase.
	 */
	public void setNSS(String NSS) {
		this.NSS = NSS;
	}
	
	/**
	 * M�todo set que sirve para otorgar valor a un atributo.
	 * @param direccion El parametro 'direccion', de tipo String, hace referencia al atributo de la clase.
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
		
//	GETTERS
	/**
	 * M�todo get que sirve para devolver el valor de un atributo.
	 * @return Devuelve el valor del atributo 'NSS'.
	 */
	public String getNSS() {
		return NSS;
	}
		
	/**
	 * M�todo get que sirve para devolver el valor de un atributo.
	 * @return Devuelve el valor del atributo 'direccion'.
	 */
	public String getDireccion() {
		return direccion;
	}
	
	/**
	 * Constructor de la clase 'Persona', que establece sus atributos con el valor 'null', o sea, vac�os.
	 */
	// CONSTRUCTORES
	public Adulto() {
        this("","",0,"","");
    }

    /**
     * Constructor completo para otorgarle un valor por defecto a cada atributo de la clase 'Adulto'.
     * @param NSS El parámetro 'NSS' le otorga un valor en mayúsculas de tipo String al atributo 'NSS' de la clase 'Adulto'.
     * @param direccion El parámetro 'direccion' le otorga un valor de tipo String al atributo 'direccion' de la clase 'Adulto'.
     */
    public Adulto(String nombre, String DNI, Integer edad, String NSS, String direccion) {
        super(nombre, DNI, edad);
        this.setNSS(NSS.toUpperCase());
        this.setDireccion(direccion);
    }
	
//	TO STRING
	/**
	 * Este m�todo permite devolver los atributos de un objeto de tipo 'Adulto'.
	 */
	@Override
	public String toString() {
		return ("Nombre: "+getNombre()+" DNI: "+getDNI()+" Edad: "+getEdad()+" NSS: "+NSS+" Direcci�n: "+direccion);
	}
}
