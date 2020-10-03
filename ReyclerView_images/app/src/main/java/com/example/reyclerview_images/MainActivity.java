package com.example.reyclerview_images;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private static final int NUM_COLUMS = 2;

    private String[] foodNames = new String[]{"Pizza", "Burger", "Shawerma", "Egg n cheese", "Hot dog sandwich", "Turkey breasts"};
    private String[] foodDesc = new String[]{" dish of Italian origin consisting of a flattened disk of bread dough topped with some combination of olive oil, oregano, tomato, olives, mozzarella or other cheese, and many other ingredients",
            "A hamburger (also burger for short) is a sandwich consisting of one or more cooked patties of ground meat, usually beef, placed inside a sliced bread roll or bun. The patty may be pan fried, grilled, smoked or flame broiled.",
            "(in Middle Eastern cuisine) roasted meat, as lamb or beef, cooked on a spit. a dish consisting of this meat, served wrapped in pita bread with tahini or hummus.",
            "Make the best scrambled eggs you've ever had with our quick & easy but simple to follow recipe - so good you'll never look elsewhere again!",
            "a grilled or steamed food where a sausage is served in the slit of a partially sliced bun. It can also refer to the sausage itself.",
            "The turkey breast is all white meat, very low in fat, and high in protein. It is available fresh, frozen, fully cooked, skinned, skinless, bone-in, boneless, whole, halved, and filleted."};

    //private ArrayList<String> mImagesURls = new ArrayList();
//    Integer[] Animals = {R.drawable.eagle, R.drawable.elephant, R.drawable.gorilla, R.drawable.panda, R.drawable.panther, R.drawable.polar};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView Rv=findViewById(R.id.recyclerview);
        StaggeredRecyclerViewAdapter staggeredRecyclerViewAdapter= new StaggeredRecyclerViewAdapter(this,foodNames,foodDesc);
        StaggeredGridLayoutManager staggeredGridLayoutManager= new StaggeredGridLayoutManager(1,LinearLayoutManager.VERTICAL);
        Rv.setLayoutManager(staggeredGridLayoutManager);
        Rv.setAdapter(staggeredRecyclerViewAdapter);
    }

}