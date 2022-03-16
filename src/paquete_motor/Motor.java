/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package paquete_motor;
/**
 * Esta clase, llamada 'Motor', tiene definidos los atributos 'fabricante',
 * 'potencia' y 'codigo'.
 * Contiene sus setters y getters correspondientes y sus constructores vacio y
 * completo respectivamente; tambien contiene el metodo ToSTring.
 * @author: Miguel Marcos Nazco
 * @version: 1.0
 */

public class Motor {
//ATRIBUTS
    private String fabricante;
    private String potencia;
    private int codigo;
//Setters
    /**
     * Metodo set que sirve para otorgar valor a un atributo.
     *@param fabricante El parametro 'fabricante',de tipo String, hace 
     * referencia al atributo de la clase.
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    /**
     * Metodo set que sirve para otorgar valor a un atributo.
     *@param potencia El parametro 'potencia',de tipo String, hace 
     * referencia al atributo de la clase.
     */
    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }
    /**
     * Metodo set que sirve para otorgar valor a un atributo.
     *@param codigo El parametro 'codigo',de tipo int, hace 
     * referencia al atributo de la clase.
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
//Getters
    /**
     * Metodo get que sirve para devolver el valor del atributo 'fabricante'. 
     * @return 
     */
    public String getFabricante() {
        return fabricante;
    }
    /**
     * Metodo get que sirve para devolver el valor del atributo 'potencia'. 
     * @return 
     */
    public String getPotencia() {
        return potencia;
    }
    /**
     * Metodo get que sirve para devolver el valor del atributo 'codigo'. 
     * @return 
     */
    public int getCodigo() {
        return codigo;
    }
//Constructores
    //Constructor Vacio
        /**
         * Constructor de la clase 'Motor', que establece sus atributos con el 
         * valor 'null', o sea, vacíos.
         */
    public Motor() {
        this.setFabricante(null);
        this.setPotencia(null);
        this.setCodigo(0);
    }
    //Constructor Completo
        /**
         * Constructor completo para otorgarle un valor por defecto a cada 
         * atributo de la clase 'Motor'.
         * @param fabricante El parametro 'fabricante' le otorga un valor tipo
         * 'String' al atributo 'fabricante' de la clase 'Motor'
         * @param potencia El parametro 'potencia' le otorga un valor tipo 
         *'String' al atributo 'potencia' de la clase 'Motor'
         * @param codigo El parametro 'codigo' le otorga un valor tipo 'String' 
         * al atributo 'codigo' de la clase 'Motor'
         */
    public Motor(String fabricante, String potencia, int codigo) {
        this.setFabricante(fabricante);
        this.setPotencia(potencia);
        this.setCodigo(codigo);
    }
//ToString
    /**
     * Este metodo permite devolver los atrubutos de un objeto tipo 'Motor'
     * @return 
     */
    @Override
    public String toString() {
        return "Motor{" + "fabricante=" + fabricante + ", potencia=" + 
                potencia + ", codigo=" + codigo + '}';
    }
         
}
