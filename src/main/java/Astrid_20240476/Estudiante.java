package Astrid_20240476;

import java.util.Scanner;

public class Estudiante {
    private int id;
    private String nombre;
    private int edad;
    private int promedio;



    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    /*
    public void  InsertarEstudiante(nombre, edad, promedio){
        setNombre(nombre.getText);
    }*/

    @Override
    public String toString(){
     return "Nombre: " + nombre + "Edad: " + edad + "Promedio: " + promedio;
    }
    Scanner sc = new Scanner(System.in);

    public void AgregarEstudiante(){
        System.out.println("Nombre del estudiante: ");
        String nombre = sc.nextLine();
        System.out.println("Edad del estudiante: ");
        int edad = sc.nextInt();
        System.out.println("Promedio del estudiante: ");
        int promedio = sc.nextInt();
    }


}
