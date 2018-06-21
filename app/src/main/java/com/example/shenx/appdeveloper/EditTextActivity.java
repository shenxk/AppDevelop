package com.example.shenx.appdeveloper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EditTextActivity extends AppCompatActivity {

    public EditText username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        username=findViewById(R.id.et_1);
        username.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                Log.d("edittex前",s.toString());
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Toast.makeText(EditTextActivity.this,"用户名正在修改修改",Toast.LENGTH_SHORT).show();
                Log.d("edittex中",s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d("edittex后",s.toString());
            }
        });
    }
    public void login_click(View view){
        Toast.makeText(EditTextActivity.this,"登陆成功",Toast.LENGTH_LONG).show();
    }

}
