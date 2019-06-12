package com.lifecycle.demo.db;

import io.reactivex.Completable;
import io.reactivex.Flowable;

/**
 * @author liuwen
 * @Module.Name
 * @Create.Date 2019-06-11 15:48
 * @Update.By liuwen
 * @Update.Content
 * @Update.Date 2019-06-11 15:48
 * @see
 */
public class UserDataSourceImpl implements UserDataSource {

    private final UserDao mUserDao;

    public UserDataSourceImpl(UserDao userDao) {
        mUserDao = userDao;
    }

    @Override
    public Flowable<User> getUser() {
        return mUserDao.getUser();
    }

    @Override
    public Completable insertUser(User user) {
        return mUserDao.insertUser(user);
    }
}
