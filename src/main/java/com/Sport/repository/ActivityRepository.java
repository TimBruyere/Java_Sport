package com.Sport.repository;

import com.Sport.models.Activity;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;

import static com.Sport.mapper.ActivityRepository.ActivityToDocument;
import static com.Sport.mapper.ActivityRepository.DocumentToActivity;

public class ActivityRepository implements IActivityRepository {
    private MongoCollection<Document> Collection;

    public ActivityRepository(MongoCollection<Document> collection) {
        Collection = collection;
    }

    @Override
    public InsertOneResult Add(Activity activity) {
        return Collection.insertOne(ActivityToDocument(activity));
    }

    public Activity GetActivityInformation(){
        Document activityDocument = Collection.find().first();
        return DocumentToActivity(activityDocument);
    }

    public DeleteResult Delete(Activity activity) { return Collection.deleteOne(new Document("_id", activity.getActivityId())); }

//    public UpdateResult Update()
}
