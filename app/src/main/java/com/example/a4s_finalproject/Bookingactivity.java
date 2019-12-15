package com.example.a4s_finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Bookingactivity extends AppCompatActivity {

    TextView txt_bookiid;

    EditText editText_name, editText_contact, editText_itemname, editText_address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookingactivity);
        txt_bookiid = (TextView) findViewById(R.id.orderid);
        editText_name = (EditText) findViewById(R.id.bname);
        editText_contact = (EditText) findViewById(R.id.bcontact);
        editText_itemname = (EditText) findViewById(R.id.bitem);
        editText_address = (EditText) findViewById(R.id.baddress);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String result = extras.getString("MESSAGE");
        //  String result = intent.getStringExtra("MESSAGE");
        txt_bookiid.setText(result);

    }

    public void Registeritem(View view) {
    }
}
