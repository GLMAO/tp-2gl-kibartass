package com.polytech.tp;

public abstract class CoursDecorator implements ICours {
    protected ICours coursWrapped;

    public CoursDecorator(ICours cours) {
        this.coursWrapped = cours;
    }

    @Override
    public String getMatiere() {
        return coursWrapped.getMatiere();
    }

    @Override
    public String getEnseignant() {
        return coursWrapped.getEnseignant();
    }

    @Override
    public String getSalle() {
        return coursWrapped.getSalle();
    }

    @Override
    public String getDate() {
        return coursWrapped.getDate();
    }

    @Override
    public String getHeure() {
        return coursWrapped.getHeure();
    }

    @Override
    public boolean isOptionnel() {
        return coursWrapped.isOptionnel();
    }

    @Override
    public String getMaterielRequis() {
        return coursWrapped.getMaterielRequis();
    }

    @Override
    public abstract String getDescription();
}