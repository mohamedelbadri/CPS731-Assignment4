package com.example.reyclerview_images;

import android.content.Context;
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
    private String[] foodNames1 = new String[6];
    private String[] foodDesc1 = new String[6];
    private Context mcontext;
    //    ImageView pic;
    TextView name;
    TextView desc;

    public StaggeredRecyclerViewAdapter(Context mcontext, String[] foodArray, String[] foodDescNames) {
        this.foodNames1 = foodArray;
        this.foodDesc1 = foodDescNames;
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
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: called");
        //pic= new ImageView(mcontext);
//        name= new TextView(mcontext);
//        desc= new TextView(mcontext);
//        name.setText(foodNames1[position]);
//        desc.setText(foodDesc1[position]);
        //pic.setImageResource(Animals[position]);
//        holder.image.setScaleType(ImageView.ScaleType.FIT_XY);
        holder.recipeText.setText(foodNames1[position]);
        holder.recipeDesc.setText(foodDesc1[position]);
//        holder.image.setImageResource(Animals[position]);
    }

    @Override
    public int getItemCount() {
        return foodNames1.length;
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
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(mcontext,"clicked",Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

}