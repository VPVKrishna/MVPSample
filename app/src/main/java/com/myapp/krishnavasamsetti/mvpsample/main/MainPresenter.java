package com.myapp.krishnavasamsetti.mvpsample.main;

import com.myapp.krishnavasamsetti.mvpsample.data_manager.DataManager;
import com.myapp.krishnavasamsetti.mvpsample.presenter.BasePresenter;

/**
 * Created by krishna.vasamsetti on 2/9/2018.
 */

public class MainPresenter<V extends MainMvpView> extends BasePresenter<V> implements MainMvpPresenter<V>{

    public static final String TAG = MainPresenter.class.getSimpleName();

    public MainPresenter(DataManager manager) {
        super(manager);
    }

    @Override
    public String getEmailId() {
        return getDataManager().getEmail();
    }

    @Override
    public void setUserLogout() {
        getDataManager().clear();
        getMvpView().openSplashActivity();
    }
}
