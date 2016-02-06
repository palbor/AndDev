package com.example.neeta.session5mentorassignment;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button nodejs,java,cloud,frontend,marketing, buttoncall, buttonsearch, buttoncontact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nodejs=(Button) findViewById(R.id.nodejs);
        java=(Button)findViewById(R.id.java);
        cloud=(Button)findViewById(R.id.cloud);
        frontend=(Button)findViewById(R.id.frontend);
        marketing=(Button)findViewById(R.id.marketing);
        buttoncall=(Button) findViewById(R.id.buttoncall);
        buttonsearch=(Button) findViewById(R.id.buttonsearch);
        buttoncontact=(Button)findViewById(R.id.buttoncontact);
        nodejs.setOnClickListener(this);
        java.setOnClickListener(this);
        cloud.setOnClickListener(this);
        frontend.setOnClickListener(this);
        marketing.setOnClickListener(this);
        buttonsearch.setOnClickListener(this);
        buttoncall.setOnClickListener(this);
        buttoncontact.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(MainActivity.this, Main2Act.class);
        switch(v.getId())
        {
            case R.id.nodejs:  intent.putExtra("mentor_name", "Ashish");
                               break;
            case R.id.java: intent.putExtra("mentor_name", "Kalpana");
                            break;
            case R.id.cloud:intent.putExtra("mentor_name", "Aakash");
                            break;
            case R.id.frontend: intent.putExtra("mentor_name", "Karisma");
                                break;
            case R.id.marketing: intent.putExtra("mentor_name", "Karan");
                                 break;
            case R.id.buttonsearch: Intent intent1=new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("http://google.com"));
                startActivity(intent1);
                break;
            case R.id.buttoncall: Intent intent2=new Intent(Intent.ACTION_DIAL);
                intent2.setData(Uri.parse("tel:9384743765"));
                startActivity(intent2);
                break;
            case R.id.buttoncontact: Intent intent3=new Intent(Intent.ACTION_VIEW, ContactsContract.Contacts.CONTENT_URI);
                startActivity(intent3);
                break;
        }
        startActivity(intent);
    }
}
