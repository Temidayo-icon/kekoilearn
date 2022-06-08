package com.example.kekoilearn;



import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.android.material.button.MaterialButton;
import com.parse.ParseObject;

public class loginstd extends AppCompatActivity {

    EditText username;
    EditText password;
    MaterialButton loginbtn;
    ImageView sltbgd;
    Bitmap mImage1;
    Bitmap mImage2;
    Bitmap mImage3;
    Bitmap mImage4;
    Bitmap mImage5;
    Bitmap mImage6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginstd);

        ParseObject firstObject = new  ParseObject("FirstClass");
        firstObject.put("message","Hey ! First message from android. Parse is now connected");
        firstObject.saveInBackground(e -> {
            if (e != null){
                Log.e("MainActivity", e.getLocalizedMessage());
            }else{
                Log.d("MainActivity","Object saved.");
            }
        });


        username = (EditText)  findViewById(R.id.username);
        password =(EditText)  findViewById(R.id.password);
        loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        Bundle bundle = getIntent().getExtras();
        String imageName = bundle.getString("imagefilename");

        ImageView imageView = (ImageView)findViewById(R.id.sltbgd);

        mImage1 = BitmapFactory.decodeResource(getResources(), R.drawable.stdavt);
        mImage2 = BitmapFactory.decodeResource(getResources(), R.drawable.tchavt);
        mImage3 = BitmapFactory.decodeResource(getResources(), R.drawable.prtavt);
        mImage4 = BitmapFactory.decodeResource(getResources(), R.drawable.brdavt);
        mImage5 = BitmapFactory.decodeResource(getResources(), R.drawable.adminavt);

        if(imageName.matches("pic1")) {
            imageView.setImageBitmap(mImage1);
        }
        else if (imageName.matches("pic2")) {
            imageView.setImageBitmap(mImage2);
        }
        else if(imageName.matches("pic3")) {
            imageView.setImageBitmap(mImage3);
        }
        else if(imageName.matches("pic4")) {
            imageView.setImageBitmap(mImage4);
        }
        else {
            imageView.setImageBitmap(mImage5);
        }

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             if(!username.getText().toString().isEmpty() && password.getText().toString().isEmpty())   {

             }
            }
        });



    }
}