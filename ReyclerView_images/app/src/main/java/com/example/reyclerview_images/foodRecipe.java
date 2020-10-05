package com.example.reyclerview_images;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import java.time.Instant;
import com.squareup.picasso.Picasso;


public class foodRecipe extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:

                Intent intent = new Intent(foodRecipe.this, MainActivity.class);
                startActivity(intent);
                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}