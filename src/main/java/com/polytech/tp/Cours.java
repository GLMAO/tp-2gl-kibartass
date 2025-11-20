package com.polytech.tp;

public class Cours implements ICours {
    private final String matiere;
    private final String enseignant;
    private final String salle;
    private final String date;
    private final String heure;
    private final boolean optionnel;
    private final String materielRequis;

    // Constructor with 8 parameters (for tests and direct instantiation)
    public Cours(String matiere, String enseignant, String salle, String date, 
                 String heure, boolean optionnel, String materielRequis, boolean unused) {
        this.matiere = matiere;
        this.enseignant = enseignant;
        this.salle = salle;
        this.date = date;
        this.heure = heure;
        this.optionnel = optionnel;
        this.materielRequis = materielRequis;
    }

    @Override
    public String getMatiere() { return matiere; }
    @Override
    public String getEnseignant() { return enseignant; }
    @Override
    public String getSalle() { return salle; }
    @Override
    public String getDate() { return date; }
    @Override
    public String getHeure() { return heure; }
    @Override
    public boolean isOptionnel() { return optionnel; }
    @Override
    public String getMaterielRequis() { return materielRequis; }

    @Override
    public String getDescription() {
        return matiere;
    }

    @Override
    public String toString() {
        return String.format("Cours{matiere='%s', enseignant='%s', salle='%s', date='%s', heure='%s', optionnel=%b, materiel='%s'}",
                matiere, enseignant, salle, date, heure, optionnel, materielRequis);
    }
}