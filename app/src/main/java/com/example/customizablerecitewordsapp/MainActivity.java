package com.example.customizablerecitewordsapp;

import com.tools.Controller;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.customizablerecitewordsapp.databinding.MainActivityBinding;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    // variable section
    MainActivityBinding mainActivityBinding; // bind main_activity
    Controller controller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // init
        super.onCreate(savedInstanceState);
        mainActivityBinding=MainActivityBinding.inflate(getLayoutInflater());
        setContentView(mainActivityBinding.getRoot());
        controller=new Controller(this);

        // set onClickListener
        initOnClickListener();

        //
    }
    private void initOnClickListener(){
        mainActivityBinding.StudySetting.setOnClickListener(this);
        mainActivityBinding.funcBrief.setOnClickListener(this);
        mainActivityBinding.funcComplex.setOnClickListener(this);
        mainActivityBinding.books.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        int id=v.getId();
        if (id==R.id.StudySetting){
            controller.jumpToActivity(SettingActivity.class);
        }
        else if (id==R.id.funcBrief){
            controller.jumpToActivity(BriefActivity.class);
        }
        else if (id==R.id.funcComplex){
            controller.jumpToActivity( ComplexActivity.class);
        }
        else if (id==R.id.books){
            controller.jumpToActivity(VocabularyBookActivity.class);
        }
    }
}