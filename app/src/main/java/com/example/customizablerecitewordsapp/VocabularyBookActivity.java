package com.example.customizablerecitewordsapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.customizablerecitewordsapp.databinding.ComplexActivityBinding;
import com.example.customizablerecitewordsapp.databinding.VocabularyBookActivityBinding;
import com.tools.Controller;

public class VocabularyBookActivity extends AppCompatActivity {
    private VocabularyBookActivityBinding vocabularyBookActivityBinding;
    private Controller controller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        vocabularyBookActivityBinding= VocabularyBookActivityBinding.inflate(getLayoutInflater());
        setContentView(vocabularyBookActivityBinding.getRoot());
        controller=new Controller(this);
        //
        initOnClickListener();
    }
    private void initOnClickListener(){

    }
}
