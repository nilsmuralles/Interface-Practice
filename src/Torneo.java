
/**
 * @author Nils Muralles
 * @version 1.0
 * @since 30/10/23
 * @modificationDate 01/11/23
 * @description Clase controlador del programa que maneja la lógica del mismo
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;

public class Torneo {

    // Atributos de Torneo
    private ArrayList<Dispositivo> dispositivos;
    private Archivo dispositivosCSV;
    Scanner input = new Scanner(System.in);

    public Torneo() {
        dispositivos = new ArrayList<Dispositivo>();
        dispositivosCSV = new Archivo("dispositivos.CSV");
    }

    /**
     * Devuelve el ArrayList de dispositivos
     * 
     * @return
     */
    public ArrayList<Dispositivo> getDispositivos() {
        return dispositivos;
    }

    /**
     * Actualiza el ArrayList de dispositivos
     * 
     * @param dispositivos
     */
    public void setDispositivos(ArrayList<Dispositivo> dispositivos) {
        this.dispositivos = dispositivos;
    }

    /**
     * Carga los datos del CSV
     * 
     * @throws Exception
     */
    public void verDispositivos() throws Exception {
        for (Dispositivo dispositivo : dispositivosCSV.leer()) {
            System.out.println(dispositivo.toString());
            System.out.println("");
        }
    }

    /**
     * Selecciona un dispoistivo en base al id
     * 
     * @param id
     * @return
     * @throws Exception
     */
    public Dispositivo seleccionarDispositivo(int id) throws Exception {
        Dispositivo dispositivoEncontrado = null;

        for (Dispositivo dispositivo : dispositivosCSV.leer()) {
            if (dispositivo.getId() == id) {
                dispositivoEncontrado = dispositivo;
            }
        }

        return dispositivoEncontrado;
    }

    /**
     * Maneja los dispositivos utilizando la interfaz de control
     * 
     * @param dispositivo
     * @param op
     */
    public void manejarDispositivo(Dispositivo dispositivo, int op) {

        switch (op) {
            case 1:
                if (dispositivo.getTipo().equals("Telefono")) {
                    ((Telefono) dispositivo).encender();
                } else if (dispositivo.getTipo().equals("Computadora")) {
                    ((Computadora) dispositivo).encender();
                }

                break;

            case 2:
                if (dispositivo.getTipo().equals("Telefono")) {
                    ((Telefono) dispositivo).apagar();
                } else if (dispositivo.getTipo().equals("Computadora")) {
                    ((Computadora) dispositivo).apagar();
                }

                break;

            case 3:
                if (dispositivo.getTipo().equals("Telefono")) {

                    System.out.print("¿Subir o bajar volumen? (Ingrese: +/-) ");
                    String opVolumen = input.nextLine();

                    if (opVolumen.equals("+")) {
                        ((Telefono) dispositivo).subirVolumen();
                    } else if (opVolumen.equals("-")) {
                        ((Telefono) dispositivo).bajarVolumen();
                    } else {
                        System.out.println("Seleccione una opción válida (+/-)");
                    }

                } else if (dispositivo.getTipo().equals("Computadora")) {

                    System.out.print("¿Subir o bajar volumen? (Ingrese: +/-) ");
                    String opVolumen = input.nextLine();

                    if (opVolumen.equals("+")) {
                        ((Computadora) dispositivo).subirVolumen();
                    } else if (opVolumen.equals("-")) {
                        ((Computadora) dispositivo).bajarVolumen();
                    } else {
                        System.out.println("Seleccione una opción válida (+/-)");
                    }

                }

                break;

            case 4:

                if (dispositivo.getTipo().equals("Telefono")) {

                    System.out.print("¿Subir o bajar brillo? (Ingrese: +/-) ");
                    String opBrillo = input.nextLine();

                    if (opBrillo.equals("+")) {
                        ((Telefono) dispositivo).aumentarBrillo();
                    } else if (opBrillo.equals("-")) {
                        ((Telefono) dispositivo).disminuirBrillo();
                    } else {
                        System.out.println("Seleccione una opción válida (+/-)");
                    }

                } else if (dispositivo.getTipo().equals("Computadora")) {

                    System.out.print("¿Subir o bajar brillo? (Ingrese: +/-) ");
                    String opBrillo = input.nextLine();

                    if (opBrillo.equals("+")) {
                        ((Computadora) dispositivo).aumentarBrillo();
                    } else if (opBrillo.equals("-")) {
                        ((Computadora) dispositivo).disminuirBrillo();
                    } else {
                        System.out.println("Seleccione una opción válida (+/-)");
                    }

                }

                break;

            case 5:
                if (dispositivo.getTipo().equals("Telefono")) {
                    ((Telefono) dispositivo).mostrarInformacion();
                } else if (dispositivo.getTipo().equals("Computadora")) {
                    ((Computadora) dispositivo).mostrarInformacion();
                }

                break;

            case 6:
                if (dispositivo.getTipo().equals("Telefono")) {
                    ((Telefono) dispositivo).reproducir();
                } else if (dispositivo.getTipo().equals("Computadora")) {
                    ((Computadora) dispositivo).reproducir();
                }

                break;

            case 7:
                if (dispositivo.getTipo().equals("Telefono")) {
                    ((Telefono) dispositivo).pausar();
                } else if (dispositivo.getTipo().equals("Computadora")) {
                    ((Computadora) dispositivo).pausar();
                }

                break;

            case 8:
                if (dispositivo.getTipo().equals("Telefono")) {
                    ((Telefono) dispositivo).cambiarVideo();
                } else if (dispositivo.getTipo().equals("Computadora")) {
                    ((Computadora) dispositivo).cambiarVideo();
                }
                break;

            default:
                break;
        }
    }

    /**
     * Devuelve el dispositivo más caro
     * 
     * @throws Exception
     */
    public void dispositivoMasCaro() throws Exception {
        List<Dispositivo> listaDispositivos = dispositivosCSV.leer();

        Comparator<Dispositivo> compararPrecio = (dipositivo1, disopositivo2) -> Double.compare(dipositivo1.getPrecio(),
                disopositivo2.getPrecio());

        Collections.sort(listaDispositivos, compararPrecio);

        System.out.println(listaDispositivos.get(listaDispositivos.size() - 1));
    }

    /**
     * Devuelve el dispositivo más barato
     * 
     * @throws Exception
     */
    public void dispositivoMasBarato() throws Exception {
        List<Dispositivo> listaDispositivos = dispositivosCSV.leer();

        Comparator<Dispositivo> compararPrecio = (dipositivo1, disopositivo2) -> Double.compare(dipositivo1.getPrecio(),
                disopositivo2.getPrecio());

        Collections.sort(listaDispositivos, compararPrecio);

        System.out.println(listaDispositivos.get(0));
    }
}
