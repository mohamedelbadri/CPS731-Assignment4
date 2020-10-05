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
    private ArrayList<String> mImageUrls = new ArrayList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getData();
        RecyclerView Rv=findViewById(R.id.recyclerview);
        StaggeredRecyclerViewAdapter staggeredRecyclerViewAdapter= new StaggeredRecyclerViewAdapter(this,foodNames,foodDesc,foodIngredients,mImageUrls);
        StaggeredGridLayoutManager staggeredGridLayoutManager= new StaggeredGridLayoutManager(1,LinearLayoutManager.VERTICAL);
        Rv.setLayoutManager(staggeredGridLayoutManager);
        Rv.setAdapter(staggeredRecyclerViewAdapter);
    }


    private void getData(){

        mImageUrls.add("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a3/Eq_it-na_pizza-margherita_sep2005_sml.jpg/220px-Eq_it-na_pizza-margherita_sep2005_sml.jpg");
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
                "Ham, thinly sliced");

        mImageUrls.add("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bd/Cheeseburger_with_fries.jpg/300px-Cheeseburger_with_fries.jpg");
        foodNames.add("Burger");
        foodDesc.add("A hamburger (also burger for short) is a sandwich consisting of one or more cooked patties of ground meat, usually beef, placed inside a sliced bread roll or bun. The patty may be pan fried, grilled, smoked or flame broiled.");
        foodIngredients.add("INGREDIENTS\n" +
                "1 1/2 pounds ground beef\n" +
                "1/3 cup grated onion\n" +
                "2-4 chipotle peppers (from a can of chipotles in adobo), depending on how much chile heat you like, minced, plus 1 tablespoon of the adobo sauce\n" +
                "1 teaspoon Kosher salt\n" +
                "1 teaspoon ground cumin\n" +
                "1 teaspoon black pepper\n" +
                "6 hamburger buns\n" +
                "6 slices jack cheese\n" +
                "2 avocados, sliced\n" +
                "Chipotle hot sauce to taste (we use Tabasco brand)\n" +
                "1/3 cup chopped cilantro, for garnish\n" +
                "2 poblano chile peppers (optional)");

                mImageUrls.add("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f9/Shawarma.jpg/220px-Shawarma.jpg");
        foodNames.add("Shawerma");
        foodDesc.add( "(in Middle Eastern cuisine) roasted meat, as lamb or beef, cooked on a spit. a dish consisting of this meat, served wrapped in pita bread with tahini or hummus.");
        foodIngredients.add("Ingredients\n" +
                "2lb /1 kg chicken thigh fillets , skinless and boneless (Note 3)2lb /1 kg chicken thigh fillets , skinless and boneless (Note 3)\n" +
                "MARINADE\n" +
                "1 large garlic clove , minced (or 2 small cloves)1 large garlic clove , minced (or 2 small cloves)\n" +
                "1 tbsp ground coriander1 tbsp ground coriander\n" +
                "1 tbsp ground cumin1 tbsp ground cumin\n" +
                "1 tbsp ground cardamon1 tbsp ground cardamon\n" +
                "1 tsp ground cayenne pepper (reduce to 1/2 tsp to make it not spicy)1 tsp ground cayenne pepper (reduce to 1/2 tsp to make it not spicy)\n" +
                "2 tsp smoked paprika2 tsp smoked paprika\n" +
                "2 tsp salt2 tsp salt\n" +
                "Black pepperBlack pepper\n" +
                "2 tbsp lemon juice2 tbsp lemon juice\n" +
                "3 tbsp olive oil3 tbsp olive oil\n" +
                "YOGHURT SAUCE\n" +
                "1 cup Greek yoghurt1 cup Greek yoghurt\n" +
                "1 clove garlic , crushed1 clove garlic , crushed\n" +
                "1 tsp cumin1 tsp cumin\n" +
                "Squeeze of lemon juiceSqueeze of lemon juice\n" +
                "Salt and pepperSalt and pepper\n" +
                "TO SERVE\n" +
                "6 flatbreads (Lebanese or pita bread orhomemade soft flatbreads)6 flatbreads (Lebanese or pita bread orhomemade soft flatbreads)\n" +
                "Sliced lettuce (cos or iceberg)Sliced lettuce (cos or iceberg)\n" +
                "Tomato slicesTomato slices");

                mImageUrls.add("https://upload.wikimedia.org/wikipedia/commons/thumb/0/07/McD-Egg-McMuffin.jpg/220px-McD-Egg-McMuffin.jpg");
        foodNames.add("Egg n cheese");
        foodDesc.add("Make the best scrambled eggs you've ever had with our quick & easy but simple to follow recipe - so good you'll never look elsewhere again!");
        foodIngredients.add("Ingredients of Egg And Cheese Grilled Sandwich\n" +
                "\n" +
                "3 Servings\n" +
                "6 slices whole wheat bread\n" +
                "6 medium cheese slices\n" +
                "1/2 teaspoon salt\n" +
                "6 egg\n" +
                "1/2 teaspoon black pepper\n" +
                "2 tablespoon butter");

                mImageUrls.add("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fb/Hotdog_-_Evan_Swigart.jpg/220px-Hotdog_-_Evan_Swigart.jpg");
        foodNames.add("Hot dog sandwich");
        foodDesc.add("a grilled or steamed food where a sausage is served in the slit of a partially sliced bun. It can also refer to the sausage itself.");
        foodIngredients.add("INGREDIENTS\n" +
                "4 beef hot dogs\n" +
                "4 lettuce leaves\n" +
                "4 sliced radishes\n" +
                "4 tbsp American Garden U.S. mayonnaise\n" +
                "4 hot dog buns\n" +
                "American Garden bread and butter sweet-chips pickles\n" +
                "American Garden U.S. ketchup\n" +
                "American Garden U.S. mustard");

                mImageUrls.add("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a3/Thanksgiving_Turkey.jpg/200px-Thanksgiving_Turkey.jpg");
        foodNames.add("Turkey Breasts");
        foodDesc.add( "The turkey breast is all white meat, very low in fat, and high in protein. It is available fresh, frozen, fully cooked, skinned, skinless, bone-in, boneless, whole, halved, and filleted.");
        foodIngredients.add("Ingredients\n" +
                "2 slices whole wheat bread, toasted\n" +
                " \n" +
                "1 tablespoon mayonnaise\n" +
                " \n" +
                "2 teaspoons Dijon-style prepared mustard\n" +
                " \n" +
                "3 slices smoked turkey breast\n" +
                " \n" +
                "2 tablespoons guacamole\n" +
                " \n" +
                "½ cup mixed salad greens\n" +
                " \n" +
                "¼ cup bean sprouts\n" +
                " \n" +
                "¼ avocado - peeled, pitted and sliced\n" +
                " \n" +
                "3 ounces Colby-Monterey Jack cheese, sliced\n" +
                " \n" +
                "2 slices tomato");

    }

}