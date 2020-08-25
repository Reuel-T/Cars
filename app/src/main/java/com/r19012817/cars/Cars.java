package com.r19012817.cars;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Cars extends AppCompatActivity implements View.OnClickListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //variables
        Button bt = findViewById(R.id.btn1);
        ImageView imvR8 = findViewById(R.id.imvR8);
        ImageView imvWRX =  findViewById(R.id.imvWRX);
        ImageView imv370Z = findViewById(R.id.imv370Z);
        ImageView imvM2c =  findViewById(R.id.imvM2);

        imvM2c.setOnClickListener(this);
        imvR8.setOnClickListener(this);
        imvWRX.setOnClickListener(this);
        imv370Z.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        switch(view.getId())
        {
            case R.id.imvM2:
                startActivity(IntentBuilder.getIntent("BMW M2 Coupe", R.drawable.m2coupe, this));
                break;

            case R.id.imvWRX:
                startActivity(IntentBuilder.getIntent("Subaru WRX STi", R.drawable.wrx, this));
                break;

            case R.id.imvR8:
                startActivity(IntentBuilder.getIntent("Audi R8 V10", R.drawable.r8, this));
                break;

            case R.id.imv370Z:
                startActivity(IntentBuilder.getIntent("Nissan 370Z (Z34)", R.drawable.r8, this));
                break;

            default:
                // code block
        }
    }
}