/**
 * @author Nils Muralles
 * @version 1.0
 * @since 30/10/23
 * @modificationDate 01/11/23A
 * @description Clase que modela una computadora que hereda de dispositivo e
 *              implementa control
 */

public class Computadora extends Dispositivo implements Control {

    // Atributos de Computadora
    private String tamañoDisco;
    private String tipoDisco;
    private String velocidadCPU;
    private String velocidadGPU;

    /**
     * Constructor de Computadora
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
     * @param tamañoDisco
     * @param tipoDisco
     * @param velocidadCPU
     * @param velocidadGPU
     */
    public Computadora(int id, String ram, String almacenamiento, double precio, int visaCuotas, String marca,
            String modelo, String tipo, int videosPublicitarios,
            String tamañoDisco, String tipoDisco, String velocidadCPU, String velocidadGPU) {
        super(id, ram, almacenamiento, precio, visaCuotas, marca, modelo, tipo,
                videosPublicitarios);
        this.tamañoDisco = tamañoDisco;
        this.tipoDisco = tipoDisco;
        this.velocidadCPU = velocidadCPU;
        this.velocidadGPU = velocidadGPU;
    }

    /**
     * Devuelve una cadena que representa una Computadora
     */
    @Override
    public String toString() {
        return "Id: " + id + "\nMarca: " + marca + "\nModelo: " + modelo + "\nAlmacenamiento: " + tamañoDisco
                + "\nTipo disco duro: " + tipoDisco + "\nVelocidad CPU: " + velocidadCPU + "\nValocidad GPU: "
                + velocidadGPU + "\nPrecio: " + precio + "\nVisa cuotas: " + visaCuotas;
    }

    public void encender() {
        System.out.println("La computadora ha sido encendida");
    }

    public void apagar() {
        System.out.println("La computadora ha sido apagada");
    }

    public void subirVolumen() {
        System.out.println("El volumen subió en un 10%");
    }

    public void bajarVolumen() {
        System.out.println("El volumen bajó en un 10%");
    }

    public void aumentarBrillo() {
        System.out.println("El brillo aumentó en un 5%");
    }

    public void disminuirBrillo() {
        System.out.println("El brillo disminuyó en un 5%");
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
