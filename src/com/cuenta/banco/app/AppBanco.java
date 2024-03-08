package com.cuenta.banco.app;

import com.cuenta.banco.dominio.Banco;
import com.cuenta.banco.dominio.CuentaBancaria;

public class AppBanco {
    public static void main(String[] args) {

        Banco bancolombia = new Banco("Bancolombia"); 
        CuentaBancaria miCuenta = new CuentaBancaria();
        CuentaBancaria vanessaCuenta = new CuentaBancaria();



        miCuenta.consignar(1000000);
        miCuenta.retirar(65000);
        miCuenta.transferir(1000, vanessaCuenta);
        miCuenta.mostrarSaldo();
        System.out.println("Vanessa");
        vanessaCuenta.mostrarSaldo();
    }
}
