package com.lifecycle.demo.ui;

import androidx.lifecycle.ViewModel;

import com.lifecycle.demo.db.User;
import com.lifecycle.demo.db.UserDataSource;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;

/**
 * @author liuwen
 * @Module.Name
 * @Create.Date 2019-06-11 15:53
 * @Update.By liuwen
 * @Update.Content
 * @Update.Date 2019-06-11 15:53
 * @see
 */
public class UserViewModel extends ViewModel {


    private final UserDataSource mDataSource;

    public UserViewModel(UserDataSource dataSource) {
        mDataSource = dataSource;
    }

    Flowable<String> getUserName() {
        return mDataSource.getUser()
                .map(new Function<User, String>() {
                    @Override
                    public String apply(User user) throws Exception {
                        return user.getUserName();
                    }
                });
    }

    public Completable updateUserName(final String userName) {
        User mUser = new User(1L, userName);
        return mDataSource.insertUser(mUser);
    }
}
