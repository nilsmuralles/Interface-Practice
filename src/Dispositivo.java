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
     * @param encendido
     * @param brillo
     * @param volumen
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
