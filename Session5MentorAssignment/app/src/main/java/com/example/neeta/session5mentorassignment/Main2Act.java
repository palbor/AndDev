package com.example.neeta.session5mentorassignment;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Act extends AppCompatActivity{


    final Intent intent1=new Intent();
    Button buttonsearch;
    Button buttoncall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView txtview=(TextView) findViewById(R.id.txtview);
        Intent intent=getIntent();
        String name= intent.getStringExtra("mentor_name");
        txtview.setText(name);

    }

}
