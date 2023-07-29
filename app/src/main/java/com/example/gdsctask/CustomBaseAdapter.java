package com.example.gdsctask;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomBaseAdapter extends BaseAdapter{
    Context context;
    String states[];
    int listImages[];

    LayoutInflater inflater;
    public CustomBaseAdapter(Context context,String [] States,int [] images){
        this.context=context;
        this.states=States;
        this.listImages=images;
        inflater = LayoutInflater.from(context);

    }
    @Override
    public int getCount() {
        return states.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.activity_custom_list_view,null);
        TextView textView = convertView.findViewById(R.id.textView);
        ImageView ivState = convertView.findViewById(R.id.ivStates);
        textView.setText(states[position]);
        ivState.setImageResource(listImages[position]);
    return convertView;
    }
}

