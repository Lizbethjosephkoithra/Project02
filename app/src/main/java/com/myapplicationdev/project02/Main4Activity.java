package com.myapplicationdev.project02;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Main4Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    ImageButton tomato;
    ImageButton tomatoAdd;
    Toolbar cartIcon;
    Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        //cartIcon = (Toolbar) findViewById(R.id.my_toolbar);
//        setSupportActionBar(cartIcon);

        tomato = (ImageButton) findViewById(R.id.imageButtonTomato);
        tomatoAdd = findViewById(R.id.imageButtonadd1);
        spinner1 = findViewById(R.id.spinner1);

        tomato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main4Activity.this,Main5Activity.class);
                startActivity(i);
            }
        });

        tomatoAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast=Toast.makeText(getApplicationContext(),"Added to Cart",Toast.LENGTH_SHORT);
                toast.show();

            }
        });


        spinner1.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
        List<String> spinnerNo = new ArrayList<String>();
        spinnerNo.add("Expedia: $5.00");
        spinnerNo.add("Redmart: $7.00");
        spinnerNo.add("honestbee: $8.90");
        spinnerNo.add("Pushcart: $7.20");
        spinnerNo.add("FairPrice: $6.85");

        ArrayAdapter<String> price = new ArrayAdapter<String>
                (this,android.R.layout.simple_spinner_item,spinnerNo);
        price.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(price);



    }
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        String item = parent.getItemAtPosition(position).toString();

        Toast toast1 = Toast.makeText(parent.getContext(), item + " selected", Toast.LENGTH_LONG);
        toast1.show();

    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_cart) {
            Intent i = new Intent(Main4Activity.this,Main9Activity.class);
            startActivity(i);
            return true;
        }

        else if (id == R.id.action_back) {
            Intent i = new Intent(Main4Activity.this,Main3Activity.class);
            startActivity(i);
            return true;
        }

        else if (id == R.id.action_home) {
            Intent i = new Intent(Main4Activity.this,Main3Activity.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
