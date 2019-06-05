package com.lucasbezerrateixeira.mvp.Presenter;

import com.lucasbezerrateixeira.mvp.Model.LoginInteractor;
import com.lucasbezerrateixeira.mvp.View.LoginView;

public class LoginPresenterImpl implements LoginPresenter, LoginInteractor.OnLoginFinishedListener{

    private LoginView loginView;
    private LoginInteractor loginInteractor;

    public LoginPresenterImpl(LoginView loginView, LoginInteractor loginInteractor) {
        this.loginView = loginView;
        this.loginInteractor = loginInteractor;
    }

    @Override
    public void validateCredentials(String username, String password) {

        if (loginView!=null){

            loginView.showProgress();

        }

        loginInteractor.login(username,password,this);


    }

    @Override
    public void onDestroy() {

        loginView = null;

    }

    @Override
    public void onUsernameError() {

        if (loginView!=null){
            loginView.setUsernameError();
            loginView.hideProgess();
        }

    }

    @Override
    public void onPasswordError() {

        if (loginView!=null){
            loginView.setPasswordError();
            loginView.hideProgess();
        }
    }

    @Override
    public void onSuccess() {

        if (loginView!=null){
            loginView.navigateToHome();
            loginView.hideProgess();
        }


    }


}
