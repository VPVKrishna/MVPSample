package com.myapp.krishnavasamsetti.mvpsample.login;

import com.myapp.krishnavasamsetti.mvpsample.view.MvpView;

public interface LoginMvpView extends MvpView {

    void openMainActivity();

    void onLoginButtonClick();

}