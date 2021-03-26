package ejercicioDakar;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Carrera carrera = new Carrera(200, 5000, "Dakar", 7);

        carrera.darDeAltaAuto(10, 5, 10, "ABC123");
        carrera.darDeAltaAuto(20, 3, 8, "DEF456");
        carrera.darDeAltaAuto(15, 7, 15, "GHI789");
        carrera.darDeAltaAuto(20, 2, 20, "JKL012");

        carrera.darDeAltaMoto(5, 5, 10, "123ABC");
        carrera.darDeAltaMoto(35, 2, 2, "456DEF");
        carrera.darDeAltaMoto(10, 10, 15, "789GHI");
        carrera.darDeAltaMoto(15, 3, 25, "012JKL");

        carrera.socorrerAuto("DEF456");
        carrera.socorrerMoto("789GHI");

        carrera.ganador();
    }
}
