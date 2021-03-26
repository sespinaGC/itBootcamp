package ejercicioMarteGroup;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Invitado i1 = new InvitadoMeli("Meli");
        Invitado i2 = new InvitadoStandard("Standard");

        i1.degustarTorta();
        i2.degustarTorta();

        FuegoArtificialIndividual f1 = new FuegoArtificialIndividual("Cañita", 5, "BOOM");
        FuegoArtificialIndividual f2 = new FuegoArtificialIndividual("Petardo", 10, "BOOOOOOM");
        FuegoArtificialIndividual f3 = new FuegoArtificialIndividual("Thanos", 20, "BOOOOOOOOOOOOOM");

        f1.agregarAListaDeFuegosArtificiales();

        List<FuegoArtificial> pack = new ArrayList<>();

        pack.add(f2);
        pack.add(f3);

        PackFuegoArtificial pack2 = new PackFuegoArtificial(pack);
        pack2.agregarAListaDeFuegosArtificiales();

        FuegoArtificial.showFuegos();
    }
}
