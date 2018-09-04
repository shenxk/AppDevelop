package com.example.shenx.appdeveloper.HomePage;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.shenx.appdeveloper.ButtonTestActivity;
import com.example.shenx.appdeveloper.CheckBoxActivity;
import com.example.shenx.appdeveloper.EditTextActivity;
import com.example.shenx.appdeveloper.ImageViewActivity;
import com.example.shenx.appdeveloper.LinearLayout;
import com.example.shenx.appdeveloper.R;
import com.example.shenx.appdeveloper.RadioButtonActivity;
import com.example.shenx.appdeveloper.RelativeLayout;
import com.example.shenx.appdeveloper.ScrollViewTestActivity;
import com.example.shenx.appdeveloper.TextViewActivity;
import com.example.shenx.appdeveloper.gridview.GridViewActivity;
import com.example.shenx.appdeveloper.listviewActivity.ListViewActivty;


public class HomePageSelector extends AppCompatActivity {

    private ListView mLv;
    homeAdaptor im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hompage_layout);
        mLv = findViewById(R.id.List_veiw);

        im = new homeAdaptor(HomePageSelector.this);
        im.AddItem("LinearLayout", "线性布局应用主要展示控件线性布局");
        im.AddItem("RelativeLayout", "展示空间相对布局的方法与优点");
        im.AddItem("TextView", "展示文本显示的方法");
        im.AddItem("Button", "测试按钮的使用方法");
        im.AddItem("EditText登陆界面", "制作一个登陆的界面");

        im.AddItem("RadioButton", "radio button练习");

        im.AddItem("复选框CheckBox", "checkbox的练习");
        im.AddItem("ImageViewTest1", "test the imageView control");
        im.AddItem("ListviewTest", "列表视图练习");
        im.AddItem("GridView", "网格视图");
        im.AddItem("ScrollView", "滚动条....水平---||垂直");
        im.AddItem("LinearLayout", "线性布局应用主要展示控件线性布局");
        im.AddItem("LinearLayout", "线性布局应用主要展示控件线性布局");

        mLv.setAdapter(im);

        mLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = null;
                Toast.makeText(HomePageSelector.this, "点击" + im.itemTitle[position], Toast.LENGTH_SHORT).show();
                switch (im.itemTitle[position]) {
                    case "LinearLayout":
                        intent = new Intent(HomePageSelector.this, LinearLayout.class);
                        break;
                    case "RelativeLayout":
                        intent = new Intent(HomePageSelector.this, RelativeLayout.class);
                        break;
                    case "TextView":
                        intent = new Intent(HomePageSelector.this, TextViewActivity.class);
                        break;
                    case "Button":
                        intent = new Intent(HomePageSelector.this, ButtonTestActivity.class);
                        break;
                    case "EditText登陆界面":
                        intent = new Intent(HomePageSelector.this, EditTextActivity.class);
                        break;
                    case "RadioButton":
                        intent = new Intent(HomePageSelector.this, RadioButtonActivity.class);
                        break;
                    case "复选框CheckBox":
                        intent = new Intent(HomePageSelector.this, CheckBoxActivity.class);
                        break;
                    case "ImageViewTest1":
                        intent = new Intent(HomePageSelector.this, ImageViewActivity.class);
                        break;
                    case "ListviewTest":
                        intent = new Intent(HomePageSelector.this, ListViewActivty.class);
                        break;
                    case "GridView":
                        intent =new Intent(HomePageSelector.this, GridViewActivity.class);
                        break;
                    case "ScrollView":
                        intent =new Intent(HomePageSelector.this, ScrollViewTestActivity.class);
                        break;
                    case "RecyclerView1":
                    case "RecyclerView2":
                    case "RecyclerView3":
                    case "RecyclerView4":
                    case "WebView":
                    case "Toas":
                    case "AlertDialog":
                    case "自定义Dialog":
                    case "PopupWindow":
                }
                startActivity(intent);
            }
        });
    }
}
