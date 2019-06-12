package com.lifecycle.demo.db;

import androidx.room.ColumnInfo;
import androidx.room.Entity;

import androidx.annotation.NonNull;
import androidx.room.PrimaryKey;

/**
 * @author liuwen
 * @Module.Name
 * @Create.Date 2019-06-11 14:52
 * @Update.By liuwen
 * @Update.Content
 * @Update.Date 2019-06-11 14:52
 * @see
 */
@Entity(tableName = "user")
public class User {

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "user_id")
    private long userId;

    @ColumnInfo(name = "user_name")
    private String userName;

    public User(long userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
