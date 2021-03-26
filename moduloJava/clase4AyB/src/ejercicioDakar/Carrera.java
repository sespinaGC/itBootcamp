package ejercicioDakar;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
    private int distancia;
    private int premioEnDolares;
    private String nombre;
    private int cantidadDeVehiculosPermitidos;
    private List<Vehiculo> listaDeVehiculos = new ArrayList<Vehiculo>();
    private SocorristaAuto socorristaAuto = new SocorristaAuto();
    private SocorristaMoto socorristaMoto = new SocorristaMoto();

    public Carrera(int distancia, int premioEnDolares, String nombre, int cantidadDeVehiculosPermitidos) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getPremioEnDolares() {
        return premioEnDolares;
    }

    public void setPremioEnDolares(int premioEnDolares) {
        this.premioEnDolares = premioEnDolares;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDeVehiculosPermitidos() {
        return cantidadDeVehiculosPermitidos;
    }

    public void setCantidadDeVehiculosPermitidos(int cantidadDeVehiculosPermitidos) {
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
    }

    public List<Vehiculo> getListaDeVehiculos() {
        return listaDeVehiculos;
    }

    public void setListaDeVehiculos(List<Vehiculo> listaDeVehiculos) {
        this.listaDeVehiculos = listaDeVehiculos;
    }

    public SocorristaAuto getSocorristaAuto() {
        return socorristaAuto;
    }

    public void setSocorristaAuto(SocorristaAuto socorristaAuto) {
        this.socorristaAuto = socorristaAuto;
    }

    public SocorristaMoto getSocorristaMoto() {
        return socorristaMoto;
    }

    public void setSocorristaMoto(SocorristaMoto socorristaMoto) {
        this.socorristaMoto = socorristaMoto;
    }

    public void darDeAltaAuto(int velocidad, int aceleracion, int anguloDeGiro, String patente) {
        Vehiculo auto = new Auto(velocidad, aceleracion, anguloDeGiro, patente);

        if (hayCupo())
            this.listaDeVehiculos.add(auto);
    }

    public void darDeAltaMoto(int velocidad, int aceleracion, int anguloDeGiro, String patente) {
        Vehiculo moto = new Moto(velocidad, aceleracion, anguloDeGiro, patente);

        if (hayCupo())
            this.listaDeVehiculos.add(moto);
    }

    public void eliminarVehiculo(Vehiculo vehiculo) {
        this.listaDeVehiculos.remove(vehiculo);
    }

    public void eliminarVehiculoConPatente(String unaPatente) {
        Vehiculo vehiculo = getVehiculoByPatente(unaPatente);

        if (vehiculo != null)
            this.listaDeVehiculos.remove(vehiculo);
    }

    public void ganador() {
        double maxValorFormula = -1;
        Vehiculo maxVehiculo = new Vehiculo();

        for (Vehiculo v : this.listaDeVehiculos) {
            double valorFormula = getValorFormula(v);

            if (valorFormula > maxValorFormula) {
                maxValorFormula = valorFormula;
                maxVehiculo = v;
            }
        }

        System.out.println("El ganador es: " + getClassName(maxVehiculo) + " con patente " + maxVehiculo.getPatente());
    }

    public void socorrerAuto(String patente) {
        Auto auto = (Auto)getVehiculoByPatente(patente);

        if (auto != null)
            new SocorristaAuto().socorrer(auto);
    }

    public void socorrerMoto(String patente) {
        Moto moto = (Moto)getVehiculoByPatente(patente);

        if (moto != null)
            new SocorristaMoto().socorrer(moto);
    }

    private boolean hayCupo() {
        return this.cantidadDeVehiculosPermitidos - this.listaDeVehiculos.size() > 0;
    }

    private Vehiculo getVehiculoByPatente(String patente) {
        return this.listaDeVehiculos.stream()
                .filter((v) -> v.getPatente() == patente)
                .findFirst()
                .orElse(null);
    }

    private double getValorFormula(Vehiculo v) {
        return v.getVelocidad() * 0.5 * v.getAceleracion() / (v.getAnguloDeGiro() * (v.getPeso() - v.getRuedas() * 100));
    }

    private String getClassName(Vehiculo vehiculo) {
        return vehiculo.getClass().getName().replace("ejercicioDakar.", "");
    }
}
