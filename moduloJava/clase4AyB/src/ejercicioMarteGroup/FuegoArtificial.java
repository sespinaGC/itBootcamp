package ejercicioMarteGroup;

import java.util.ArrayList;
import java.util.List;

public abstract class FuegoArtificial {
    protected static List<FuegoArtificial> fuegosArtificiales = new ArrayList<FuegoArtificial>();

    public abstract void explotar();

    public static void showFuegos() {
            for (FuegoArtificial fuego : fuegosArtificiales) {
                fuego.explotar();
            }

            fuegosArtificiales.clear();
    }
}
