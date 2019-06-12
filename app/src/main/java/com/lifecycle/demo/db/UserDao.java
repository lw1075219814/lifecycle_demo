package com.lifecycle.demo.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import io.reactivex.Completable;
import io.reactivex.Flowable;

/**
 * @author liuwen
 * @Module.Name
 * @Create.Date 2019-06-11 15:25
 * @Update.By liuwen
 * @Update.Content
 * @Update.Date 2019-06-11 15:25
 * @see
 */
@Dao
public interface UserDao {
    @Query("SELECT * FROM user LIMIT 1")
    Flowable<User> getUser();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Completable insertUser(User user);
}
