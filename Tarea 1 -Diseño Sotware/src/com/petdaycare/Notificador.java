package com.petdaycare;

public interface Notificador {
    void enviar(String destino, String mensaje);
    String nombreCanal();
}
