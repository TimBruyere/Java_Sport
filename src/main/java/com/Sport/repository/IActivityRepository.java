package com.Sport.repository;

import com.Sport.models.Activity;
import com.mongodb.client.result.InsertOneResult;

public interface IActivityRepository {
    InsertOneResult Add(Activity activity);
}
