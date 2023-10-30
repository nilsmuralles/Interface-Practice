import java.util.ArrayList;

public class Torneo {

    // Atributos de Torneo
    private ArrayList<Dispositivo> dispositivos;
    private Archivo dispositivosCSV;

    public Torneo() {
        dispositivos = new ArrayList<Dispositivo>();
        dispositivosCSV = new Archivo("dispositivos.CSV");
    }

    public ArrayList<Dispositivo> getDispositivos() {
        return dispositivos;
    }

    public void setDispositivos(ArrayList<Dispositivo> dispositivos) {
        this.dispositivos = dispositivos;
    }

    public void verDispositivos() throws Exception {
        for (Dispositivo dispositivo : dispositivosCSV.leer()) {
            System.out.println(dispositivo.toString());
            System.out.println("");
        }
    }

}
