package com.example.kekoilearn;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class choosepage extends AppCompatActivity implements View.OnClickListener {

    private ImageView stddavt;
    private ImageView tchdavt;
    private ImageView prtdavt;
    private ImageView brddavt;
    private ImageView gstdavt;
    private ImageView setdavt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosepage);

       View stddavt =(ImageView) findViewById(R.id.stdavt);
        stddavt.setOnClickListener((View.OnClickListener) choosepage.this);
       View tchdavt =(ImageView) findViewById(R.id.tchavt);
       tchdavt.setOnClickListener((View.OnClickListener) choosepage.this);
        View prtdavt =(ImageView) findViewById(R.id.prtavt);
        prtdavt.setOnClickListener((View.OnClickListener) choosepage.this);
        View brddavt =(ImageView) findViewById(R.id.brdavt);
        brddavt.setOnClickListener((View.OnClickListener) choosepage.this);
        View gstdavt =(ImageView) findViewById(R.id.gstavt);
        gstdavt.setOnClickListener((View.OnClickListener) choosepage.this);
        setdavt =(ImageView) findViewById(R.id.adminavt);


        setdavt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder adBuilder = new AlertDialog.Builder(choosepage.this);
                View adview = getLayoutInflater().inflate(R.layout.dialog_login, null);
                EditText aduser = (EditText) adview.findViewById(R.id.aduser);
                final EditText adminpass = (EditText) adview.findViewById(R.id.adminpass);
                Button adlogbtn = (Button) adview.findViewById(R.id.adlogbtn);

                adlogbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(aduser.getText().toString().equals("zoldykkillua") && adminpass.getText().toString().equals("killuazoldyk")){
                            Toast. makeText(getApplicationContext(), "Welcome ADMIN", Toast. LENGTH_LONG).show();
                            Intent intentadminpg = new Intent(choosepage.this,AdminPage.class);
                            startActivity(intentadminpg);
                        }
                        else if (!aduser.getText().toString().equals("zoldykkillua") || !adminpass.getText().toString().equals("killuazoldyk")){
                            Toast. makeText(getApplicationContext(), "Wrong admin details", Toast. LENGTH_LONG).show(); }
                        else {
                            Toast. makeText(getApplicationContext(), "Enter admin Details", Toast. LENGTH_LONG).show();
                        }
                    }
                });
                adBuilder.setView(adview);
                AlertDialog dialog =adBuilder.create();
                dialog.show();

            }
        });




    }
    public void onClick(View v){
        Intent i = new Intent(choosepage.this, loginstd.class);


        switch (v.getId()) {
            case R.id.stdavt:
                i.putExtra("imagefilename", "pic1");
                break;
            case R.id.tchavt:
                i.putExtra("imagefilename","pic2");
                break;
            case R.id.prtavt:
                i.putExtra("imagefilename","pic3");
                break;
            case R.id.brdavt:
                i.putExtra("imagefilename", "pic4");
                break;
            case R.id.gstavt:
                i.putExtra("imagefilename", "pic5");
                break;
        }
        startActivity(i);
    }
}