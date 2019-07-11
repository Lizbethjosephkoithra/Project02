package com.myapplicationdev.project02;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main6Activity extends AppCompatActivity {

    String[] cartItems = {"Onion", "Carrot", "Cabbage", "Brinjal", "Broccoli", "Potato", "Tomato", "Peas"};
    List<String> arr;
    Integer[] imgid={
            R.drawable.onions,
            R.drawable.carrot,
            R.drawable.cabbage,
            R.drawable.brinjal,
            R.drawable.broccoli,
            R.drawable.potato,
            R.drawable.tomato,
            R.drawable.peas,
    };
    ListView cartList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        final CustomCartListAdapter adapter=new CustomCartListAdapter(this, cartItems, imgid);
        arr = new ArrayList<String>(Arrays.asList(cartItems));
        cartList=(ListView)findViewById(R.id.cart_list);
        cartList.setAdapter(adapter);

        cartList.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    final int position, long id) {
                // TODO Auto-generated method stub

                AlertDialog.Builder adb=new AlertDialog.Builder(Main6Activity.this);
                adb.setTitle("Delete?");
                adb.setMessage("Are you sure you want to delete " + cartItems[position]);
                final int removeItem = position;
                adb.setNegativeButton("No", null);
                adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        adapter.remove(String.valueOf(position));
                        adapter.notifyDataSetChanged();
                    }});
                adb.show();


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
            Toast toast=Toast.makeText(getApplicationContext(),"This is the cart page",Toast.LENGTH_SHORT);
            toast.show();
            return true;
        }

        //change the second part of the toast as per the the app flow
        else if (id == R.id.action_back) {
            Intent i = new Intent(Main6Activity.this,Main3Activity.class);
            startActivity(i);
            return true;
        }

        else if (id == R.id.action_home) {
            Intent i = new Intent(Main6Activity.this,Main3Activity.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

