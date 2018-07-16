package com.kotlintut.prathamesh.viewmodel_tut.viewmodel;

import android.databinding.BaseObservable;

import com.kotlintut.prathamesh.viewmodel_tut.R;
import com.kotlintut.prathamesh.viewmodel_tut.model.User;

public class UserModel extends BaseObservable{

    private String uname;
    private String pwd;
    private String unamehint;
    private String pwdhint;

    public UserModel(User user) {
        this.unamehint =  user.unamehint;
        this.pwdhint =  user.pwdhint;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
        notifyPropertyChanged(R.id.unameid);
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
        notifyPropertyChanged(R.id.pwdid);
    }

    public String getUnamehint() {
        return unamehint;
    }

    public void setUnamehint(String unamehint) {
        this.unamehint = unamehint;
    }

    public String getPwdhint() {
        return pwdhint;
    }

    public void setPwdhint(String pwdhint) {
        this.pwdhint = pwdhint;
    }
}
