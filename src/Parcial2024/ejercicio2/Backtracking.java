package Parcial2024.ejercicio2;

import java.util.Stack;

public class Backtracking {
    Solucion solucion;
    Stack<Tarea> tareas;

    public Backtracking(Stack<Tarea> tareas) {
        this.solucion = new Solucion();
        this.tareas = new Stack<>();
        //Crea una copia de las tareas
        for (Tarea t : tareas){
            this.tareas.add(new Tarea(t.id, t.puntaje, t.caducidad));
        }
    }

    public Solucion back(){
        Solucion solucionParcial = new Solucion();
        this.back(solucionParcial, this.tareas);
        return this.solucion;
    }

    private void back (Solucion solucionParcial, Stack<Tarea> tareas){
        if (tareas.empty()) { //Condicion de corte: si me quede sin tareas
            if (this.solucion.empty() || solucionParcial.getPuntajeTotal() > this.solucion.getPuntajeTotal())
                this.solucion.copiar(solucionParcial);
        } else {
            Tarea t = tareas.pop();
            if (solucionParcial.esAsignable(t)){
                solucionParcial.agregarTarea(t);
            }
            back(solucionParcial, tareas);

            // Deshacer
            // La devuelvo a la lista de tareas
            solucionParcial.sacarTarea(t);
            this.tareas.push(t);
        }
    }
}
