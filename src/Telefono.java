public class Telefono extends Dispositivo {

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
}
