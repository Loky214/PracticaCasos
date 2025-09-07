package caso3;

import java.util.Scanner;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Titular: " + titular + " | Saldo: $" + saldo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del titular: ");
        String t = sc.nextLine();
        System.out.print("Saldo inicial: ");
        double s = sc.nextDouble();

        CuentaBancaria cuenta = new CuentaBancaria(t, s);
        cuenta.mostrarSaldo();

        System.out.print("Monto a depositar: ");
        cuenta.depositar(sc.nextDouble());
        cuenta.mostrarSaldo();

        System.out.print("Monto a retirar: ");
        cuenta.retirar(sc.nextDouble());
        cuenta.mostrarSaldo();

        sc.close();
    }
}
