package com.lifecycle.demo.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

/**
 * @author liuwen
 * @Module.Name
 * @Create.Date 2019-06-11 15:07
 * @Update.By liuwen
 * @Update.Content
 * @Update.Date 2019-06-11 15:07
 * @see
 */
@Database(entities = {User.class}, version = 1, exportSchema = false)
public abstract class UserDatabase extends RoomDatabase {

    private static volatile UserDatabase INSTANCE;

    public static UserDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (UserDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            UserDatabase.class, "User.db").build();
                }
            }
        }
        return INSTANCE;
    }

    public abstract UserDao userDao();

}
