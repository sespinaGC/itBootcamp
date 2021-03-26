package ejercicioSaveTheRopa;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {
    private int identificador = 0;
    private HashMap<Integer, List<Prenda>> prendas = new HashMap<Integer, List<Prenda>>();

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public HashMap<Integer, List<Prenda>> getPrendas() {
        return prendas;
    }

    public Integer guardarPrendas(List<Prenda> listaDePrenda) {
        this.prendas.put(identificador, listaDePrenda);

        return identificador++;
    }

    public void mostrarPrendas() {
        for (Map.Entry<Integer, List<Prenda>> entry : this.prendas.entrySet()) {
            Integer key = entry.getKey();
            List<Prenda> prendas = entry.getValue();

            imprimirPrendas(prendas, key);
        }
    }

    private void imprimirPrendas(List<Prenda> prendas, Integer key) {
        for (Prenda prenda : prendas) {
            System.out.println("Prenda: " + prenda.toString() + " - Guardarropa: " + key);
        }
    }

    public List<Prenda> devolverPrendas(Integer numero) {
        return this.prendas.get(numero);
    }
}
