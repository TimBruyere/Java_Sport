package com.Sport.ViewWindow;
import javax.swing.*;
import java.awt.*;

public class FenetreProfilUtilisateur extends JFrame {
    public FenetreProfilUtilisateur() {
        setTitle("Profil utilisateur");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Création des composants
        JLabel nomLabel = new JLabel("Nom: John Doe");
        JLabel ageLabel = new JLabel("Âge: 30 ans");
        // Ajoutez d'autres informations sur le profil utilisateur

        // Définition du gestionnaire de disposition
        setLayout(new GridLayout(2, 1));

        // Ajout des composants à la fenêtre
        add(nomLabel);
        add(ageLabel);
        // Ajoutez d'autres informations sur le profil utilisateur

        // Pack pour ajuster la taille de la fenêtre en fonction des composants
        pack();

        // Affichage de la fenêtre
        setVisible(true);
    }
}