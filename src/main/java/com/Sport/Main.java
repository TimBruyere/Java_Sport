package com.Sport;

import com.Sport.ViewWindow.FenetreAccueil;
import com.Sport.models.UserInformation;
import com.Sport.models.Activity;
import com.Sport.repository.ActivityRepository;
import com.Sport.repository.UserRepository;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import io.github.cdimascio.dotenv.Dotenv;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.sql.Date;
import java.time.LocalDate;

@Slf4j
public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        Dotenv dotenv = null;
        dotenv = Dotenv.configure().load();

        try (MongoClient mongoClient = MongoClients.create(dotenv.get("ConnectionString"))) {
            MongoDatabase database = mongoClient.getDatabase("BestApplicationever");
            UserRepository userRepository = new UserRepository(database.getCollection("Users"));
            ActivityRepository activityRepository = new ActivityRepository(database.getCollection("Activities"));


            LocalDate dateNow = LocalDate.of(2022, 12, 03);
//            userRepository.Add(new UserInformation("guillaume","MonCrane", dateNow, "Hélicoptère de combat"));
            activityRepository.Add(new Activity("BK", dateNow, 6D, 30L, 60D));

//            UserInformation user = userRepository.GetUserInformation();
//            log.info("user: {}",user.getFirstName());
            Activity activity = activityRepository.GetActivityInformation();
            log.info("activity : {}", activity.getActivityId());
            activityRepository.Delete(activity);

//            userRepository.Delete(user);
//            user = userRepository.GetUserInformation();


        }
    }
    JFrame frame = new FenetreAccueil();
}