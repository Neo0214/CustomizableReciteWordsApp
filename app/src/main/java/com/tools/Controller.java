package com.tools;


import android.content.Context;
import android.content.Intent;

import androidx.viewbinding.ViewBinding;


public class Controller<T extends ViewBinding> {
    private T myView;

    public Controller(T _myView) {
        myView = _myView;
    }
    public void jumpToActivity(Context context, Class targetClass) {
        Intent intent=new Intent(context,targetClass);
        context.startActivity(intent);
    }
}
