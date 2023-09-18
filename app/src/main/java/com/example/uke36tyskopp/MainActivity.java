package com.example.uke36tyskopp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.os.LocaleListCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button KnappSV = (Button) findViewById(R.id.KnappSV);
        Button KnappDE = (Button) findViewById(R.id.KnappDE);

        KnappSV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LocaleListCompat appLocale = LocaleListCompat.forLanguageTags("sv-SV");
                AppCompatDelegate.setApplicationLocales(appLocale);
            }
        });


        KnappDE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LocaleListCompat appLocale = LocaleListCompat.forLanguageTags("de-DE");
                AppCompatDelegate.setApplicationLocales(appLocale);
            }
        });
    }
}