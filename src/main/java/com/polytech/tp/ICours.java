package com.polytech.tp;

public interface ICours {
    String getMatiere();
    String getEnseignant();
    String getSalle();
    String getDate();
    String getHeure();
    boolean isOptionnel();
    String getMaterielRequis();
    String getDescription();
}