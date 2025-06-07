package Astrid_20240476;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> Estudiantes = new TreeMap<>();
        Set<String> estudiante = new HashSet<>();


        Estudiantes.put(2,"Astrid Alvarenga");
        Estudiantes.put(4, "Carla Maricela");
        Estudiantes.put(3,"Angela Fabiola");
        Estudiantes.put(1,"Astrid Fabiola");
        Estudiantes.put(2,"Angela Fabiola");

        System.out.println("Listado de estudiantes ordenados: " + Estudiantes);

        //Obtener primer estudiante y el ultimo
        System.out.println("Primer estudiante:" + Estudiantes.firstEntry());
        System.out.println("Ultimo estudiante: " + Estudiantes.lastEntry());



        Scanner sc = new Scanner(System.in);

        System.out.println("--SISTEMA DE GESTIÓN ESCOLAR");
        System.out.println("1.Agregar un estudiante.");

        System.out.println("2. Mostrar todos los datos de un estudiante.");
        System.out.println("3. Actualizar datos de un estudiante.");
        System.out.println("4. Eliminar un estudiante.");
        System.out.println("5.Buscar estudiante.");
        System.out.println("6.Salir del programa");






    }
}