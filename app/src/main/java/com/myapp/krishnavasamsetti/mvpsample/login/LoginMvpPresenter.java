package com.myapp.krishnavasamsetti.mvpsample.login;

import com.myapp.krishnavasamsetti.mvpsample.presenter.MvpPresenter;
import com.myapp.krishnavasamsetti.mvpsample.view.MvpView;

/**
 * Created by krishna.vasamsetti on 2/9/2018.
 */

public interface LoginMvpPresenter<V extends MvpView> extends MvpPresenter<V>{

    void startLogin(String email);
}
