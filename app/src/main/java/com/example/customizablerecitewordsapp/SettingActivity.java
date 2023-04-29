package com.example.customizablerecitewordsapp;


import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.customizablerecitewordsapp.databinding.BriefActivityBinding;
import com.example.customizablerecitewordsapp.databinding.SettingActivityBinding;
import com.tools.Controller;

public class SettingActivity extends AppCompatActivity implements View.OnClickListener{
    private SettingActivityBinding settingActivityBinding;
    Controller controller;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        settingActivityBinding= SettingActivityBinding.inflate(getLayoutInflater());
        setContentView(settingActivityBinding.getRoot());
        controller=new Controller(settingActivityBinding);

        // set onClickListener

        //

    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        // do something
    }
}
