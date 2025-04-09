package org.generation.service;

import org.generation.exceptions.SaldoInsuficienteException;
import org.generation.model.CuentaBancaria;

// Metodos que definen la lógica del negocio (comportamientos del objeto)
public class CuentaBancariaService {

    // Consultar saldo (reutilizable)
    // Metodo para todas las instancias
    public Double consultar(CuentaBancaria cuentaBancaria) { // Recibe como parámetro la instancia del objeto
        return cuentaBancaria.getSaldo();
    }

    // Depositar dinero
    public void depositar (CuentaBancaria cuentaBancaria, Double deposito) {
        cuentaBancaria.setSaldo(cuentaBancaria.getSaldo() + deposito);
    }

    // Retirar dinero implementa una Exception (SaldoInsuficienteException)
    public void retirar(CuentaBancaria cuentaBancaria, Double retiro) throws SaldoInsuficienteException {
        if (retiro <= cuentaBancaria.getSaldo()) {
            cuentaBancaria.setSaldo(cuentaBancaria.getSaldo() - retiro);
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
    }

}
