package com.Sport.ViewWindow;

import javax.swing.*;
import java.awt.*;

public class FenetreCreationActivite extends JFrame {
    public FenetreCreationActivite() {
        setTitle("Création d'activité sportive");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Création des composants
        JLabel titleLabel = new JLabel("Titre:");
        JTextField titreField = new JTextField();
        JButton creerButton = new JButton("Créer");

        // Définition du gestionnaire de disposition
        setLayout(new GridLayout(2, 1));

        // Ajout des composants à la fenêtre
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(titleLabel, BorderLayout.WEST);
        panel.add(titreField, BorderLayout.CENTER);
        add(panel);
        add(creerButton);

        // Pack pour ajuster la taille de la fenêtre en fonction des composants
        pack();

        // Affichage de la fenêtre
        setVisible(true);
    }
}