package com.example.companyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Add extends AppCompatActivity {

    EditText et1,et2,et3,et4,et5;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);

        et1=(EditText) findViewById(R.id.empid);
        et2=(EditText) findViewById(R.id.empname);
        et3=(EditText) findViewById(R.id.desg);
        et4=(EditText) findViewById(R.id.emailid);
        et5=(EditText) findViewById(R.id.salary);

        b1=(Button) findViewById(R.id.submit);
        b2=(Button) findViewById(R.id.back);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(getApplicationContext(), Menu.class);
                startActivity(ob);
            }
        });



    }
}