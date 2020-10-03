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
    // private ArrayList<String> mImageNames2=new ArrayList();
//    private Integer[] Animals= new Integer[6];
//    private String[] foodNames1 = new String[6];
//    private String[] foodDesc1 = new String[6];
    private ArrayList<String> foodNames1 = new ArrayList<>();
    private ArrayList<String> foodDesc1 = new ArrayList<>();
    private ArrayList<String> foodIngredients1 = new ArrayList<>();
    private Context mcontext;
    //    ImageView pic;
    TextView name;
    TextView desc;

    public StaggeredRecyclerViewAdapter(Context mcontext,ArrayList<String> foodArray, ArrayList<String> foodDescNames, ArrayList<String> foodingredients) {
        this.foodNames1 = foodArray;
        this.foodDesc1 = foodDescNames;
        this.foodIngredients1 = foodingredients;
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
        //pic= new ImageView(mcontext);
//        name= new TextView(mcontext);
//        desc= new TextView(mcontext);
//        name.setText(foodNames1[position]);
//        desc.setText(foodDesc1[position]);
        //pic.setImageResource(Animals[position]);
//        holder.image.setScaleType(ImageView.ScaleType.FIT_XY);


        holder.recipeText.setText(foodNames1.get(position));
        holder.recipeDesc.setText(foodDesc1.get(position));

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mcontext, "hello", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(mcontext,foodRecipe.class);
                intent.putExtra("message_key", foodIngredients1.get(position));
                mcontext.startActivity(intent);
            }
        });
//        holder.image.setImageResource(Animals[position]);
    }

    @Override
    public int getItemCount() {
        return foodNames1.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView recipeText;
        TextView recipeDesc;
        CardView cardView;
        LinearLayout parentLayour;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            recipeText = itemView.findViewById(R.id.recipename);
            recipeDesc = itemView.findViewById(R.id.recipedesc);
            parentLayour = itemView.findViewById(R.id.parent_layout);
            cardView = itemView.findViewById(R.id.cardview);
        }
    }

}
