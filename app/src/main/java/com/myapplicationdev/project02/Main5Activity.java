package com.myapplicationdev.project02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Main5Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner no;
    Button addCart;
    TextView cost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

     //   kg = (Spinner)findViewById(R.id.spinnerno);
        no = (Spinner) findViewById(R.id.spinnerno);
        addCart = (Button) findViewById(R.id.buttonCart);
        cost = findViewById(R.id.textViewCost);

     //   kg.setOnItemSelectedListener(this);
      //  List<String> catKg = new ArrayList<String>();
      //  catKg.add("0.5 kg");
     //   catKg.add("1 kg");
      //  catKg.add("1.5 kg");
      //  catKg.add("2 kg");
      //  catKg.add("2.5 kg");
      //  catKg.add("3 kg");
     //   ArrayAdapter<String> adapterkg = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,catKg);
     //   adapterkg.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
      //  kg.setAdapter(adapterkg);

        no.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
        List<String> catNo = new ArrayList<String>();
        catNo.add("1 nos");
        catNo.add("2 nos");
        catNo.add("3 nos");
        catNo.add("4 nos");
        catNo.add("5 nos");
        catNo.add("6 nos");
        ArrayAdapter<String> adapterno = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,catNo);
        adapterno.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        no.setAdapter(adapterno);


        addCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast=Toast.makeText(getApplicationContext(),"Added to Cart",Toast.LENGTH_SHORT);
                toast.show();
            }

        });

    }
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        String item = parent.getItemAtPosition(position).toString();
        Toast toast1 = Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG);
                toast1.show();
        Toast toast2 = Toast.makeText(parent.getContext(), "Price: $19.50  ;  " + item, Toast.LENGTH_LONG);
                toast2.show();

    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.action_cart) {
            Intent i = new Intent(Main5Activity.this,Main9Activity.class);
            startActivity(i);
            return true;
        }

        //change the second part of the toast as per the the app flow
        else if (id == R.id.action_back) {
            Intent i = new Intent(Main5Activity.this,Main4Activity.class);
            startActivity(i);
            return true;
        }

        else if (id == R.id.action_home) {
            Intent i = new Intent(Main5Activity.this,Main3Activity.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
