package com.r19012817.cars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewImage extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_image);

        imageView = findViewById(R.id.imageViewPlaceHolder);
        textView = findViewById(R.id.txvLabel);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String carName = extras.getString("strRes", "It didnt work");
        int imgRes = extras.getInt("imgRes", R.drawable.r34);

        imageView.setImageResource(imgRes);
        textView.setText(carName);
    }
}