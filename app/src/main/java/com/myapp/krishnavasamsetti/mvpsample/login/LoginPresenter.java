package com.myapp.krishnavasamsetti.mvpsample.login;

import com.myapp.krishnavasamsetti.mvpsample.data_manager.DataManager;
import com.myapp.krishnavasamsetti.mvpsample.presenter.BasePresenter;

/**
 * Created by krishna.vasamsetti on 2/9/2018.
 */

public class LoginPresenter<V extends LoginMvpView> extends BasePresenter<V> implements LoginMvpPresenter<V>{

    public LoginPresenter(DataManager manager) {
        super(manager);
    }

    @Override
    public void startLogin(String email) {
        getDataManager().setEmail(email);
        getDataManager().setLoggedInMode(true);
        getMvpView().openMainActivity();
    }
}
