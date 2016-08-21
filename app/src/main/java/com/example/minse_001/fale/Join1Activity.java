package com.example.minse_001.fale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Join1Activity extends AppCompatActivity {
    private ArrayList<String> mCityList = null;
    private ArrayList<String> mDistrictList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCityList = new ArrayList<String>();
        mDistrictList = new ArrayList<String>();

        mCityList.add("베이징");
        mCityList.add("청도");
        mCityList.add("홍콩");

        mDistrictList.add("1");
        mDistrictList.add("2");
        mDistrictList.add("3");




        Button nbutton = (Button)findViewById( R.id.nbutton );
        nbutton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Join1Activity.this, Join2Activity.class);
                startActivity(intent);
            }
        });
    }
}
