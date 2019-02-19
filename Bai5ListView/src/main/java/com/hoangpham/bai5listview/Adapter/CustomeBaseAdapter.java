package com.hoangpham.bai5listview.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.hoangpham.bai5listview.R;

import java.util.List;

public class CustomeBaseAdapter extends BaseAdapter {
    Context context;
    List<String> List;
    int Res ;
    public CustomeBaseAdapter(Context context , int layoutRes , List<String> List){

        this.context = context;
        this.List = List;
        this.Res = layoutRes;


    }

    public  static  class ViewHolder{
        TextView textView ;

    }

    @Override
    public int getCount() {
        return List.size();
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View item = view ;

        if(item ==null){
            item =  layoutInflater.inflate(Res,viewGroup,false );
            ViewHolder viewHolder = new ViewHolder();

            viewHolder.textView = item.findViewById(R.id.TvProvince);
            // save view to viewholder
            item.setTag(viewHolder);
        }

        ViewHolder viewHolder = (ViewHolder) item.getTag();
        viewHolder.textView.setText(List.get(i).toString());




        return item;
    }
}
