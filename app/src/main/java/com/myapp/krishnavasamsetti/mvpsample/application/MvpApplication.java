package com.myapp.krishnavasamsetti.mvpsample.application;

import android.app.Application;

import com.myapp.krishnavasamsetti.mvpsample.data_manager.DataManager;
import com.myapp.krishnavasamsetti.mvpsample.helper.SharedPrefHelper;

/**
 * Created by krishna.vasamsetti on 2/9/2018.
 */

public class MvpApplication extends Application{

    private DataManager dataManager;

    @Override
    public void onCreate() {
        super.onCreate();

        SharedPrefHelper sharedPrefHelper = new SharedPrefHelper(this);
        dataManager = new DataManager(sharedPrefHelper);
    }

    public DataManager getDataManager(){
        return dataManager;
    }
}
