package ejercicioMarteGroup;

import java.util.ArrayList;
import java.util.List;

public class PackFuegoArtificial extends FuegoArtificial {
    private String nombre;
    private int potencia;
    private String explosion;

    private List<FuegoArtificial> fuegosArtificialesList = new ArrayList<FuegoArtificial>();

    public PackFuegoArtificial(FuegoArtificialIndividual fuegoIndividual) {
        this.fuegosArtificialesList.add(fuegoIndividual);
    }

    public PackFuegoArtificial(List<FuegoArtificial> fuegosList) {
        this.fuegosArtificialesList = fuegosList;
    }

    public void agregarAListaDeFuegosArtificiales() {
        this.fuegosArtificiales.add(this);
    }

    @Override
    public void explotar() {
        System.out.println("MEGA BOOM");
    }
}
