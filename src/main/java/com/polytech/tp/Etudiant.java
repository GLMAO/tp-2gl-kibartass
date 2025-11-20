package com.polytech.tp;

public class Etudiant implements Observer {
    private String nom;
    private String email;

    public Etudiant(String nom, String email) {
        this.nom = nom;
        this.email = email;
    }

    public String getNom() { return nom; }
    public String getEmail() { return email; }

    @Override
    public void update(String message) {
        System.out.println("[ETUDIANT] " + nom + " - Notification: " + message);
    }
}