package com.lifecycle.demo;

import android.content.Context;

import com.lifecycle.demo.db.UserDataSource;
import com.lifecycle.demo.db.UserDataSourceImpl;
import com.lifecycle.demo.db.UserDatabase;
import com.lifecycle.demo.ui.UserModelFactory;

/**
 * @author liuwen
 * @Module.Name
 * @Create.Date 2019-06-11 17:37
 * @Update.By liuwen
 * @Update.Content
 * @Update.Date 2019-06-11 17:37
 * @see
 */
public class Injection {

    public static UserDataSource provideUserDataSource(Context context) {
        UserDatabase database = UserDatabase.getInstance(context);
        return new UserDataSourceImpl(database.userDao());
    }

    public static UserModelFactory provideViewModelFactory(Context context) {
        UserDataSource dataSource = provideUserDataSource(context);
        return new UserModelFactory(dataSource);
    }
}
