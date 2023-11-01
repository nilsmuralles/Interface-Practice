/**
 * @author Nils Muralles
 * @version 1.0
 * @since 30/10/23
 * @modificationDate 01/11/23
 * @description Interfaz control que contiene los métodos relacionados al manejo
 *              de dispositivos
 */

public interface Control {

    void encender();

    void apagar();

    void subirVolumen();

    void bajarVolumen();

    void aumentarBrillo();

    void disminuirBrillo();

    void mostrarInformacion();

    void reproducir();

    void pausar();

    void cambiarVideo();

}
