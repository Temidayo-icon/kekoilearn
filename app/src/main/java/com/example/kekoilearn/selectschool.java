package com.example.kekoilearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class selectschool extends AppCompatActivity {
    EditText etnoys;
    MaterialButton enter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectschool);

        etnoys =(EditText) findViewById(R.id.etnoys);
        enter =(MaterialButton) findViewById(R.id.enterbtn);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etnoys.getText().toString().equals("admin")){
                    Intent intentchoose =new Intent(selectschool.this,choosepage.class);
                    startActivity(intentchoose);
                }
                else if (etnoys.getText().toString().isEmpty()){
                    Toast. makeText(getApplicationContext(), "Enter the name of Registere school", Toast. LENGTH_LONG).show();
                }
                else {
                    Toast. makeText(getApplicationContext(), "School not registered!", Toast. LENGTH_LONG).show();
                }
            }
        });

    }
}