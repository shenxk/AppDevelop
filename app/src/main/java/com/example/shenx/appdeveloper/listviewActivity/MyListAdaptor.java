package com.example.shenx.appdeveloper.listviewActivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.shenx.appdeveloper.R;

public class MyListAdaptor extends BaseAdapter {


    private Context mContext;
    private LayoutInflater mLayoutInflater;
    public MyListAdaptor(Context context){
        this.mContext=context;
        mLayoutInflater=LayoutInflater.from(mContext);
    }
    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static class ViewHolder{
        public ImageView img;
        public TextView item_title,item_time,item_content;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder=null;
        if (convertView==null){
            convertView=mLayoutInflater.inflate(R.layout.list_item_listview,null);
            holder=new ViewHolder();
            holder.img=convertView.findViewById(R.id.iv_1);
            holder.item_title=convertView.findViewById(R.id.tv_title);
            holder.item_time=convertView.findViewById(R.id.tv_time);
            holder.item_content=convertView.findViewById(R.id.tv_content);
            convertView.setTag(holder);
        }else {
            holder=(ViewHolder) convertView.getTag();
        }
        holder.item_title.setText("这是标题");
        holder.item_time.setText("2018-09-01");
        holder.item_content.setText("这里可以写出项目详细信息");
        Glide.with(mContext).load("https://www.baidu.com/img/bd_logo1.png?where=super").into(holder.img);
        return convertView;
    }
}
