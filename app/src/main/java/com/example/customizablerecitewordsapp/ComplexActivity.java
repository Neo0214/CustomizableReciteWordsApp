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

    }
    @Override
    public void onClick(View v) {
        int id=v.getId();
        if (id==R.id.bubble_pic){
            controller.complexNext();

        }


    }
}
