package com.aluracursos.conversor.conversion;

import java.util.Map;

public record Monedas(String base_code, Map<String, Float> conversion_rates) {
    public Map<String, Float> conversion_rates() {
        return this.conversion_rates;
    }

}

