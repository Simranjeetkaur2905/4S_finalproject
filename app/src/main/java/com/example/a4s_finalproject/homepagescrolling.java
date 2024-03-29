package com.example.a4s_finalproject;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SearchView;
import android.widget.TextView;

public class homepagescrolling extends AppCompatActivity {

    LinearLayout lyt_Pizza, lyt_calzones, lyt_pasta, lyt_wings, lyt_frechfries, lyt_soda;
    TextView txt_frenchfry;
   // SearchView searchView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepagescrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();


            }
        });

        lyt_Pizza = (LinearLayout) findViewById(R.id.pizza);
       // searchView = findViewById(R.id.search);
        lyt_calzones = (LinearLayout) findViewById(R.id.calzone);
        lyt_pasta = (LinearLayout) findViewById(R.id.pasta);
        lyt_wings = (LinearLayout) findViewById(R.id.chickenwings);
        lyt_frechfries = (LinearLayout) findViewById(R.id.frechfries);
        txt_frenchfry = (TextView) findViewById(R.id.frenchfry);
        lyt_soda = (LinearLayout) findViewById(R.id.soda);

        lyt_Pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), pizzalist.class);
                startActivity(intent);
            }
        });
        lyt_calzones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), calzoneactivity.class);
                startActivity(intent);
            }
        });
        lyt_pasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), pastaactivity.class);
                startActivity(intent);
            }
        });
        lyt_wings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Bookingactivity.class);
                String text = "Wings";
                String price = "35";
                intent.putExtra("price",price);
                intent.putExtra("PIZZANAME",text);
                startActivity(intent);
            }
        });
        lyt_frechfries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = txt_frenchfry.getText().toString();
                Intent intent = new Intent(getApplicationContext(), Bookingactivity.class);

                intent.putExtra("PIZZANAME",str);
                String price = "20";
                intent.putExtra("price",price);
//                Bundle extras = new Bundle();
//
//                extras.putString("PIZZANAME", str);
//                intent.putExtras(extras);
                startActivity(intent);
            }
        });
        lyt_soda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), sodapopactivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_homepagescrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                Intent intent = new Intent(this, MainActivity.class);
                this.startActivity(intent);
                finish();
                break;
            case R.id.Aboutus:

                Intent intent1 = new Intent(getApplicationContext(), aboutus.class);
                startActivity(intent1);
                break;
            case R.id.tips:
                Intent intent2 = new Intent(getApplicationContext(), tipsandsuggestions.class);
                startActivity(intent2);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }


        return true;
    }

}




