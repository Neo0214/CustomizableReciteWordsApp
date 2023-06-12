package com.example.customizablerecitewordsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.tools.Controller;

public class BriefActivity_1 extends AppCompatActivity {

    Controller controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brief);
        controller=new Controller(this);

    }
}