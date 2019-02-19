package com.hoangpham.bai4gridviewandlistview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    String[] subject = {"C/C++", "Java", "Android","IOS"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView listView = findViewById(R.id.ListView1);
        final GridView  gridView = findViewById(R.id.GridView2);
        final ToggleButton button = findViewById(R.id.mybtn);


        listView.deferNotifyDataSetChanged();
        listView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,subject));
        listView.setVisibility(View.GONE);

        gridView.deferNotifyDataSetChanged();
        gridView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,subject));
        gridView.setVisibility(View.GONE);
        button.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(!b){
                    listView.setVisibility(View.VISIBLE);
                    gridView.setVisibility(View.GONE);
                }else {
                    gridView.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.GONE);
                }
            }
        });
        

    }

}
