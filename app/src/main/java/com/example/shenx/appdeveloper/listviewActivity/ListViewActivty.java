package com.example.shenx.appdeveloper.listviewActivity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.shenx.appdeveloper.R;

public class ListViewActivty extends Activity {

    private ListView mLv1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        mLv1=findViewById(R.id.lv_1);
        mLv1.setAdapter(new MyListAdaptor(ListViewActivty.this));
        mLv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivty.this,"点击"+position+"项目",Toast.LENGTH_LONG).show();
            }
        });
        mLv1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivty.this,"长按第"+position+"项目",Toast.LENGTH_LONG).show();
                return true;
            }
        });


    }
}
