package com.myapp.krishnavasamsetti.mvpsample.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.myapp.krishnavasamsetti.mvpsample.R;
import com.myapp.krishnavasamsetti.mvpsample.application.MvpApplication;
import com.myapp.krishnavasamsetti.mvpsample.data_manager.DataManager;
import com.myapp.krishnavasamsetti.mvpsample.main.MainActivity;
import com.myapp.krishnavasamsetti.mvpsample.utils.CommonUtils;
import com.myapp.krishnavasamsetti.mvpsample.view.BaseActivity;

/**
 * Created by krishna.vasamsetti on 2/9/2018.
 */

public class LoginActivity extends BaseActivity implements LoginMvpView{

    private TextInputEditText editTextEmail;
    private TextInputEditText editTextPwd;
    private LoginPresenter loginPresenter;

    public static Intent getStartIntent(Context context){
        return new Intent(context, LoginActivity.class);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        DataManager dataManager = ((MvpApplication) getApplication()).getDataManager();
        loginPresenter = new LoginPresenter(dataManager);
        loginPresenter.onAttach(this);


        editTextEmail = findViewById(R.id.tilEmail);
        editTextPwd = findViewById(R.id.tilPassword);

        Button btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onLoginButtonClick();
            }
        });
    }

    @Override
    public void openMainActivity() {
        Intent intent = MainActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }

    @Override
    public void onLoginButtonClick() {
        String email = editTextEmail.getText().toString().trim();
        String pwd = editTextPwd.getText().toString().trim();

        if(TextUtils.isEmpty(email)){
            Toast.makeText(this, "Please enter email", Toast.LENGTH_SHORT).show();
            return;
        }

        if(!CommonUtils.isEmailValid(email)){
            Toast.makeText(this, "Please enter valid email", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(pwd)){
            Toast.makeText(this, "Please enter password", Toast.LENGTH_SHORT).show();
            return;
        }

        loginPresenter.startLogin(email);
    }
}
