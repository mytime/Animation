package com.jikexueyuan.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;

/**
 * 混合动画效果
 */
public class AnimationSet extends AppCompatActivity {

    //混合动画对象
    private android.view.animation.AnimationSet as;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animation_set);

        //启用混合动画补间
        as = new android.view.animation.AnimationSet(true);
        as.setDuration(1000);

        //透明动画
        AlphaAnimation aa = new AlphaAnimation(0,1);
        aa.setDuration(1000);
        as.addAnimation(aa); //添加效果

        //移位动画(从xy点200像素位置进入)
        TranslateAnimation ta = new TranslateAnimation(200,0,200,0);
        ta.setDuration(1000);
        as.addAnimation(ta);//添加效果


        findViewById(R.id.btnAnim).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(as);
            }
        });
    }
}
