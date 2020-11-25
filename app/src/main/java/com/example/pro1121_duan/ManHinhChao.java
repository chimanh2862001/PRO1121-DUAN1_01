package com.example.pro1121_duan;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class ManHinhChao extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_chao);

        imageView = findViewById(R.id.imgManHinhChao);

        setTitle("Hello World");
        Thread thread=new Thread(){
            @Override
            public void run(){
                super.run();
                int waited = 0;
                while(waited < 300){
                    try {
                        sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    waited+=100;
                }

                Intent intent=new Intent(ManHinhChao.this, DangNhap.class);

                startActivity(intent);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                finish();
            }
        };
        thread.start();
    }
}