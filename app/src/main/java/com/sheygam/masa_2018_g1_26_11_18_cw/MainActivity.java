package com.sheygam.masa_2018_g1_26_11_18_cw;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Arrays;
import java.util.Comparator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.first_action_btn)
                .setOnClickListener(v -> {
                    Intent intent = new Intent("masa.action.first");
                    Intent intentChooser = Intent.createChooser(intent,"Choice app");
                    startActivity(intentChooser);
                });

        findViewById(R.id.second_action_btn)
                .setOnClickListener(v -> {
                    Intent intent = new Intent("masa.action.second");
                    Intent intentChooser = Intent.createChooser(intent,"Choice app");
                    startActivity(intentChooser);
                });

        findViewById(R.id.link_btn)
                .setOnClickListener(v -> {
                    Uri uri = Uri.parse("http://google.com");
                    Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                    Intent chooser = Intent.createChooser(intent,"Choice app");
                    startActivity(chooser);
                });

        findViewById(R.id.dial_btn)
                .setOnClickListener(v -> {
                    Uri uri = Uri.parse("tel:123456");
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(uri);
                    Intent chooser = Intent.createChooser(intent,"Choice app!");
                    startActivity(chooser);
                });

    }
}
