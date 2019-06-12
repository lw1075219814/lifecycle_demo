package com.lifecycle.demo.db;

import io.reactivex.Completable;
import io.reactivex.Flowable;

/**
 * @author liuwen
 * @Module.Name
 * @Create.Date 2019-06-11 14:57
 * @Update.By liuwen
 * @Update.Content
 * @Update.Date 2019-06-11 14:57
 * @see
 */
public interface UserDataSource {

    Flowable<User> getUser();

    Completable insertUser(User user);
}
