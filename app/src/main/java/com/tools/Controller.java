package com.tools;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import androidx.viewbinding.ViewBinding;

import com.example.customizablerecitewordsapp.BriefActivity;
import com.example.customizablerecitewordsapp.ComplexActivity;


public class Controller {
    private final Activity activity;

    public Controller(Activity curActivity) {
        activity=curActivity;
    }
    public void jumpToActivity(Class targetClass) {
       Intent intent=new Intent(activity,targetClass);
       activity.startActivity(intent);
       if (((activity instanceof BriefActivity) && (targetClass.equals(ComplexActivity.class)))
               || ((activity instanceof ComplexActivity) && (targetClass.equals(BriefActivity.class)))){
           activity.finish();
       }

    }
}
