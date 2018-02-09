package com.myapp.krishnavasamsetti.mvpsample.splash;

import com.myapp.krishnavasamsetti.mvpsample.presenter.MvpPresenter;

/**
 * Created by krishna.vasamsetti on 2/9/2018.
 */

public interface SplashMvpPresenter<V extends SplashMvpView> extends MvpPresenter<V> {

    void decideNextActivity();
}
