package com.example.shenx.appdeveloper.HomePage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.shenx.appdeveloper.R;

import org.w3c.dom.Text;

public class homeAdaptor extends BaseAdapter {
    @Override
    public int getCount() {
        return itemNum;
    }
    private Context mContext;
    private LayoutInflater mLayoutInflater;
    public homeAdaptor(Context context){
        this.mContext=context;
        mLayoutInflater=LayoutInflater.from(context);
    }
    @Override
    public Object getItem(int position) {
        return null;
    }

    private int itemNum;
    public String[] itemTitle;
    private String[] itemIfo;
    public void AddItem(String title ,String info){
        itemNum++;

        String[] oldTitle=itemTitle;
        itemTitle=new  String[itemNum];
        String[] oldinfo=itemIfo;
        itemIfo=new String[itemNum];
        for (int i=0;i<itemNum-1;i++){
            itemTitle[i]=oldTitle[i];
            itemIfo[i]=oldinfo[i];
        }
        itemTitle[itemNum-1]=title;
        itemIfo[itemNum-1]=info;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static class ViewHolder{
        public TextView Title,Info;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        //convertView=mLayoutInflater.inflate(R.layout.activity_text_view,null);
        convertView=mLayoutInflater.inflate(R.layout.homepage_item,null);
        holder=new ViewHolder();
        holder.Title=convertView.findViewById(R.id.title);
        holder.Info=convertView.findViewById(R.id.info);
        holder.Title.setText(itemTitle[position]);
        holder.Info.setText(itemIfo[position]);
        return convertView;
    }
}
