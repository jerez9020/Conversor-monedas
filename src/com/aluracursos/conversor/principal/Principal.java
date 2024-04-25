package com.aluracursos.conversor.principal;

import com.aluracursos.conversor.conversion.ConversorMonedas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        float valorConvertir;
        String deMoneda, aMoneda;
        do {
            System.out.println("********************************************************");
            System.out.println("Sea bienvenido/a al Conversor de com.aluracursos.conversor.conversion.Monedas =]\n");
            System.out.println("1) Dolar =>> Peso argentino");
            System.out.println("2) Peso argentino =>> Dolar");
            System.out.println("3) Dolar =>> Real brasileño");
            System.out.println("4) Real brasileño =>> Dolar");
            System.out.println("5) Dolar =>> Peso colombiano");
            System.out.println("6) Peso colombiano =>> Dolar");
            System.out.println("7) Salir");
            System.out.println("Elija una opcion valida:\n");
            System.out.println("********************************************************");

            opcion = leer.nextInt();

            switch (opcion)
            {
                case 1:
                        deMoneda = "USD";
                        aMoneda = "ARS";
                        System.out.println("Ingrese el valor que deseas convertir:");
                        valorConvertir = leer.nextFloat();
                        ConversorMonedas.consultaYConvertir(deMoneda, aMoneda, valorConvertir);

                    break;
                case 2:
                        deMoneda = "ARS";
                        aMoneda = "USD";
                        System.out.println("Ingrese el valor que deseas convertir:");
                        valorConvertir = leer.nextFloat();
                        ConversorMonedas.consultaYConvertir(deMoneda, aMoneda, valorConvertir);
                        break;
                case 3:
                        deMoneda = "USD";
                        aMoneda = "BRL";
                        System.out.println("Ingrese el valor que deseas convertir:");
                        valorConvertir = leer.nextFloat();
                        ConversorMonedas.consultaYConvertir(deMoneda, aMoneda, valorConvertir);
                    break;
                case 4:
                        deMoneda = "BRL";
                        aMoneda = "USD";
                        System.out.println("Ingrese el valor que deseas convertir:");
                        valorConvertir = leer.nextFloat();
                        ConversorMonedas.consultaYConvertir(deMoneda, aMoneda, valorConvertir);
                    break;
                case 5:
                        deMoneda = "USD";
                        aMoneda = "COP";
                        System.out.println("Ingrese el valor que deseas convertir:");
                        valorConvertir = leer.nextFloat();
                        ConversorMonedas.consultaYConvertir(deMoneda, aMoneda, valorConvertir);
                    break;
                case 6:
                        deMoneda = "COP";
                        aMoneda = "USD";
                        System.out.println("Ingrese el valor que deseas convertir:");
                        valorConvertir = leer.nextFloat();
                        ConversorMonedas.consultaYConvertir(deMoneda, aMoneda, valorConvertir);
                    break;
                case 7:
                    System.out.println("Ustes salio del programa. Gracias...");
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
                    break;
            }

        }while (opcion != 7);

    }
}
