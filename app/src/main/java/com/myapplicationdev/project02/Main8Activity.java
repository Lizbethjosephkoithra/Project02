package com.myapplicationdev.project02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main8Activity extends AppCompatActivity {

    Button register;
    EditText firstname;
    EditText lastname;
    EditText email;
    EditText pass;
    EditText verifyPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        register = findViewById(R.id.buttonRegister);
        firstname = findViewById(R.id.editTextFirstname);
        lastname = findViewById(R.id.editTextLastname);
        email = findViewById(R.id.editTextEmail);
        pass = findViewById(R.id.editTextPass);
        verifyPass = findViewById(R.id.editTextVerifyPass);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (firstname.getText().toString().equals("") || lastname.getText().toString().equals("") ||
                        email.getText().toString().equals("") || pass.getText().toString().equals("") ||
                        verifyPass.getText().toString().equals("")) {
                    Toast.makeText(Main8Activity.this, "Please fill out every fields.",Toast.LENGTH_LONG).show();

                }
                else{
                    if (email.getText().toString().equals("eli@gmail.com") && pass.getText().toString().equals("***") &&
                            verifyPass.getText().toString().equals("***")) {

                        Intent i = new Intent(Main8Activity.this, Main7Activity.class);
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
            Intent i = new Intent(Main8Activity.this,Main9Activity.class);
            startActivity(i);
            return true;
        }

        //change the second part of the toast as per the the app flow
        else if (id == R.id.action_back) {
            Intent i = new Intent(Main8Activity.this,Main7Activity.class);
            startActivity(i);
            return true;
        }

        else if (id == R.id.action_home) {
            Intent i = new Intent(Main8Activity.this,Main3Activity.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
