import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Torneo electroTech = new Torneo();

        boolean seguir = true;
        while (seguir) {
            System.out.println("\n---BIENVENIDO---");
            System.out.println("1. Acceder a dispositivo");
            System.out.println("2. Dispositivo más caro");
            System.out.println("3. Dispositivo más barato");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            String opcion = input.nextLine();

            try {
                int op = Integer.parseInt(opcion);

                switch (op) {
                    case 1:
                        System.out.println("\n---PRODUCTOS EN STAND---");
                        electroTech.verDispositivos();
                        System.out.print("Id del dispositivo que va a manejar: ");
                        String idModificar = input.nextLine();

                        break;

                    case 4:
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
