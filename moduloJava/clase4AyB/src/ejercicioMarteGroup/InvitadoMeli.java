package ejercicioMarteGroup;

public class InvitadoMeli extends Invitado {
    public InvitadoMeli(String nombre) {
        super(nombre);
    }

    @Override
    public void degustarTorta() throws InterruptedException {
        super.degustarTorta();

        Thread.sleep(2000);

        System.out.println("Viva la Chiqui!!");
    }
}
