package com.Sport.repository;

import com.Sport.models.UserInformation;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.InsertOneResult;

public interface IUserRepository {
    InsertOneResult Add(UserInformation userInformation);
    UserInformation GetUserInformation();

    DeleteResult Delete(UserInformation user);

}
