package com.petdaycare;

import java.util.HashMap;
import java.util.Map;

public class BloqueadorCupos {
    private Map<String, Long> bloqueos = new HashMap<>(); // reservaId -> timestamp

    public void bloquear(String reservaId) {
        bloqueos.put(reservaId, System.currentTimeMillis());
    }

    public void liberar(String reservaId) {
        bloqueos.remove(reservaId);
    }

    public boolean estaBloqueado(String reservaId) {
        return bloqueos.containsKey(reservaId);
    }
}
