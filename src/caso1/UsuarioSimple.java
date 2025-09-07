package caso1;

import java.util.Scanner;

public class UsuarioSimple {
    private String nombre;
    private int edad;

    public UsuarioSimple(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }

    public String presentacion() {
        return "Hola, soy " + nombre + " y tengo " + edad + " años.";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: ");
        String n = sc.nextLine();
        System.out.print("Edad: ");
        int e = sc.nextInt();
        UsuarioSimple u = new UsuarioSimple(n, e);
        System.out.println(u.presentacion());
        sc.close();
    }
}

