package com.jikexueyuan.animation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.nio.charset.MalformedInputException;

/**
 * 混合动画的两种定义方式
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //混合动画
        findViewById(R.id.btnAnim).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AnimationSet.class));
            }
        });

        //xml方式混合动画
        findViewById(R.id.btnAnimXML).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,AnimationSetXML.class));
            }
        });

        //动画监听器
        findViewById(R.id.btnAnimListener).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,AnimationListener.class));
            }
        });
    }
}
