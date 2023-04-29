package com.example.customizablerecitewordsapp;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.customizablerecitewordsapp.databinding.BriefActivityBinding;
import com.example.customizablerecitewordsapp.databinding.MainActivityBinding;
import com.tools.Controller;

public class BriefActivity extends AppCompatActivity implements View.OnClickListener{
    private BriefActivityBinding briefActivityBinding;
    Controller controller;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        briefActivityBinding= BriefActivityBinding.inflate(getLayoutInflater());
        setContentView(briefActivityBinding.getRoot());
        controller=new Controller(briefActivityBinding);

        // set onClickListener
        briefActivityBinding.known.setOnClickListener(this);
        briefActivityBinding.unknown.setOnClickListener(this);
        briefActivityBinding.gotoComplex.setOnClickListener(this);
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
        else if (id==R.id.gotoComplex){
            controller.jumpToActivity(this, ComplexActivity.class);
        }
    }
}