
/**
     * @author Nils Muralles
     * @version 1.0
     * @since 30/10/23
     * @modificationDate 01/11/23
     * @description Clase Main que contiene la vista del menú para el usuario
 */

import java.util.Scanner;

public class Main {
    /**
     * Método main que corre el programa
     * 
     * @param args
     */
    public static void main(String[] args) {

        // Objetos fundamentales
        Scanner input = new Scanner(System.in);
        Torneo electroTech = new Torneo();

        boolean seguir = true;
        while (seguir) { // Menú principal
            System.out.println("\n---BIENVENIDO---");
            System.out.println("1. Acceder a dispositivo");
            System.out.println("2. Dispositivo más caro");
            System.out.println("3. Dispositivo más barato");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            String opcion = input.nextLine();

            try { // Validar la opción seleccionada
                int op = Integer.parseInt(opcion);

                switch (op) {
                    case 1: // Acceder y manejar un dispositivo
                        System.out.println("\n---PRODUCTOS EN STAND---");
                        electroTech.verDispositivos();
                        System.out.print("Id del dispositivo que va a manejar: ");
                        String idModificar = input.nextLine();

                        try { // Validar el dispositivo
                            int id = Integer.parseInt(idModificar);

                            if (electroTech.seleccionarDispositivo(id) != null) {
                                boolean seguirMenu = true;

                                do { // Menú para el manejo de los dispositivos a través de la interfaz
                                    System.out.println("\n---MENU---");
                                    System.out.println("1. Encender");
                                    System.out.println("2. Apagar");
                                    System.out.println("3. Modificar volumen");
                                    System.out.println("4. Modificar brillo");
                                    System.out.println("5. Ver información");
                                    System.out.println("6. Reproducir video");
                                    System.out.println("7. Pausar video");
                                    System.out.println("8. Siguiente video");
                                    System.out.println("9. Salir del menú");
                                    System.out.print("Seleccione una opción: ");
                                    String opcionMenu = input.nextLine();
                                    System.out.println("");

                                    try { // Validar la opción de la interfaz
                                        int opMenu = Integer.parseInt(opcionMenu);
                                        Dispositivo dispositivoSeleccionado = electroTech.seleccionarDispositivo(id);

                                        if (opMenu >= 1 && opMenu <= 8) {
                                            electroTech.manejarDispositivo(dispositivoSeleccionado, opMenu);

                                        } else if (opMenu == 9) {
                                            seguirMenu = false;

                                        } else {
                                            System.out.println("Seleccione una opción del menú");
                                        }

                                    } catch (Exception NumberFormatException) {
                                        System.out.println("La opción del menú debe ser un número");
                                    }

                                } while (seguirMenu);

                            } else {
                                System.out.println("Dispositivo no encontrado");
                            }

                        } catch (Exception NumberFormatException) {
                            System.out.println("Debe ingresar un Id válido");
                        }

                        break;

                    case 2: // Obtener el dispositivo más caro a través de compare
                        System.out.println("");
                        System.out.println("---DISPOSITIVO MÁS CARO---");
                        electroTech.dispositivoMasCaro();
                        break;

                    case 3: // Obtener el dispositivo más barato a través de compare
                        System.out.println("");
                        System.out.println("---DISPOSITIVO MÁS BARATO---");
                        electroTech.dispositivoMasBarato();
                        break;

                    case 4: // Salir del menú
                        seguir = false;
                        break;

                    default:
                        System.out.println("Seleccione una opción válida");
                        break;
                }

            } catch (Exception NumberFormatException) {
                System.out.println("Seleccione un número");
            }

        }

        input.close();
    }
}
