package com.hoangpham.bai6listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    String[] name = {"Ha noi","Ha nam ", "Ha tinh", "Nghe An" , "Quang Binh", "Quang Tri" , "Hue ","Da Nang" , "Quang Nam" , "Quang Ngai"
            ,"Ho Chi Minh"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.MylistView);

        CustomeArrayAdapter customeArrayAdapter = new CustomeArrayAdapter(this,R.layout.custom_listview_layout,name);

        listView.deferNotifyDataSetChanged();
        listView.setAdapter(customeArrayAdapter);
        listView.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String result = "";
        for(int j =0 ; j<=i ;j++){
            result += name[j];
            if(j<i){
                result += "-";
            }
        }
        Intent intent = new Intent(this, ProvincesActivity.class);
         intent.putExtra("result" , result);
         startActivity(intent);
    }
}
