package com.tools;


import android.app.Activity;
import android.content.Intent;
import android.widget.TextView;


import com.example.customizablerecitewordsapp.BriefActivity;
import com.example.customizablerecitewordsapp.ComplexActivity;
import com.example.customizablerecitewordsapp.R;

import org.w3c.dom.Text;
import android.widget.ImageView;

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
        audioHandler.playAudio(activity, R.raw.testaudio);
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

    public void complexNext(){
        curWord++;
        // 修改some_id
        String tmpID=String.valueOf(curWord+1)+"/10";
        int textId=activity.getResources().getIdentifier("some_id","id",activity.getPackageName());
        TextView textView=activity.findViewById(textId);
        textView.setText(tmpID);

    }

    /* 播放音频，parameter: 音频名称 */
    public void playSound(String soundName){
        int audioID=activity.getResources().getIdentifier(soundName,"id", activity.getPackageCodePath());
        audioHandler.playAudio(activity,audioID);
    }

    //修改图片资源
    public void setImage(String imageName, String imageResName) {
        int resID = activity.getResources().getIdentifier(imageResName, "drawable", activity.getPackageName());
        ImageView imageView = activity.findViewById(activity.getResources().getIdentifier(imageName, "id", activity.getPackageName()));
        imageView.setImageResource(resID);
    }
    
}
