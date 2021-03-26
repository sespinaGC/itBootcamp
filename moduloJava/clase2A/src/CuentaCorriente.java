public class CuentaCorriente {
    private double saldo;
    private int numCuenta;
    private static int cont = 1;

    public CuentaCorriente(){
        this.setSaldo(0);
        this.setNumCuenta();
    }
    public CuentaCorriente(double s, int c) {
        saldo = s;
        numCuenta = c;
    }
    public CuentaCorriente(CuentaCorriente c) {
        this.saldo = c.getSaldo();
        this.numCuenta = c.getNumCuenta();
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta() {
        this.numCuenta = cont;
        cont++;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double s) {
        this.saldo = s;
    }

    public void ingreso(double i) {
        this.saldo += i;
    }

    public void egreso(double e) {
        this.saldo -= e;
    }

    public void reintegro(double r) {
        this.ingreso(r);
    }

    public void transferencia(double monto, CuentaCorriente c) {
        this.egreso(monto);
        c.ingreso(monto);
    }
}
