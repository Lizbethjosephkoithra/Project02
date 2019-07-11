package com.myapplicationdev.project02;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    Button fresh, meat , diary , bakery , frozen , beverages , alcohol , health ;
    String[] catFresh = {"Vegetables", "Fruits"};
    String[] catMeat = {"Seafood", "Meat" , "FishBalls & Fishcakes" , "Marinated Meat"};
    //String[] catDiary = {"Milk & Egg", "Yoghurt & Fresh Cream" , "Spreads & Cheese" , "Ice Cream & Desserts" ,"Milk Powders"};
    //String[] catBakery = {"Cakes & Pies", "Bread & Wraps" , "Pastries"};
    //String[] catFrozen = {"Forzen Meat", "Frozen Seafood" , "Pizzas & Desserts"};
    //String[] catBeverges = {"Soft Drinks", "Iced Tea & Coffee" , "Water" , "Hot"};
    //String[] catAlcohols = {"Wines", "Beer" , "Whisky" , "Spirits" , "Cider"};
    //String[] catHealth = {"First Aid", "Vitamins" , "Medicine" , "Sports Nutrition"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        fresh = (Button) findViewById(R.id.fresh);
        meat = (Button) findViewById(R.id.meatandseafood);
        diary = (Button) findViewById(R.id.diarychill);
        bakery = (Button) findViewById(R.id.bakery);
        frozen = (Button) findViewById(R.id.frozen);
        beverages = (Button) findViewById(R.id.beverages);
        alcohol = (Button) findViewById(R.id.alcohols);
        health = (Button) findViewById(R.id.healthbeauty);


        fresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder freshBox = new AlertDialog.Builder(Main3Activity.this);
                freshBox.setTitle("Choose a Category");
                freshBox.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                freshBox.setItems(catFresh, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if ("Vegetables".equals(catFresh[i])){
                            Intent one = new Intent(Main3Activity.this, Main4Activity.class);
                            startActivity(one);
                        }
                        else if ("Fruits".equals(catFresh[i])){
                            Intent two = new Intent(Main3Activity.this, Main6Activity.class);
                            startActivity(two);
                        }
                    }
                });
                freshBox.show();
            }
        });

        meat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder meatBox = new AlertDialog.Builder(Main3Activity.this);
                meatBox.setTitle("Choose a Category");
                meatBox.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

                meatBox.setItems(catMeat, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        if ("Seafood".equals(catMeat[i])){
                            Toast.makeText(getApplicationContext(),"Selected: Seafood", Toast.LENGTH_LONG).show();
                        }

                        else if ("Meat".equals(catMeat[i])){
                            Toast.makeText(getApplicationContext(),"Selected: Meat", Toast.LENGTH_LONG).show();
                        }
                    }
                });

                meatBox.show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_cart) {
            Intent i = new Intent(Main3Activity.this,Main9Activity.class);
            startActivity(i);

            Toast.makeText(Main3Activity.this, "Action clicked", Toast.LENGTH_LONG).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
