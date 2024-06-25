package Parcial2024.ejercicio2;

import java.util.Collections;
import java.util.Stack;

public class Greedy {
    Solucion solucion;
    Stack<Tarea> tareas; //Candidatos

    public Greedy(Stack<Tarea> candidatos) {
        this.solucion = new Solucion();
        this.tareas = new Stack<>();
        //Crea una copia de los candidatos
        for (Tarea t : candidatos){
            this.tareas.add(new Tarea(t.id, t.puntaje, t.caducidad));
        }
        /* (!candidatos.empty())
            this.tareas.addAll(candidatos);
         */
        // Ordena la pila de tareas ascendentemente
        // en base al puntaje para que en la cima este
        // la tarea con puntaje mas alto
        Collections.sort(this.tareas);
    }

    public Solucion Greedy (){
        while(!this.tareas.empty()){
            Tarea t = this.tareas.pop();
            if (this.solucion.esAsignable(t))
                solucion.agregarTarea(t);
        }
        return this.solucion;
    }


}
