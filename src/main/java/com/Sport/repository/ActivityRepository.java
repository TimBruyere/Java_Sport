package com.Sport.repository;

import com.Sport.models.Activity;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.InsertOneResult;
import org.bson.Document;

import static com.Sport.mapper.ActivityRepository.ActivityToDocument;

public class ActivityRepository implements IActivityRepository {
    private MongoCollection<Document> Collection;

    public ActivityRepository(MongoCollection<Document> collection) {
        Collection = collection;
    }

    @Override
    public InsertOneResult Add(Activity activity) {
        return Collection.insertOne(ActivityToDocument(activity));
    }
}
