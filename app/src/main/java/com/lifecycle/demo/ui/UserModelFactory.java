package com.lifecycle.demo.ui;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.lifecycle.demo.db.UserDataSource;

/**
 * @author liuwen
 * @Module.Name
 * @Create.Date 2019-06-11 16:07
 * @Update.By liuwen
 * @Update.Content
 * @Update.Date 2019-06-11 16:07
 * @see
 */
public class UserModelFactory implements ViewModelProvider.Factory {


    private final UserDataSource mUserDataSource;

    public UserModelFactory(UserDataSource userDataSource) {
        mUserDataSource = userDataSource;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(UserViewModel.class)) {
            return (T) new UserViewModel(mUserDataSource);
        } else {
            throw new IllegalArgumentException("Unkown ViewModel Class");
        }
    }
}
