package com.polytech.tp;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireEmploiDuTemps implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private List<Cours> cours = new ArrayList<>();
    private String changement;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void ajouterCours(Cours c) {
        this.cours.add(c);
        notifyObservers("Nouveau cours ajouté: " + c.getMatiere());
    }

    public void modifierCours(int index, Cours nouveauCours) {
        if (index >= 0 && index < cours.size()) {
            String ancienne = cours.get(index).getMatiere();
            cours.set(index, nouveauCours);
            notifyObservers("Cours modifié: " + ancienne + " -> " + nouveauCours.getMatiere());
        }
    }

    public void annulerCours(int index) {
        if (index >= 0 && index < cours.size()) {
            String matiere = cours.get(index).getMatiere();
            cours.remove(index);
            notifyObservers("Cours annulé: " + matiere);
        }
    }

    public void setChangement(String changement) {
        this.changement = changement;
        notifyObservers(changement);
    }

    public String getChangement() {
        return changement;
    }

    public List<Cours> getCours() { return cours; }
}