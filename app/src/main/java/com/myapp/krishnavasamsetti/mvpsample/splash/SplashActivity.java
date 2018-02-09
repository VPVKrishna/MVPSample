package com.myapp.krishnavasamsetti.mvpsample.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.myapp.krishnavasamsetti.mvpsample.R;
import com.myapp.krishnavasamsetti.mvpsample.application.MvpApplication;
import com.myapp.krishnavasamsetti.mvpsample.data_manager.DataManager;
import com.myapp.krishnavasamsetti.mvpsample.login.LoginActivity;
import com.myapp.krishnavasamsetti.mvpsample.main.MainActivity;
import com.myapp.krishnavasamsetti.mvpsample.view.BaseActivity;

/**
 * Created by krishna.vasamsetti on 2/9/2018.
 */

public class SplashActivity extends BaseActivity implements SplashMvpView {

    public static Intent getStartIntent(Context context){
        return new Intent(context, SplashActivity.class);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        DataManager dataManager = ((MvpApplication) getApplication()).getDataManager();

        SplashPresenter splashPresenter = new SplashPresenter(dataManager);
        splashPresenter.onAttach(this);
        splashPresenter.decideNextActivity();
    }

    @Override
    public void openLoginActivity() {
        Intent loginIntent = LoginActivity.getStartIntent(this);
        startActivity(loginIntent);
        finish();
    }

    @Override
    public void openMainActivity() {
        Intent mainIntent = MainActivity.getStartIntent(this);
        startActivity(mainIntent);
        finish();
    }
}
