package com.hoangpham.bai6listview;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ProvincesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.provinces_layout);

        TextView textView = findViewById(R.id.Result);

        Intent intent =getIntent();
        String rs = intent.getExtras().getString("result");
        textView.setText(rs);
    }
}
