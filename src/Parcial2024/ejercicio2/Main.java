package Parcial2024.ejercicio2;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Tarea> tareas = new Stack<>();

        Tarea t1 = new Tarea("T1", 52, 3);
        Tarea t2 = new Tarea("T2", 87, 1);
        Tarea t3 = new Tarea("T3", 15, 2);
        Tarea t4 = new Tarea("T4", 64, 3);
        Tarea t5 = new Tarea("T5", 33, 2);
        Tarea t6 = new Tarea("T6", 91, 3);
        Tarea t7 = new Tarea("T7", 42, 4);
        Tarea t8 = new Tarea("T8", 76, 1);
        Tarea t9 = new Tarea("T9", 28, 4);
        Tarea t10 = new Tarea("T10", 50, 4);
        tareas.add(t1);
        tareas.add(t2);
        tareas.add(t3);
        tareas.add(t4);
        tareas.add(t5);
        tareas.add(t6);
        tareas.add(t7);
        tareas.add(t8);
        tareas.add(t9);
        tareas.add(t10);

        Greedy g1 = new Greedy(tareas);
        //System.out.println(tareas);
        //System.out.println(g1.Greedy());

        //Ejemplo del parcial
        Stack<Tarea> tareas2 = new Stack<>();
        Tarea t01 = new Tarea("T1", 10, 2);
        Tarea t02 = new Tarea("T2", 20, 1);
        Tarea t03 = new Tarea("T3", 8, 2);
        tareas2.add(t01);
        tareas2.add(t02);
        tareas2.add(t03);
        //Greedy g2 = new Greedy(tareas2);
        //System.out.println(g2.Greedy());


        Backtracking b = new Backtracking(tareas);
        System.out.println(b.back());
    }
}
