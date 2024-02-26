package com.example.animationn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=findViewById(R.id.imgg);
    }
    public void bblink(View view){
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.blink);
        iv.startAnimation(animation);
    }
    public void bfade(View view){
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.fade);
        iv.startAnimation(animation);
    }
    public void brotate(View view){
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.rotate);
        iv.startAnimation(animation);
    }
    public void bmove(View view){
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.move);
        iv.startAnimation(animation);
    }
    public void bslide(View view){
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.slide);
        iv.startAnimation(animation);
    }
    public void bzoom(View view){
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.zoom);
        iv.startAnimation(animation);
    }

}