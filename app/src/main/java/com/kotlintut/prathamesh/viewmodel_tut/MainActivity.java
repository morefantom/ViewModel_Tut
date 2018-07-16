package com.kotlintut.prathamesh.viewmodel_tut;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.kotlintut.prathamesh.viewmodel_tut.command.userLogin;
import com.kotlintut.prathamesh.viewmodel_tut.databinding.ActivityMainBinding;
import com.kotlintut.prathamesh.viewmodel_tut.model.User;
import com.kotlintut.prathamesh.viewmodel_tut.viewmodel.UserModel;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding amb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        amb= DataBindingUtil.setContentView(this,R.layout.activity_main);
        UserModel um=new UserModel(new User("User Name","Password"));
        amb.setLogin(um);

        amb.setUserloginevent(new userLogin() {
            @Override
            public void onClickLogin() {
                Toast.makeText(MainActivity.this,""+amb.getLogin().getUname(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
