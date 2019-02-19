package com.hoangpham.bai6listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CustomeArrayAdapter extends ArrayAdapter<String> {
    Context context;
    int resource;
    String[] strings;

    public CustomeArrayAdapter(@NonNull Context context, int resource , String[] strings) {
        super(context, resource);
        this.context = context;
        this.resource = resource;
        this.strings = strings;

    }
    private static  class ViewHolder{
        TextView textView ;
    }

    @Override
    public int getCount() {
        return strings.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(convertView == null){
            convertView = layoutInflater.inflate(resource,parent,false);
            ViewHolder  viewHolder = new ViewHolder();
            viewHolder.textView = convertView.findViewById(R.id.ItemID);

            convertView.setTag(viewHolder);
        }

        ViewHolder viewHolder = (ViewHolder) convertView.getTag();

        viewHolder.textView.setText(strings[position]);


        return convertView;
    }
}