package com.polytech.tp;

public class CoursBuilder {
    private String matiere;
    private String enseignant;
    private String salle;
    private String date;
    private String heure;
    private boolean optionnel = false;
    private String materielRequis = "";

    public CoursBuilder setMatiere(String matiere) {
        this.matiere = matiere;
        return this;
    }

    public CoursBuilder setEnseignant(String enseignant) {
        this.enseignant = enseignant;
        return this;
    }

    public CoursBuilder setSalle(String salle) {
        this.salle = salle;
        return this;
    }

    public CoursBuilder setDate(String date) {
        this.date = date;
        return this;
    }

    public CoursBuilder setHeure(String heure) {
        this.heure = heure;
        return this;
    }

    public CoursBuilder setOptionnel(boolean optionnel) {
        this.optionnel = optionnel;
        return this;
    }

    public CoursBuilder setMaterielRequis(String materielRequis) {
        this.materielRequis = materielRequis;
        return this;
    }

    public Cours build() {
        return new Cours(matiere, enseignant, salle, date, heure, optionnel, materielRequis, false);
    }
}