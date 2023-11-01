/**
 * @author Nils Muralles
 * @version 1.0
 * @since 30/10/23
 * @modificationDate 01/11/23
 * @description Clase que modela un Dispositivo, el cual hereda sus atributos a
 *              otras clases
 */

public class Dispositivo {

    // Atributos de Dispositivo
    protected int id;
    protected String ram;
    protected String almacenamiento;
    protected double precio;
    protected int visaCuotas;
    protected String marca;
    protected String modelo;
    protected String tipo;
    protected int videosPublicitarios;
    protected boolean encendido;
    protected int brillo;
    protected int volumen;

    /**
     * Constructor de Dispositivo
     * 
     * @param id
     * @param ram
     * @param almacenamiento
     * @param precio
     * @param visaCuotas
     * @param marca
     * @param modelo
     * @param tipo
     * @param videosPublicitarios
     */
    public Dispositivo(int id, String ram, String almacenamiento, double precio, int visaCuotas, String marca,
            String modelo, String tipo, int videosPublicitarios) {
        this.id = id;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.precio = precio;
        this.visaCuotas = visaCuotas;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.videosPublicitarios = videosPublicitarios;
        this.encendido = true;
        this.brillo = 100;
        this.volumen = 100;
    }

    /**
     * Devuelve el precio
     * 
     * @return
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Actualiza el precio
     * 
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Devuelve el id
     * 
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * Actualiza el id
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Devuelve el tipo
     * 
     * @return
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Actualiza el tipo
     * 
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Devuelve una cadena que representa al Dispositivo
     */
    @Override
    public String toString() {
        return "Dispositivo [id=" + id + ", ram=" + ram + ", almacenamiento=" + almacenamiento + ", precio=" + precio
                + ", visaCuotas=" + visaCuotas + ", marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo
                + ", videosPublicitarios="
                + videosPublicitarios + "]";
    }

}
