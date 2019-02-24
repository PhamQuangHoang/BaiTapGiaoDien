package com.hoangpham.sumarytwonum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edSoA , edSoB;
    Button btnAdd1,btnAdd2;
    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edSoA = findViewById(R.id.edNumA);
        edSoB = findViewById(R.id.edNumB);
        tvResult = findViewById(R.id.tvResult);

        btnAdd1 = findViewById(R.id.btnAdd1);
        btnAdd2 = findViewById(R.id.btnAdd2);

        btnAdd2.setOnClickListener(this);
        //Anonymous Listener

        btnAdd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Sumary();
            }
        });


    }

    public  void Sumary(){
        int numA = Integer.parseInt(edSoA.getText().toString().trim());
        int numB = Integer.parseInt(edSoB.getText().toString().trim());

        int result = numA + numB;

        tvResult.setText(String.valueOf(result));
    }


    //Onclick XML
    public void SumaryTwoNumber(View v){
        Sumary();
    }

    //Activity is listener
    @Override
    public void onClick(View view) {
        Sumary();
    }
}
