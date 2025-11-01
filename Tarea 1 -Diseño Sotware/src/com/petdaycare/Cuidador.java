package com.petdaycare;

public class Cuidador extends Usuario {
    private String cuidadorId;
    private boolean disponible = true;

    public Cuidador(String id, String nombre, String email, String cuidadorId) {
        super(id, nombre, email);
        this.cuidadorId = cuidadorId;
    }

    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean d) { this.disponible = d; }
    public String getCuidadorId() { return cuidadorId; }
}
