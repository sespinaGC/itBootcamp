public class demo1 {
    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente();

        CuentaCorriente cuenta2 = new CuentaCorriente(125, 5);
        System.out.println(cuenta1.getSaldo());

        cuenta2.transferencia(100, cuenta1);

        System.out.println(cuenta1.getNumCuenta());
        System.out.println(cuenta2.getNumCuenta());
        System.out.println(cuenta2.getSaldo());
        System.out.println(cuenta1.getSaldo());
    }
}
