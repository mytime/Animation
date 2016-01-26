package com.jikexueyuan.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

/**
 * //动画监听操作
 */
public class AnimationListener extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_listener);

        findViewById(R.id.AnimationListener).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //动画监听
                Animation a = AnimationUtils.loadAnimation(AnimationListener.this,R.anim.as);
                a.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        //动画结束
                        Toast.makeText(AnimationListener.this,"Animation end",
                                Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });


                //开始动画
                v.startAnimation(a);
            }
        });
    }
}
