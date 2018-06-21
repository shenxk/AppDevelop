package com.example.shenx.appdeveloper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {

    private ImageView imv1,imv2,imv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        imv1=findViewById(R.id.imv_1);
        imv2=findViewById(R.id.imv_2);
        imv3=findViewById(R.id.imv_3);
        Glide.with(this).load("https://www.baidu.com/img/bd_logo1.png?where=super").into(imv1);
        Glide.with(this).load("https://www.baidu.com/img/bd_logo1.png?where=super").into(imv2);
        Glide.with(this).load("https://www.baidu.com/img/bd_logo1.png?where=super").into(imv3);
    }

}
