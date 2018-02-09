package com.myapp.krishnavasamsetti.mvpsample.presenter;

import com.myapp.krishnavasamsetti.mvpsample.data_manager.DataManager;
import com.myapp.krishnavasamsetti.mvpsample.view.MvpView;

/**
 * Created by krishna.vasamsetti on 2/9/2018.
 */

public class BasePresenter<V extends MvpView> implements MvpPresenter<V> {

    private DataManager dataManager;
    private V mvpView;

    public BasePresenter(DataManager manager){
        dataManager = manager;
    }

    @Override
    public void onAttach(V view) {
        mvpView = view;
    }

    public V getMvpView(){
        return mvpView;
    }

    public DataManager getDataManager(){
        return dataManager;
    }
}
