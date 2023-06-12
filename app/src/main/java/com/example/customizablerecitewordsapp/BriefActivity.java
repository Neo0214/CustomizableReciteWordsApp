package com.example.customizablerecitewordsapp;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.customizablerecitewordsapp.databinding.BriefActivityBinding;
import com.tools.Controller;

public class BriefActivity extends AppCompatActivity implements View.OnClickListener{
    private BriefActivityBinding briefActivityBinding;
    Controller controller;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        briefActivityBinding= BriefActivityBinding.inflate(getLayoutInflater());
        setContentView(briefActivityBinding.getRoot());
        controller=new Controller(this);

        // set onClickListener
        initOnClickListener();

        //

    }
    private void initOnClickListener(){
        briefActivityBinding.known.setOnClickListener(this);
        briefActivityBinding.unknown.setOnClickListener(this);
        briefActivityBinding.sound.setOnClickListener(this);
        briefActivityBinding.changemodel.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        int id=v.getId();
        if (id==R.id.known){
            controller.nextWord(); // 进入下一个词
        }
        else if (id==R.id.unknown){
            controller.jumpToActivity(BriefActivity_1.class);;
        }
        else if(id==R.id.sound){
            int audioID=getResources().getIdentifier("bubble_sound","raw", getPackageName());
            controller.playSound(audioID);
        }
        else if (id==R.id.changemodel){
            controller.jumpToActivity(ComplexActivity.class);
        }
    }
}
