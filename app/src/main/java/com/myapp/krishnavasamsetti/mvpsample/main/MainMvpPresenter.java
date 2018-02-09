package com.myapp.krishnavasamsetti.mvpsample.main;

import com.myapp.krishnavasamsetti.mvpsample.presenter.MvpPresenter;

/**
 * Created by krishna.vasamsetti on 2/9/2018.
 */

public interface MainMvpPresenter<V extends MainMvpView> extends MvpPresenter<V> {

    String getEmailId();

    void setUserLogout();

}
