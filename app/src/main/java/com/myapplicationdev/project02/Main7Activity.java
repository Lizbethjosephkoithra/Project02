package com.myapplicationdev.project02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main7Activity extends AppCompatActivity {

    Button Signin;
    Button Login;
    EditText name;
    EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        Signin = findViewById(R.id.buttonSignUp);
        Login = findViewById(R.id.buttonLogin);
        name = findViewById(R.id.editTextName);
        pass = findViewById(R.id.editTextPass);

        Signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main7Activity.this, Main8Activity.class);
                startActivity(i);
            }

        });

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (name.getText().toString().equals("eli@gmail.com")) {
                    if (pass.getText().toString().equals("***")) {
                        Intent i = new Intent(Main7Activity.this, Main10Activity.class);
                        startActivity(i);
                    }
                    else{
                        Toast.makeText(Main7Activity.this, "Wrong Username or Password !!",Toast.LENGTH_LONG).show();
                        name.setText("");
                        pass.setText("");               }
                }
                else{
                    Toast.makeText(Main7Activity.this, "Wrong Username or Password !!",Toast.LENGTH_LONG).show();
                    name.setText("");
                    pass.setText("");               }

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
            Intent i = new Intent(Main7Activity.this,Main9Activity.class);
            startActivity(i);
            return true;
        }

        //change the second part of the toast as per the the app flow
        else if (id == R.id.action_back) {
            Intent i = new Intent(Main7Activity.this,Main9Activity.class);
            startActivity(i);
            return true;
        }

        else if (id == R.id.action_home) {
            Intent i = new Intent(Main7Activity.this,Main3Activity.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
