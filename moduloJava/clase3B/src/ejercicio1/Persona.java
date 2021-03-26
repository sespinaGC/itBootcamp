package ejercicio1;

public class Persona implements Precedable {
    private String nombre;
    private int dni;

    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public int precedeA(Object p) {
        if(p instanceof Persona) {
            return this.dni - ((Persona) p).dni;
        }
        else return 0;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni=" + dni +
                '}';
    }
}
