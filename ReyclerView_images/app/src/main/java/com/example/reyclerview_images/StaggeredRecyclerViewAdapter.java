package com.example.reyclerview_images;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StaggeredRecyclerViewAdapter extends RecyclerView.Adapter<StaggeredRecyclerViewAdapter.ViewHolder> {
    private static final String TAG = "RecyclerViewAdapter";
    private ArrayList<String> foodNames1 = new ArrayList<>();
    private ArrayList<String> foodDesc1 = new ArrayList<>();
    private ArrayList<String> foodIngredients1 = new ArrayList<>();
     private ArrayList<String> mImageNames=new ArrayList();
    private Context mcontext;

    public StaggeredRecyclerViewAdapter(Context mcontext,ArrayList<String> foodArray, ArrayList<String> foodDescNames, ArrayList<String> foodingredients , ArrayList<String> mImageNames1) {
        this.foodNames1 = foodArray;
        this.foodDesc1 = foodDescNames;
        this.foodIngredients1 = foodingredients;
        this.mImageNames = mImageNames1;
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called");

        holder.recipeText.setText(foodNames1.get(position));
        holder.recipeDesc.setText(foodDesc1.get(position));

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mcontext,foodRecipe.class);
                intent.putExtra("image_key",mImageNames.get(position));
                intent.putExtra("message_key", foodIngredients1.get(position));
                mcontext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return foodNames1.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView recipeText;
        TextView recipeDesc;
        CardView cardView;
        LinearLayout parentLayout;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            recipeText = itemView.findViewById(R.id.recipename);
            recipeDesc = itemView.findViewById(R.id.recipedesc);
            parentLayout = itemView.findViewById(R.id.parent_layout);
            cardView = itemView.findViewById(R.id.cardview);
        }
    }

}
