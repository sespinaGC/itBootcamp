package ejercicioSaveTheRopa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Prenda p1 = new Prenda("Nike", "Zapatillas");
        Prenda p2 = new Prenda("Adidas", "Campera");

        List<Prenda> prendas = new ArrayList<Prenda>();

        prendas.add(p1);
        prendas.add(p2);

        GuardaRopa gr = new GuardaRopa();

        int codigo = gr.guardarPrendas(prendas);

        gr.mostrarPrendas();

        List<Prenda> listPrendas = gr.devolverPrendas(codigo);
    }
}
