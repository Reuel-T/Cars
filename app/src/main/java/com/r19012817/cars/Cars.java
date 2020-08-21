package com.r19012817.cars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Cars extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //variables
        Button bt = findViewById(R.id.btn1);
        ImageView imvR8 = findViewById(R.id.imvR8);
        ImageView imvWRX =  findViewById(R.id.imvWRX);
        ImageView imv370Z = findViewById(R.id.imv370Z);
        ImageView imvM2c =  findViewById(R.id.imvM2);


        bt.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(),"Trust but verify", Toast.LENGTH_LONG).show();
            }
        });

        imvR8.setOnClickListener(new ImageView.OnClickListener()
        {
            public  void onClick(View v)
            {
                Intent intent = new Intent(Cars.this, ViewImage.class);
                Bundle extras = new Bundle();
                extras.putInt("imgRes", R.drawable.r8);
                extras.putString("strRes","AUDI R8");
                intent.putExtras(extras);
                startActivity(intent);
            }
        });

        imvWRX.setOnClickListener(new ImageView.OnClickListener()
        {
            public  void onClick(View v)
            {
                Intent intent = new Intent(Cars.this, ViewImage.class);
                Bundle extras = new Bundle();
                extras.putInt("imgRes", R.drawable.wrx);
                extras.putString("strRes","SUBARU WRX STi");
                intent.putExtras(extras);
                startActivity(intent);
            }
        });

        imv370Z.setOnClickListener(new ImageView.OnClickListener()
        {
            public  void onClick(View v)
            {
                Intent intent = new Intent(Cars.this, ViewImage.class);
                Bundle extras = new Bundle();
                extras.putInt("imgRes", R.drawable.z370);
                extras.putString("strRes","NISSAN 370Z (Z34)");
                intent.putExtras(extras);
                startActivity(intent);
            }
        });

        imvM2c.setOnClickListener(new ImageView.OnClickListener()
        {
            public  void onClick(View v)
            {
                Intent intent = new Intent(Cars.this, ViewImage.class);
                Bundle extras = new Bundle();
                extras.putInt("imgRes", R.drawable.m2coupe);
                extras.putString("strRes","BMW M2 Competition");
                intent.putExtras(extras);
                startActivity(intent);
            }
        });
    }
}