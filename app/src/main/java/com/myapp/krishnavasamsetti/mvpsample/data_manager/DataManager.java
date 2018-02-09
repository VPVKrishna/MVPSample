package com.myapp.krishnavasamsetti.mvpsample.data_manager;

import com.myapp.krishnavasamsetti.mvpsample.helper.SharedPrefHelper;

/**
 * Created by krishna.vasamsetti on 2/9/2018.
 */

public class DataManager {
    private SharedPrefHelper prefHelper;

    public DataManager(SharedPrefHelper sharedPrefHelper) {
        prefHelper = sharedPrefHelper;
    }

    public void setEmail(String email) {
        prefHelper.setEmail(email);
    }

    public void setPassword(String password) {
        prefHelper.setPassword(password);
    }

    public void setLoggedInMode(boolean loggedInMode) {
        prefHelper.setIsLogged(loggedInMode);
    }

    public String getEmail() {
        return prefHelper.getEmail();
    }

    public String getPassword() {
        return prefHelper.getPassword();
    }

    public boolean getLoggedInMode() {
        return prefHelper.isLoggedIn();
    }

    public void clear(){
        prefHelper.clear();
    }
}
