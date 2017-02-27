package com.liuhc.tools.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.liuhc.tools.DateFormatHelper;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String date = DateFormatHelper.getCurrentTime(DateFormatHelper.FORMAT_SECOND);
//        Toast.makeText(this, date, Toast.LENGTH_SHORT).show();
    }

    public void one(){

    }
    public void two(){

    }
}
