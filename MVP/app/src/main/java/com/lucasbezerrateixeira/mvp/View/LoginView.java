package com.lucasbezerrateixeira.mvp.View;

public interface LoginView {

    void showProgress();

    void hideProgess();

    void setUsernameError();

    void setPasswordError();

     void navigateToHome();
}
