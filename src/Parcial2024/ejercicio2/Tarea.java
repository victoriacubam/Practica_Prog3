package Parcial2024.ejercicio2;


public class Tarea implements Comparable<Tarea> {
    String id;
    int puntaje;
    int caducidad;

    public Tarea(String id, int puntaje, int caducidad) {
        this.id = id;
        this.puntaje = puntaje;
        this.caducidad = caducidad;
    }

    public String getId() {
        return id;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public int getCaducidad() {
        return caducidad;
    }

    @Override
    public int compareTo(Tarea t) {
        return this.getPuntaje() - t.getPuntaje();
    }

    @Override
    public String toString() {
        return "[" + this.id + "(P= " + this.getPuntaje() +
                        ", C= " + this.getCaducidad() + ")]";
    }
}
