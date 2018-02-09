package com.myapp.krishnavasamsetti.mvpsample.presenter;

import com.myapp.krishnavasamsetti.mvpsample.view.MvpView;

/**
 * Created by krishna.vasamsetti on 2/9/2018.
 */

public interface MvpPresenter<V extends MvpView> {

    void onAttach(V view);
}
