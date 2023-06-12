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
        controller=new Controller(this);

        // set onClickListener
        initOnClickListener();

        //

    }
    private void initOnClickListener(){
        complexActivityBinding.bubblePic.setOnClickListener(this);
        complexActivityBinding.businessPic.setOnClickListener(this);
        complexActivityBinding.basePic.setOnClickListener(this);
        complexActivityBinding.kitePic.setOnClickListener(this);
        complexActivityBinding.voice.setOnClickListener(this);
        complexActivityBinding.change.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        int id=v.getId();
        if (id==R.id.bubble_pic){
            controller.complexNext();
        }
        else if(id==R.id.business_pic){
            controller.jumpToActivity(ComplexActivity_1.class);
        }
        else if(id==R.id.base_pic){
            controller.jumpToActivity(ComplexActivity_1.class);
        }
        else if(id==R.id.kite_pic){
            controller.jumpToActivity(ComplexActivity_1.class);
        }
        else if(id==R.id.voice){
            int audioID=getResources().getIdentifier("bubble_sound","raw", getPackageName());
            controller.playSound(audioID);
        }
        else if(id==R.id.change){
            controller.jumpToActivity(BriefActivity.class);
        }

    }
}
