package com.hoangpham.bai5listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.hoangpham.bai5listview.Adapter.CustomeBaseAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> provinceName ;
    String[] name = {"Ha noi","Ha nam ", "Ha tinh", "Nghe An" , "Quang Binh", "Quang Tri" , "Hue ","Da Nang" , "Quang Nam" , "Quang Ngai"
            ,"Ho Chi Minh"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        provinceName = new ArrayList<String>();

        for(int i =0 ; i<name.length;i++){
            provinceName.add(name[i]);
        }
        ListView listView =findViewById(R.id.MyListView);

        CustomeBaseAdapter  customeBaseAdapter = new CustomeBaseAdapter(this, R.layout.custome_listview_layout, provinceName);
        listView.deferNotifyDataSetChanged();
        listView.setAdapter(customeBaseAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,ProvincesActivity.class);
                intent.putExtra("province",""+provinceName.get(i));
                startActivity(intent);
            }
        });




    }
}
