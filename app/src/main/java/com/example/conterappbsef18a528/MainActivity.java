package com.example.conterappbsef18a528;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnInc1,btnInc2,btnInc3,btnDec1,btnDec2,btnDec3;
    EditText editText2,editText3,editText4;
    int var1=0,var2=0,var3=0;
    int navvar=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInc1=(Button)findViewById(R.id.btnInc1);
        btnInc2=(Button)findViewById(R.id.btnInc2);
        btnInc3=(Button)findViewById(R.id.btnInc3);
        btnDec1=(Button)findViewById(R.id.btnDec1);
        btnDec2=(Button)findViewById(R.id.btnDec2);
        btnDec3=(Button)findViewById(R.id.btnDec3);


        editText2=(EditText)findViewById(R.id.editText2);
        editText3=(EditText)findViewById(R.id.editText3);
        editText4=(EditText)findViewById(R.id.editText4);

        btnInc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1++;
                editText2.setText(var1+"");


            }

        });
        btnInc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2++;
                editText3.setText(var2+"");
            }
        });
        btnInc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var3++;
                editText4.setText(var3+"");
            }
        });
        btnDec1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(var1>0) {
                    var1--;
                    editText2.setText(var1 + "");
                }
            }
        });btnDec2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(var2>0) {
                    var2--;
                    editText3.setText(var2 + "");
                }
            }
        });btnDec3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(var3>0){
                    var3--;
                    editText4.setText(var3+"");
                }

            }
        });


    }
}