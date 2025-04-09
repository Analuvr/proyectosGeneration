package org.generation.model;
//Plantilla para el objeto
public class CuentaBancaria {
    //Atributo: idCuenta, cliente, saldo (con clase wrapper)
    private Long idCuenta;
    private String cliente;
    private Double saldo;

    //Metodo constructor (clientes existentes)
    public CuentaBancaria(Long idCuenta, String cliente, Double saldo) {
        this.idCuenta = idCuenta;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    //Metodo constructor (clientes nuevos)
    public CuentaBancaria(Long idCuenta, String cliente) {
        this.idCuenta = idCuenta;
        this.cliente = cliente;
        this.saldo = 0d;
    }

    //Getters y Setters
    public Long getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(Long idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    //Sobreescribir toString()

    @Override
    public String toString() {
        return "ID: " + idCuenta + ", Nombre del Cliente: " + cliente + ", Saldo: " + saldo;
    }

}



