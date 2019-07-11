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
import android.widget.EditText;
import android.widget.Toast;

public class Main10Activity extends AppCompatActivity {

    EditText date;
    EditText time;
    Button payment;
    EditText unit;
    EditText floor;
    EditText postal;
    EditText num;

    String[] dates = {"11th January 2019, Monday", "12th January 2019, Tuesday" , "13th January 2019, Wednesday" ,
            "14th January 2019, Thursday" , "15th January 2019, Friday" , "16th January 2019, Saturday" ,
            "17th January 2019, Sunday"  , "18th January 2019, Monday" , "19th January 2019, Tuesday" ,
            "20th January 2019, Wednesday"};

    String[] timing = {"12:00pm - 02:00pm", "02:00pm - 04:00pm" , "04:00pm - 06:00pm" , "06:00pm  - 08:00pm" ,
            "08:00pm - 10:00pm" , "10:00pm - 12:00am"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        date = findViewById(R.id.editTextDate);
        time = findViewById(R.id.editTextTime);
        payment = findViewById(R.id.buttonPayment);
        unit = findViewById(R.id.editTextUnit);
        floor = findViewById(R.id.editTextFloor);
        postal = findViewById(R.id.editTextPostal);
        num = findViewById(R.id.editTextNum);

        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dateBox = new AlertDialog.Builder(Main10Activity.this);
                dateBox.setTitle("Choose a Date");
                dateBox.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                dateBox.setItems(dates, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if ("11th January 2019, Monday".equals(dates[i])){
                            date.setText("11th January 2019, Monday");
                        }

                    }
                });
                dateBox.show();
            }
        });

        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder timeBox = new AlertDialog.Builder(Main10Activity.this);
                timeBox.setTitle("Choose a Time");
                timeBox.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                timeBox.setItems(timing, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if ("12:00pm - 02:00pm".equals(timing[i])){
                            time.setText("12:00pm - 02:00pm");
                        }

                    }
                });
                timeBox.show();
            }
        });

        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (unit.getText().toString().equals("") || floor.getText().toString().equals("") ||
                        postal.getText().toString().equals("") || date.getText().toString().equals("") ||
                        time.getText().toString().equals("") || num.getText().toString().equals("")) {
                    Toast.makeText(Main10Activity.this, "Please fill out every fields.",Toast.LENGTH_LONG).show();

                }
                else{
                    if (unit.getText().toString().equals("314") || floor.getText().toString().equals("08") ||
                            postal.getText().toString().equals("730129") || num.getText().toString().equals("83531646")) {
                        Intent i = new Intent(Main10Activity.this, Main11Activity.class);
                        startActivity(i);

                    }

                }

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
            Intent i = new Intent(Main10Activity.this,Main6Activity.class);
            startActivity(i);
            return true;
        }

        //change the second part of the toast as per the the app flow
        else if (id == R.id.action_back) {
            Intent i = new Intent(Main10Activity.this,Main7Activity.class);
            startActivity(i);
            return true;
        }

        else if (id == R.id.action_home) {
            Intent i = new Intent(Main10Activity.this,Main3Activity.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
