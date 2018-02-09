package com.myapp.krishnavasamsetti.mvpsample.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.myapp.krishnavasamsetti.mvpsample.R;
import com.myapp.krishnavasamsetti.mvpsample.application.MvpApplication;
import com.myapp.krishnavasamsetti.mvpsample.data_manager.DataManager;
import com.myapp.krishnavasamsetti.mvpsample.splash.SplashActivity;
import com.myapp.krishnavasamsetti.mvpsample.view.BaseActivity;

/**
 * Created by krishna.vasamsetti on 2/9/2018.
 */

public class MainActivity extends BaseActivity implements MainMvpView{

    public static final String TAG = MainActivity.class.getSimpleName();
    private MainPresenter mainPresenter;

    public static Intent getStartIntent(Context context){
        return new Intent(context, MainActivity.class);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataManager dataManager = ((MvpApplication) getApplication()).getDataManager();
        mainPresenter = new MainPresenter(dataManager);
        mainPresenter.onAttach(this);

        TextView tvEmail = findViewById(R.id.tvEmail);
        tvEmail.setText(mainPresenter.getEmailId());

        Button btnLogout = findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainPresenter.setUserLogout();
            }
        });
    }

    @Override
    public void openSplashActivity() {
        Intent splashIntent = SplashActivity.getStartIntent(this);
        startActivity(splashIntent);
        finish();
    }
}
