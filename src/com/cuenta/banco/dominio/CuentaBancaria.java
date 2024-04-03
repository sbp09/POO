package com.cuenta.banco.dominio;

public class CuentaBancaria {

    public String numero;
    public Persona propietario;
    public double saldo;
    public double tasaInteres;
    public String tipo;
    public Banco banco;

    //constructores
    public CuentaBancaria(String numero, Persona propietario, Banco banco) {
        this.numero = numero;
        this.propietario = propietario;
        this.banco = banco;
    }

    //Metodos
    public void consignar(int valorAConsignar){
        this.saldo = this.saldo + valorAConsignar;
    }

    public boolean retirar(int valorARetirar){
       if (valorARetirar <= this.saldo){
           this.saldo = this.saldo - valorARetirar;
           return true;
       }else {
           System.out.println("Saldo insuficiente.");
           return false;
       }
    }

    public boolean transferir(int valorATrans, CuentaBancaria otraCuenta){
        if (valorATrans <= this.saldo){
            this.saldo -= valorATrans;
            otraCuenta.consignar(valorATrans);
            return true;
        }
        System.out.println("Saldo insuficiente para la transaccion.");
        return false;
    }

    public void mostrarSaldo(){
        System.out.println("El saldo es: $" + this.saldo);
    }

    //getters y setters


    public String getNumero() {
        return numero;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public String getTipo() {
        return tipo;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
