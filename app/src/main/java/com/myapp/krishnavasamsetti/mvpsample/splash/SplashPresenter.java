package com.myapp.krishnavasamsetti.mvpsample.splash;

import android.os.Handler;

import com.myapp.krishnavasamsetti.mvpsample.data_manager.DataManager;
import com.myapp.krishnavasamsetti.mvpsample.presenter.BasePresenter;

/**
 * Created by krishna.vasamsetti on 2/9/2018.
 */

public class SplashPresenter<V extends SplashMvpView> extends BasePresenter<V>
        implements SplashMvpPresenter<V>{

    public SplashPresenter(DataManager manager) {
        super(manager);
    }

    @Override
    public void decideNextActivity() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(getDataManager().getLoggedInMode()){
                    getMvpView().openMainActivity();
                }else{
                    getMvpView().openLoginActivity();
                }
            }
        },2000);
    }
}
