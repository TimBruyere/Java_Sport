package com.Sport.ViewWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreAccueil extends JFrame {
    public FenetreAccueil() {
        setTitle("Accueil");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Création des composants
        JLabel label = new JLabel("Bienvenue dans votre application !");
        JButton profilButton = new JButton("Profil utilisateur");
        JButton activiteButton = new JButton("Création d'activité sportive");

        // Définition du gestionnaire de disposition
        setLayout(new BorderLayout());

        // Ajout des composants à la fenêtre
        add(label, BorderLayout.NORTH);
        add(profilButton, BorderLayout.CENTER);
        add(activiteButton, BorderLayout.SOUTH);

        // Écouteur de bouton pour la fenêtre de profil utilisateur
        profilButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FenetreProfilUtilisateur fenetreProfil = new FenetreProfilUtilisateur();
                fenetreProfil.setVisible(true);
            }
        });

        // Écouteur de bouton pour la fenêtre de création d'activité sportive
        activiteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FenetreCreationActivite fenetreActivite = new FenetreCreationActivite();
                fenetreActivite.setVisible(true);
            }
        });

        // Pack pour ajuster la taille de la fenêtre en fonction des composants
        pack();

        // Affichage de la fenêtre
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FenetreAccueil());
    }
}