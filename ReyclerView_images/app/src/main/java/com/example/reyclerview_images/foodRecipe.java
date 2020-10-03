package com.example.reyclerview_images;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import java.time.Instant;
import com.squareup.picasso.Picasso;


public class foodRecipe extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_recipe);

        TextView receiverDesc =  findViewById(R.id.textView);
        ImageView imageView = findViewById(R.id.imageView);
        Intent intent = getIntent();
        String strImage = intent.getStringExtra("image_key");

        Picasso.get().load(strImage).into(imageView);
        String str = intent.getStringExtra("message_key");
        receiverDesc.setText(str);



    }
}