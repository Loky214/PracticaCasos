package caso2;

import java.util.Scanner;

public class EstudianteInteractivo {
    private String nombre;
    private int edad;
    private String carrera;

    public EstudianteInteractivo(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    public String resumen() {
        return "Soy " + nombre + ", tengo " + edad + " años y estudio " + carrera + ".";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: ");
        String n = sc.nextLine();
        System.out.print("Edad: ");
        int e = sc.nextInt();
        sc.nextLine(); // limpiar buffer
        System.out.print("Carrera: ");
        String c = sc.nextLine();
        EstudianteInteractivo est = new EstudianteInteractivo(n, e, c);
        System.out.println(est.resumen());
        sc.close();
    }
}
