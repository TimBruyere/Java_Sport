package com.Sport.repository;

import com.Sport.models.UserInformation;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;

import static com.Sport.mapper.UserMapper.DocumentToUser;
import static com.Sport.mapper.UserMapper.UserToDocument;

public class UserRepository implements IUserRepository {

    private MongoCollection<Document> Collection;

    public UserRepository(MongoCollection<Document> collection) {
        Collection = collection;
    }

    @Override
    public InsertOneResult Add(UserInformation userInformation) {
        return Collection.insertOne(UserToDocument(userInformation));
    }

    @Override
    public UserInformation GetUserInformation() {
        Document userDocument = Collection.find().first();
        return DocumentToUser(userDocument);
    }

    @Override
    public DeleteResult Delete(UserInformation user) {
        return Collection.deleteOne(UserToDocument(user));
    }

    public UpdateResult Update(UserInformation user) { return Collection.replaceOne(new Document("_id", user.getUserId()), UserToDocument(user)); }

}
