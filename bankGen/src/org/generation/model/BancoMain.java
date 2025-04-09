package org.generation.model;

import org.generation.exceptions.SaldoInsuficienteException;
import org.generation.service.CuentaBancariaService;

// Esta es la única clase en la que tendremos un metodo main
public class BancoMain {
    public static void main(String[] args){
        //Instanciar
        CuentaBancaria denisse = new CuentaBancaria(1234L, "Denisse Hernández", 230000D);
        CuentaBancaria anaKaren = new CuentaBancaria(12345L, "Ana Karen Godínez");

        System.out.println(denisse);
        System.out.println(anaKaren);

        //Probar métodos de Service (conectar BancoMain con Service, crear instancia de Service)
        CuentaBancariaService cuentaBancariaService = new CuentaBancariaService();

        System.out.println(cuentaBancariaService.consultar(denisse)); // Output: 230000.0
        System.out.println(cuentaBancariaService.consultar(anaKaren)); // Output: 0

        cuentaBancariaService.depositar(anaKaren, 19183d);
        System.out.println(cuentaBancariaService.consultar(denisse)); // Output: 230000.0
        System.out.println(cuentaBancariaService.consultar(anaKaren)); // Output: 19183.0

        System.out.println(denisse);
        System.out.println(anaKaren);

        System.out.println("Te quedan: $" + cuentaBancariaService.consultar(denisse));

        try {
            cuentaBancariaService.retirar(denisse, 45000d);
        } catch(SaldoInsuficienteException e) {
            System.out.println("Saldo insuficiente");
        }

        System.out.println("Te quedan: $" + cuentaBancariaService.consultar(denisse));

        try {
            cuentaBancariaService.retirar(denisse, 45000d);
        } catch(SaldoInsuficienteException e) {
            System.out.println("Saldo insuficiente");
        }

        System.out.println("Te quedan: $" + cuentaBancariaService.consultar(denisse));

        try {
            cuentaBancariaService.retirar(denisse, 150000d);
        } catch(SaldoInsuficienteException e) {
            System.out.println("Saldo insuficiente");
        }

        System.out.println("Te quedan: $" + cuentaBancariaService.consultar(denisse));

        try {
            cuentaBancariaService.retirar(denisse, 140000d);
        } catch(SaldoInsuficienteException e) {
            System.out.println("Saldo insuficiente");
        }

        System.out.println("Te quedan: $" + cuentaBancariaService.consultar(denisse));

    }
}
