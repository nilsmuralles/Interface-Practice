/**
 * @author Nils Muralles
 * @version 1.0
 * @since 30/10/23
 * @modificationDate 01/11/23A
 * @description Clase que modela un teléfono que hereda de dispositivo e
 *              implementa control
 */

public class Telefono extends Dispositivo implements Control {

    // Atributos de Teléfono
    private String procesador;
    private boolean microUSB;
    private boolean cuboCargador;
    private boolean cincoG;

    /**
     * Constructor de teléfono
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
     * @param procesador
     * @param microUSB
     * @param cuboCargador
     * @param cincoG
     */
    public Telefono(int id, String ram, String almacenamiento, double precio, int visaCuotas, String marca,
            String modelo, String tipo, int videosPublicitarios,
            String procesador, boolean microUSB, boolean cuboCargador, boolean cincoG) {
        super(id, ram, almacenamiento, precio, visaCuotas, marca, modelo, tipo,
                videosPublicitarios);
        this.procesador = procesador;
        this.microUSB = microUSB;
        this.cuboCargador = cuboCargador;
        this.cincoG = cincoG;
    }

    /**
     * Devuevle una cadena que representa un Teléfono
     */
    @Override
    public String toString() {
        return "Id: " + id + "\nMarca: " + marca + "\nModelo: " + modelo + "\nAlmacenamiento: " + almacenamiento
                + "\nProcesador: "
                + procesador + "\nAcepta MicroUSB: " + microUSB + "\nIncluye Cargador: " + cuboCargador + "\nTiene 5G: "
                + cincoG + "\nPrecio: " + precio
                + "\nVisa cuotas: " + visaCuotas;
    }

    public void encender() {
        System.out.println("El teléfono ha sido encendido");
    }

    public void apagar() {
        System.out.println("El teléfono ha sido apagado");
    }

    public void subirVolumen() {
        System.out.println("El volumen subió en un 2%");
    }

    public void bajarVolumen() {
        System.out.println("El volumen bajó en un 2%");
    }

    public void aumentarBrillo() {
        System.out.println("El brillo aumentó en un 3%");
    }

    public void disminuirBrillo() {
        System.out.println("El brillo disminuyó en un 3%");
    }

    public void mostrarInformacion() {
        System.out.println(toString());
    }

    public void reproducir() {
        System.out.println("Se está reproduciendo el video");
    }

    public void pausar() {
        System.out.println("El video ha sido pausado");
    }

    public void cambiarVideo() {
        System.out.println("Siguiente video");
    }

}