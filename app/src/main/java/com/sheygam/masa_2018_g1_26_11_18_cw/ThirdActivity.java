package com.sheygam.masa_2018_g1_26_11_18_cw;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Intent intent = getIntent();
        String action = intent.getAction();
        Uri uri = intent.getData();
        String  str = "";
        if (uri != null){
            str = uri.toString();
        }
        Log.d("MY_TAG", "onCreate: " + action + " " + str);
    }
}
