package com.example.customizablerecitewordsapp;

import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;

import com.example.customizablerecitewordsapp.databinding.BriefActivityBinding;
import com.example.customizablerecitewordsapp.databinding.ComplexActivityBinding;
import com.tools.Controller;

public class ComplexActivity extends AppCompatActivity implements View.OnClickListener{
    private ComplexActivityBinding complexActivityBinding;
    Controller controller;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        complexActivityBinding= ComplexActivityBinding.inflate(getLayoutInflater());
        setContentView(complexActivityBinding.getRoot());
        controller=new Controller(complexActivityBinding);

        // set onClickListener
        complexActivityBinding.known.setOnClickListener(this);
        complexActivityBinding.unknown.setOnClickListener(this);
        complexActivityBinding.gotoBrief.setOnClickListener(this);
        //

    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        if (id==R.id.known){
            // call controller to do something
        }
        else if (id==R.id.unknown){
            //
        }
        else if (id==R.id.gotoBrief){
            controller.jumpToActivity(this, BriefActivity.class);
        }
    }
}
