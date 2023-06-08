package com.tools;


import android.app.Activity;
import android.content.Intent;
import android.widget.TextView;


import com.example.customizablerecitewordsapp.BriefActivity;
import com.example.customizablerecitewordsapp.ComplexActivity;

import org.w3c.dom.Text;


public class Controller {
    private final Activity activity;
    private final AudioHandler audioHandler;
    private int curWord;
    public String vocabulary[]={"bubble","universe","clone"};
    public  String sentence[]={"The children like to have bubbles in their bath.",
    "In every other universe Gwen Stacy falls for Spider Man.",
    "The strong technology we have is clone."};
    public Controller(Activity curActivity) {
        activity=curActivity;
        audioHandler=new AudioHandler();
        curWord=0;
    }
    public void jumpToActivity(Class targetClass) {
       Intent intent=new Intent(activity,targetClass);
       activity.startActivity(intent);
       if (((activity instanceof BriefActivity) && (targetClass.equals(ComplexActivity.class)))
               || ((activity instanceof ComplexActivity) && (targetClass.equals(BriefActivity.class)))){
           activity.finish();
       }

    }
    public void playNextAudio(){
        audioHandler.playNextAudio(activity);
    }

    public void nextWord(){
        curWord++; // next word
        setTextViewText("words",vocabulary[curWord]);
        setTextViewText("numbers",String.valueOf(curWord));
    }

    public void showSentence()
    {
        int id=activity.getResources().getIdentifier("sss","id",activity.getPackageName());
        TextView textView=activity.findViewById(id);
        textView.setText(sentence[curWord]);
    }

    /* parameter：组件名，新内容 */
    public void setTextViewText(String viewName, String text) {
        int id = activity.getResources().getIdentifier(viewName, "id", activity.getPackageName()); // 通过控件名获取控件的资源ID
        TextView textView = activity.findViewById(id); // 通过资源ID获取控件对象
        textView.setText(text); // 更新控件的文本内容
    }

}
