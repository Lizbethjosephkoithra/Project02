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

public class Main9Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Button checkout;
    Spinner amount;
    TextView subtotal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

//        amount = findViewById(R.id.spinneramount);
        checkout=findViewById(R.id.buttonCheckout);
        subtotal = findViewById(R.id.TextViewSubtotal);

//        amount.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
//        List<String> count = new ArrayList<String>();
//        count.add("1");
//        count.add("2");
//        count.add("3");
//        count.add("4");
//        count.add("5");
//        count.add("6");
//        count.add("7");
//        count.add("8");
//        count.add("9");
//        count.add("10");
//
//        ArrayAdapter<String> adapterno = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,count);
//        adapterno.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        amount.setAdapter(adapterno);


        checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main9Activity.this, Main7Activity.class);
                startActivity(i);
            }

        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String number = parent.getItemAtPosition(position).toString();
       subtotal.setText("$19.50");
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

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
            Toast toast=Toast.makeText(getApplicationContext(),"This is the cart page",Toast.LENGTH_SHORT);
            toast.show();
            return true;
        }

        //change the second part of the toast as per the the app flow
        else if (id == R.id.action_back) {
            Intent i = new Intent(Main9Activity.this,Main4Activity.class);
            startActivity(i);
            return true;
        }

        else if (id == R.id.action_home) {
            Intent i = new Intent(Main9Activity.this,Main3Activity.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
