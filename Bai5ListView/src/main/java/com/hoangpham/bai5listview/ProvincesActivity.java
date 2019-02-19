package com.hoangpham.bai5listview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ProvincesActivity extends Activity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.provincesactivity);

        Intent intent = getIntent();
        String name = intent.getExtras().get("province").toString();

        TextView textView = findViewById( R.id.Provinces);
        textView.setText(name);

    }
}
