public class Computadora extends Dispositivo {

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

}
