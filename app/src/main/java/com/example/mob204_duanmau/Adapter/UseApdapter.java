package com.example.mob204_duanmau.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.mob204_duanmau.UI.InfoUser;
import com.example.mob204_duanmau.R;

import java.util.List;


public class UseApdapter extends BaseAdapter {
   List<InfoUser> infoUser;

    public UseApdapter(List<InfoUser> infoUser) {
        this.infoUser = infoUser;
    }

    @Override
    public int getCount() {
        return infoUser.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.user,parent,false);
        return convertView;
    }
}
