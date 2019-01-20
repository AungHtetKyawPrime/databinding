package com.example.aspire.databinding;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.aspire.databinding.databinding.ListItemBinding;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<User> {
    Context context;
    ArrayList<User> data_news;
    public ListAdapter(Context context, ArrayList<User> data){
        super(context,R.layout.list_item,data);
        this.context=context;
        this.data_news=data;

    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        ListItemBinding itemForListBinding=DataBindingUtil.inflate(layoutInflater,R.layout.list_item,parent,false);
        itemForListBinding.setUser(data_news.get(position));
        return itemForListBinding.getRoot();
    }
}
