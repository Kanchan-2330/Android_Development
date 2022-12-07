package com.example.practical04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText user,pass;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=(EditText)findViewById(R.id.user);
        pass=(EditText)findViewById(R.id.pass);
        b1=(Button)findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String u = user.getText().toString();
                String p = pass.getText().toString();

                if (u.equals("Admin") && p.equals("123")) {
                    Intent i = new Intent(getApplicationContext(), ActivityTwo.class);
                    startActivity(i);
                } else {
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                }
            }
            });

        }
}
