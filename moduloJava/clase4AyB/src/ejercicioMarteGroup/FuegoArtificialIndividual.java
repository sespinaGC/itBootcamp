package ejercicioMarteGroup;

import java.util.ArrayList;
import java.util.List;

public class FuegoArtificialIndividual extends FuegoArtificial {
    private String nombre;
    private int potencia;
    private String explosion;

    public FuegoArtificialIndividual(String nombre, int potencia, String explosion) {
        this.nombre = nombre;
        this.potencia = potencia;
        this.explosion = explosion;
    }

    public void agregarAListaDeFuegosArtificiales() {
        this.fuegosArtificiales.add(this);
    }

    @Override
    public void explotar() {
        System.out.println(this.explosion);
    }
}
