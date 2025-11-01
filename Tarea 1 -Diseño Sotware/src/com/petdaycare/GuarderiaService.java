package com.petdaycare;

public class GuarderiaService extends ServicioBase {
    public GuarderiaService(String id, String nombre, double precioBase) {
        super(id, nombre, precioBase);
    }

    @Override
    public boolean esCompatibleCon(Mascota m) {
        String tam = m.getTamano().toLowerCase();
        return tam.equals("pequeño") || tam.equals("mediano");
    }
}
