package com.cuenta.banco.app;

import com.cuenta.banco.dominio.Banco;
import com.cuenta.banco.dominio.CuentaBancaria;
import com.cuenta.banco.dominio.Persona;

public class AppBanco {
    public static void main(String[] args) {

        Banco bancolombia = new Banco("Bancolombia");
        Persona salomon = new Persona("salomon");
        CuentaBancaria miCuenta = new CuentaBancaria("123456789", salomon,bancolombia);
        CuentaBancaria vanessaCuenta = new CuentaBancaria("12345", new Persona("Vanessa Dominguez"), bancolombia);

        miCuenta.consignar(10000);
        miCuenta.retirar(65000);
        miCuenta.transferir(1000, vanessaCuenta);
        miCuenta.mostrarSaldo();



        System.out.println("Vanessa");
        vanessaCuenta.mostrarSaldo();
    }
}
