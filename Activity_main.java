// Aim :- 1. Find the factorial of the given input number.
// 2. Check whether number is even or odd.
// 3. Check whether the number is prime or not.
// 4. Write a program to check leap year.
package com.example.practical3a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText t1;
    Button b1,b2,b3,b4;
    TextView t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (EditText)findViewById(R.id.t1);
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
        b4 = (Button)findViewById(R.id.b4);
        t2 = (TextView)findViewById(R.id.t2);

      b1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              int i;
              int fact =1;
              int n = Integer.parseInt(t1.getText().toString());
              for(i=1;i<=n;i++){
                  fact = fact*i;
              }
              t2.setText("Factorial=" +fact);
          }
      });
     b2.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             int n = Integer.parseInt(t1.getText().toString());
             if(n %2 ==0){
                 t2.setText("Even Number");
             }
             else {
                 t2.setText("Odd Number");
             }
         }
     });
    b3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int n = Integer.parseInt(t1.getText().toString());
            boolean flag = false;
            for (int i = 2; i <= n / 2; ++i) {
                // condition for nonprime number
                if (n % i == 0) {
                    flag = true;
                    break;
                }
            }
            if(!flag){
                t2.setText("Prime Number");
            }
            else{
                t2.setText(" Not a Prime Number");
            }
        }
    });
    b4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int year = Integer.parseInt(t1.getText().toString());
            boolean leap=false;
            if(year%4==0){
                if(year%100==0){
                    if (year % 400 == 0)
                        leap = true;
                    else
                        leap = false;
                }
                else
                    leap = true;
            }
            else
                leap = false;
            if(leap){
                t2.setText(year+" is a leap year ");
            }
            else{
                t2.setText(year+" is not a leap year ");
            }
        }
    });
    }
}
