package com.aluracursos.conversor.conversion;

public class ConversorMonedas {
    public static void consultaYConvertir(String deMoneda, String aMoneda, float valorConvertir) {
        ConsultaMoneda consulta = new ConsultaMoneda();
        Monedas monedas = consulta.buscaMonedas(deMoneda, valorConvertir);

        // Obtiene la tasa de conversión específica
        double tasaDeConversion = monedas.conversion_rates().getOrDefault(aMoneda, Float.NaN);

        // Verifica si se encontró la tasa de conversión
        if (!Double.isNaN(tasaDeConversion)) {
            // Realiza la conversión y muestra el resultado
            float resultado = (float) (valorConvertir * tasaDeConversion);
            System.out.println("El valor "+valorConvertir + " " + "["+deMoneda+"]" + " corresponde al valor final de =>> " + resultado + " " + "["+aMoneda+"]\n");
        } else {
            System.out.println("No se encontró una tasa de conversión para la opcion solicitada.\n");
        }
    }
}

