import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;

public class Archivo {

    // Atributos de Archivo
    private File archivo;

    /**
     * Constructor de Archivo
     * 
     * @param nombreArchivo
     */
    public Archivo(String nombreArchivo) {
        archivo = new File(nombreArchivo);
        archivo = new File(archivo.getAbsolutePath());
    }

    public ArrayList<Dispositivo> leer() throws Exception {

        // Lista de dispositivos
        ArrayList<Dispositivo> dispositivos = new ArrayList<Dispositivo>();

        // Lector
        BufferedReader br = new BufferedReader(new FileReader(archivo));

        String dispositivo;
        while ((dispositivo = br.readLine()) != null) {
            String[] datos = dispositivo.split(",");

            if (datos[1].equals("Computadora")) {
                dispositivos.add(
                        new Computadora(Integer.parseInt(datos[0]), datos[2], datos[3], Double.parseDouble(datos[15]),
                                Integer.parseInt(datos[4]), datos[5], datos[6], datos[1], Integer.parseInt(datos[19]),
                                datos[11], datos[12], datos[13], datos[14]));
            }

            if (datos[1].equals("Telefono")) {
                dispositivos.add(new Telefono(Integer.parseInt(datos[0]), datos[2], datos[3],
                        Double.parseDouble(datos[15]), Integer.parseInt(datos[4]), datos[5], datos[6], datos[1],
                        Integer.parseInt(datos[19]), datos[7], Boolean.parseBoolean(datos[8]),
                        Boolean.parseBoolean(datos[9]), Boolean.parseBoolean(datos[10])));
            }

        }

        br.close();

        return dispositivos;
    }
}
