package com.example.kekoilearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AdminPage extends AppCompatActivity {
     ImageView adduser;
     ImageView deluser;
     ImageView sususer;
     ImageView userinfo;
     ImageView edtaprv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_page);

        adduser =(ImageView) findViewById(R.id.adduser);
        deluser =(ImageView) findViewById(R.id.deleteuser);
        sususer =(ImageView) findViewById(R.id.sususer);
        userinfo =(ImageView) findViewById(R.id.userinfo);
        edtaprv =(ImageView) findViewById(R.id.edtapv);

        adduser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent adduserintent = new Intent(AdminPage.this,choosepage2.class);
                startActivity(adduserintent);
            }
        });

         deluser.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent deluserintent = new Intent(AdminPage.this, choosepage2.class);
                 startActivity(deluserintent);
             }
         });

         sususer.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent deluserintent = new Intent(AdminPage.this, choosepage2.class);
                 startActivity(deluserintent);
             }
         });

        userinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent userinfointent = new Intent(AdminPage.this, choosepage2.class);
                startActivity(userinfointent);
            }
        });

        edtaprv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent edtaprvintent = new Intent(AdminPage.this, choosepage2.class);
                startActivity(edtaprvintent);
            }
        });


    }
}