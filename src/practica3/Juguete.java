package practica3;

/**
* Esta clase, llamada 'Juguete', es hija de la clase 'Ninyo' y tiene definidos los atributos 'nombre', 'precio' y 'edadRecomendada'.
* 	 Contiene sus setters y getters correspondientes y sus constructores vacío y completo respectivamente; también contiene el método ToString.
* @author: Xavier Borrás Mercant
* @version: 1.0
*/
	

public class Juguete extends Ninyo {
//	ATRIBUTS
	private String nombre;
	private int precio;
	private int edadRecomendada;
	
//	SETTERS
	/**
	 * Método set que sirve para otorgar valor a un atributo.
	 * @param nombre El parámetro 'nombre', de tipo String, hace referencia al atributo de la clase.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Método set que sirve para otorgar valor a un atributo.
	 * @param precio El parámetro 'precio', de tipo int, hace referencia al atributo de la clase.
	 */		
	public void setPrecio(int precio) {
		this.precio = precio;
	}
						
	/**
	 * Método set que sirve para otorgar valor a un atributo.
	 * @param edadRecomendada El parámetro 'edadRecomendada', de tipo int, hace referencia al atributo de la clase.
	 */
	public void setEdadRecomendada(int edadRecomendada) {
		this.edadRecomendada = edadRecomendada;
						}
						
//	GETTERS
	/**
	 * Método get que sirve para devolver el valor de un atributo.
	 * @return Devuelve el valor del atributo 'nombre'.
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Método get que sirve para devolver el valor de un atributo.
	 * @return Devuelve el valor del atributo 'precio'.
	 */
	public int getPrecio() {
		return precio;
	}
	
	/**
	 * Método get que sirve para devolver el valor de un atributo.
	 * @return Devuelve el valor del atributo 'edadRecomendada'.
	 */
	public int getEdad() {
		return edadRecomendada;
	}
						
	// CONSTRUCTORES
	/**
	 * Constructor de la clase 'Juguete', que establece sus atributos con el valor 'null', o sea, vacíos.
	 */
	public Juguete() {
		this.nombre = null;
		this.precio = 0;
		this.edadRecomendada = 0;
	}
				
	/**
	 * Constructor completo para otorgarle un valor por defecto a cada atributo de la clase 'Juguete'.
	 * @param nombre El parámetro 'nombre' le otorga un valor de tipo String al atributo 'nombre' de la clase 'Juguete'.
	 * @param precio El parámetro 'precio' le otorga un valor de tipo int al atributo 'precio' de la clase 'Juguete'.
	 * @param edadRecomendada El parámetro 'edadRecomendada' le otorga un valor de tipo int al atributo 'edadRecomendada' de la clase 'Juguete'.
	 */
	public Juguete(String nombre, int precio, int edadRecomendada) {
		this.nombre = nombre;
		this.precio = precio;
		this.edadRecomendada = edadRecomendada;
	}				
			
//	TO STRING
	/**
	 * Este método permite devolver los atributos de un objeto de tipo 'Juguete'.
	 */
	@Override
	public String toString() {
		return ("Nombre: "+nombre+" Precio: "+precio+" Edad recomendada: "+edadRecomendada);
	}
}