package com.Sport;

import com.Sport.ViewWindow.FenetreAccueil;
import com.Sport.models.UserInformation;
import com.Sport.repository.ActivityRepository;
import com.Sport.repository.UserRepository;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import io.github.cdimascio.dotenv.Dotenv;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.sql.Date;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        Dotenv dotenv = null;
        dotenv = Dotenv.configure().load();

        try (MongoClient mongoClient = MongoClients.create(dotenv.get("ConnectionString"))) {
            MongoDatabase database = mongoClient.getDatabase("BestApplicationever");
            UserRepository userRepository = new UserRepository(database.getCollection("Users"));
            ActivityRepository activityRepository = new ActivityRepository(database.getCollection("Activities"));


            Date dateNow = new Date(1687784335L);
//            userRepository.Add(new UserInformation("Antoine","UwU", dateNow, "Homme"));
//            activityRepository.Add(new Activity("Velo", dateNow, 6D, 30L, 60D));

            UserInformation user = userRepository.GetUserInformation();
            System.out.println(user);
//            userRepository.Delete(user);
//            user = userRepository.GetUserInformation();


        }
    }
    JFrame frame = new FenetreAccueil();
}