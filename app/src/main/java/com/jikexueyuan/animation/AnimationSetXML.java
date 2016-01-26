package com.jikexueyuan.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;

/**
 * XML 方式创建混合动画效果
 */
public class AnimationSetXML extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_set_xml);
        findViewById(R.id.btnAnimationXml).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //开始动画
                v.startAnimation(AnimationUtils.loadAnimation(AnimationSetXML.this,R.anim.as));
            }
        });
    }
}
