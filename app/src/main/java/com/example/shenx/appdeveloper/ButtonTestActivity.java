package com.example.shenx.appdeveloper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonTestActivity extends AppCompatActivity {

    private Button mb1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_test);
        mb1=findViewById(R.id.btn_1);
        mb1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()==MotionEvent.ACTION_DOWN){
                    Toast.makeText(ButtonTestActivity.this,"这是一个普通按钮处理按下时事件",Toast.LENGTH_SHORT).show();
                }
                if (event.getAction()==MotionEvent.ACTION_UP){
                    Toast.makeText(ButtonTestActivity.this,"这是一个普通按钮处理放开按钮时的事件",Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });

    }

    public void btn1_click(View view){
        Toast.makeText(this,"这是一个普通按钮",Toast.LENGTH_SHORT).show();
    }
    public void btn2_click(View view){
        Toast.makeText(this,"这是一个用户定义了圆角的按钮",Toast.LENGTH_SHORT).show();
    }
    public void btn3_click(View view){
        Toast.makeText(this,"这个是一个带圆角描边的按钮",Toast.LENGTH_SHORT).show();
    }
    public void btn4_click(View view){
        Toast.makeText(this,"这个按钮通过btn_selector编辑了按下的状态与非按下的状态不同",Toast.LENGTH_SHORT).show();
    }
    public void View_click(View view){
        Toast.makeText(this,"view被点击",Toast.LENGTH_SHORT).show();
    }


}
