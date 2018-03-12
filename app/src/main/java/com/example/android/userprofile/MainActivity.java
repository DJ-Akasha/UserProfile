package com.example.android.userprofile;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView profile_picture = (ImageView) findViewById(R.id.profile_picture);
        profile_picture.setImageResource(R.drawable.elisa_kaprun );

        TextView name = (TextView) findViewById(R.id.name);
        name.setText("Elisa Simone");
        name.setTextSize(50);
        name.setTextColor(Color.BLUE);

        TextView birthday = (TextView) findViewById(R.id.birthday);
        birthday.setText("11 March");
        birthday.setTextSize(30);
        birthday.setTextColor(Color.RED);

        TextView country = (TextView) findViewById(R.id.country);
        country.setText("Italy");
        country.setTextSize(30);
        country.setTextColor(Color.GREEN);
    }
}
