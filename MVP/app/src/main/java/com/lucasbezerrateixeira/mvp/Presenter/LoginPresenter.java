package com.lucasbezerrateixeira.mvp.Presenter;

public interface LoginPresenter {

    void validateCredentials(String username, String password);

    void onDestroy();

}
