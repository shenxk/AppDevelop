package com.example.shenx.appdeveloper.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.shenx.appdeveloper.R;

public class MyGrideViewAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mLayoutInflater;
    public MyGrideViewAdapter(Context context) {
        this.mContext=context;
        mLayoutInflater=LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return 9;
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
        public TextView item_title;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder=null;
        if (convertView==null){
            convertView=mLayoutInflater.inflate(R.layout.grid_view_item,null);
            holder=new ViewHolder();
            convertView.setTag(holder);
            holder.img=convertView.findViewById(R.id.iv_grid);
            holder.item_title=convertView.findViewById(R.id.tv_title);
        }else {
            holder=(ViewHolder) convertView.getTag();
        }
        holder.item_title.setText("花");
        String url="https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=3764147609,3972781572&fm=200&gp=0.jpg";
        Glide.with(mContext).load(url).into(holder.img);

        return convertView;
    }
}
