package com.example.customizablerecitewordsapp;


import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.customizablerecitewordsapp.databinding.SettingActivityBinding;
import com.tools.Controller;

public class SettingActivity extends AppCompatActivity implements View.OnClickListener{
    private SettingActivityBinding settingActivityBinding;
    Controller controller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        settingActivityBinding= SettingActivityBinding.inflate(getLayoutInflater());
        setContentView(settingActivityBinding.getRoot());
        controller=new Controller(this);

        // set onClickListener
        initOnClickListener();
        //

    }
    private void initOnClickListener(){

    }
    @Override
    public void onClick(View v) {
        int id=v.getId();
        // do something
    }
}
