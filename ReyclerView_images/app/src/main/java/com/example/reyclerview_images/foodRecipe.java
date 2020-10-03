package com.example.reyclerview_images;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class foodRecipe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_recipe);

        TextView receiverDesc =  findViewById(R.id.textView);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");
        receiverDesc.setText(str);
    }
}