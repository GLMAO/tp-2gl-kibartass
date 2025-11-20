package com.polytech;

import com.polytech.tp.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("=== EXERCISE 1: BUILDER PATTERN ===\n");
        
        // Create courses using the Builder pattern
        Cours cours1 = new CoursBuilder()
                .setMatiere("Génie Logiciel")
                .setEnseignant("Dr. Martin")
                .setSalle("A101")
                .setDate("2024-11-20")
                .setHeure("09:00")
                .setOptionnel(false)
                .setMaterielRequis("Laptop, IDE")
                .build();

        Cours cours2 = new CoursBuilder()
                .setMatiere("Base de Données")
                .setEnseignant("Mme Sophie")
                .setSalle("B205")
                .setDate("2024-11-21")
                .setHeure("14:00")
                .build();

        System.out.println(cours1);
        System.out.println(cours2);

        System.out.println("\n=== EXERCISE 2: OBSERVER PATTERN ===\n");
        
        // Create the schedule manager (Subject)
        GestionnaireEmploiDuTemps gestionnaire = new GestionnaireEmploiDuTemps();

        // Create observers
        Etudiant etudiant1 = new Etudiant("Alice", "alice@uni.edu");
        Etudiant etudiant2 = new Etudiant("Bob", "bob@uni.edu");
        Responsable responsable = new Responsable("Prof. Dupont", "dupont@uni.edu");

        // Attach observers
        gestionnaire.attach(etudiant1);
        gestionnaire.attach(etudiant2);
        gestionnaire.attach(responsable);

        // Adding a course notifies all observers
        gestionnaire.ajouterCours(cours1);
        System.out.println();

        // Modifying a course notifies all observers
        Cours coursMisAJour = new CoursBuilder()
                .setMatiere("Génie Logiciel - Advanced")
                .setEnseignant("Dr. Martin")
                .setSalle("A102")
                .setDate("2024-11-22")
                .setHeure("10:00")
                .build();
        gestionnaire.modifierCours(0, coursMisAJour);
        System.out.println();

        // Canceling a course notifies all observers
        gestionnaire.annulerCours(0);
        System.out.println();

        System.out.println("=== EXERCISE 3: DECORATOR PATTERN ===\n");
        
        // Create a base course
        Cours coursBase = new CoursBuilder()
                .setMatiere("Génie Logiciel")
                .setEnseignant("Dr. Martin")
                .setSalle("A101")
                .setDate("2024-11-20")
                .setHeure("09:00")
                .build();

        // Decorate the course
        ICours coursEnLigne = new CoursEnLigne(coursBase);
        System.out.println("Base course: " + coursBase.getMatiere());
        System.out.println("Decorated (Online): " + coursEnLigne.getDescription());

        // Stack decorators
        ICours coursEnLigneEtAnglais = new CoursEnAnglais(coursEnLigne);
        System.out.println("Decorated (Online + English): " + coursEnLigneEtAnglais.getDescription());

        ICours coursComplet = new CoursMagistral(coursEnLigneEtAnglais);
        System.out.println("Decorated (Online + English + Lecture): " + coursComplet.getDescription());
    }
}