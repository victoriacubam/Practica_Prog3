package Parcial2024.ejercicio2;

import java.util.LinkedList;
import java.util.Stack;

public class Solucion {
    LinkedList<Tarea> solucion;
    int puntajeTotal;
    int indiceCaducidad; //Me dice en que lugar se ejecutará la siguiente

    public Solucion() {
        this.solucion = new LinkedList<>();
        this.puntajeTotal = 0;
        this.indiceCaducidad = 0;
    }

    public int getPuntajeTotal() {
        return puntajeTotal;
    }

    public boolean esAsignable(Tarea t){
        return ((t.getCaducidad()> this.indiceCaducidad)) && (!this.solucion.contains(t));
    }

    public void agregarTarea(Tarea t){
        this.solucion.add(t);
        this.puntajeTotal+= t.getPuntaje();
        this.indiceCaducidad++;
    }

    public void sacarTarea(Tarea t){
        if (this.contieneTarea(t)){
            this.solucion.remove(t);
            this.puntajeTotal-= t.getPuntaje();
            this.indiceCaducidad--;
        }
    }

    public boolean contieneTarea (Tarea t){
        return this.solucion.contains(t);
    }

    public void copiar (Solucion s){
        LinkedList<Tarea> copia = new LinkedList<>();
        for(Tarea t : s.getSolucion()){
            copia.add(t);
        }
        this.solucion = copia;
    }

    public LinkedList<Tarea> getSolucion(){
        return this.solucion;
    }

    public boolean empty (){
        return this.solucion.isEmpty();
    }

    @Override
    public String toString() {
        return this.solucion.toString();
    }
}
