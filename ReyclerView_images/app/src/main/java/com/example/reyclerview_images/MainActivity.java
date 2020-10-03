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

    private ArrayList<String> foodNames = new ArrayList<>();
    private ArrayList<String> foodDesc = new ArrayList<>();
    private ArrayList<String> foodIngredients = new ArrayList<>();

//    private String[] foodNames = new String[]{"Pizza", "Burger", "Shawerma", "Egg n cheese", "Hot dog sandwich", "Turkey breasts"};
//    private String[] foodDesc = new String[]{" dish of Italian origin consisting of a flattened disk of bread dough topped with some combination of olive oil, oregano, tomato, olives, mozzarella or other cheese, and many other ingredients",
//            "A hamburger (also burger for short) is a sandwich consisting of one or more cooked patties of ground meat, usually beef, placed inside a sliced bread roll or bun. The patty may be pan fried, grilled, smoked or flame broiled.",
//            "(in Middle Eastern cuisine) roasted meat, as lamb or beef, cooked on a spit. a dish consisting of this meat, served wrapped in pita bread with tahini or hummus.",
//            "Make the best scrambled eggs you've ever had with our quick & easy but simple to follow recipe - so good you'll never look elsewhere again!",
//            "a grilled or steamed food where a sausage is served in the slit of a partially sliced bun. It can also refer to the sausage itself.",
//            "The turkey breast is all white meat, very low in fat, and high in protein. It is available fresh, frozen, fully cooked, skinned, skinless, bone-in, boneless, whole, halved, and filleted."};

    //private ArrayList<String> mImagesURls = new ArrayList();
//    Integer[] Animals = {R.drawable.eagle, R.drawable.elephant, R.drawable.gorilla, R.drawable.panda, R.drawable.panther, R.drawable.polar};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getData();
        RecyclerView Rv=findViewById(R.id.recyclerview);
        StaggeredRecyclerViewAdapter staggeredRecyclerViewAdapter= new StaggeredRecyclerViewAdapter(this,foodNames,foodDesc,foodIngredients);
        StaggeredGridLayoutManager staggeredGridLayoutManager= new StaggeredGridLayoutManager(1,LinearLayoutManager.VERTICAL);
        Rv.setLayoutManager(staggeredGridLayoutManager);
        Rv.setAdapter(staggeredRecyclerViewAdapter);
    }


    private void getData(){
//        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

//        mImageUrls.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        foodNames.add("Pizza");
        foodDesc.add("dish of Italian origin consisting of a flattened disk of bread dough topped with some combination of olive oil, oregano, tomato, olives, mozzarella or other cheese, and many other ingredients");
        foodIngredients.add("INGREDIENTS\n" +
                "Pizza Dough: Makes enough dough for two 10-12 inch pizzas\n" +
                "\n" +
                "1 1/2 cups (355 ml) warm water (105°F-115°F)\n" +
                "1 package (2 1/4 teaspoons) of active dry yeast\n" +
                "3 3/4 cups (490 g) bread flour\n" +
                "2 tablespoons extra virgin olive oil (omit if cooking pizza in a wood-fired pizza oven)\n" +
                "2 teaspoons salt\n" +
                "1 teaspoon sugar\n" +
                "Pizza Ingredients\n" +
                "\n" +
                "Extra virgin olive oil\n" +
                "Cornmeal (to help slide the pizza onto the pizza stone)\n" +
                "Tomato sauce (smooth, or puréed)\n" +
                "Firm mozzarella cheese, grated\n" +
                "Fresh soft mozzarella cheese, separated into small clumps\n" +
                "Fontina cheese, grated\n" +
                "Parmesan cheese, grated\n" +
                "Feta cheese, crumbled\n" +
                "Mushrooms, very thinly sliced if raw, otherwise first sautéed\n" +
                "Bell peppers, stems and seeds removed, very thinly sliced\n" +
                "Italian pepperoncini, thinly sliced\n" +
                "Italian sausage, cooked ahead and crumbled\n" +
                "Chopped fresh basil\n" +
                "Baby arugula, tossed in a little olive oil, added as pizza comes out of the oven\n" +
                "Pesto\n" +
                "Pepperoni, thinly sliced\n" +
                "Onions, thinly sliced raw or caramelized\n" +
                "Ham, thinly sliced");

        //        mImageUrls.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        foodNames.add("Burger");
        foodDesc.add("A hamburger (also burger for short) is a sandwich consisting of one or more cooked patties of ground meat, usually beef, placed inside a sliced bread roll or bun. The patty may be pan fried, grilled, smoked or flame broiled.");
        //        mImageUrls.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        foodNames.add("Shawerma");
        foodDesc.add( "(in Middle Eastern cuisine) roasted meat, as lamb or beef, cooked on a spit. a dish consisting of this meat, served wrapped in pita bread with tahini or hummus.");
        //        mImageUrls.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        foodNames.add("Egg n cheese");
        foodDesc.add("Make the best scrambled eggs you've ever had with our quick & easy but simple to follow recipe - so good you'll never look elsewhere again!");
        //        mImageUrls.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        foodNames.add("Hot dog sandwich");
        foodDesc.add("a grilled or steamed food where a sausage is served in the slit of a partially sliced bun. It can also refer to the sausage itself.");
        //        mImageUrls.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        foodNames.add("Turkey Breasts");
        foodDesc.add( "The turkey breast is all white meat, very low in fat, and high in protein. It is available fresh, frozen, fully cooked, skinned, skinless, bone-in, boneless, whole, halved, and filleted.");


    }

}