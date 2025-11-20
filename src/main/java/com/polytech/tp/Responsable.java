package com.polytech.tp;

public class Responsable implements Observer {
    private String nom;
    private String email;

    public Responsable(String nom, String email) {
        this.nom = nom;
        this.email = email;
    }

    public String getNom() { return nom; }
    public String getEmail() { return email; }

    @Override
    public void update(String message) {
        System.out.println("[RESPONSABLE] " + nom + " - Notification: " + message);
    }
}