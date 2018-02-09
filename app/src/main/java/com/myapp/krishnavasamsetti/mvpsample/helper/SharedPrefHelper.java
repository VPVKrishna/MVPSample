package com.myapp.krishnavasamsetti.mvpsample.helper;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by krishna.vasamsetti on 2/9/2018.
 */

public class SharedPrefHelper {

    private static final String PREF_NAME ="pref";

    private static final String EMAIL_PREF ="email";
    private static final String PASSWORD_PREF ="password";
    private static final String IS_LOGGED_PREF ="is_logged";

    private final SharedPreferences preferences;

    public SharedPrefHelper(Context context){
        preferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }

    public void setEmail(String email){
        preferences.edit().putString(EMAIL_PREF, email).apply();
    }

    public void setPassword(String password){
        preferences.edit().putString(PASSWORD_PREF, password).apply();
    }

    public void setIsLogged(boolean isLoggedIn){
        preferences.edit().putBoolean(IS_LOGGED_PREF, isLoggedIn).apply();
    }

    public String getEmail(){
        return preferences.getString(EMAIL_PREF,"");
    }

    public String getPassword(){
        return preferences.getString(PASSWORD_PREF, "");
    }

    public boolean isLoggedIn(){
        return preferences.getBoolean(IS_LOGGED_PREF, false);
    }

    public void clear(){
        preferences.edit().clear().apply();
    }

}
