package com.Sport.mapper;

import com.Sport.models.UserInformation;
import org.bson.Document;

public class UserMapper {
    public static Document UserToDocument(UserInformation user){
        return new Document()
                .append("FirstName", user.getFirstName())
                .append("LastName", user.getLastName())
                .append("BirthDay", user.getBirthDay())
                .append("Sex", user.getSex());
    }

    public static UserInformation DocumentToUser(Document document){
        UserInformation user = new UserInformation();
        user.setFirstName(document.getString("FirstName"));
        user.setLastName(document.getString("LastName"));
        user.setBirthDay(document.getDate("BirthDay"));
        user.setSex(document.getString("Sex"));

        return user;
    }
}
