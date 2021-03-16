package com.example.meraganit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19;
    TextView View;
    EditText ed1;
    double var1,var2;
    boolean Add,Sub,Mul,Div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View=(TextView)findViewById(R.id.view);
        ed1=(EditText)findViewById(R.id.result);
        b1=(Button)findViewById(R.id.c);
        b2=(Button)findViewById(R.id.cut);
        b3=(Button)findViewById(R.id.cut1);
        b4=(Button)findViewById(R.id.div);
        b5=(Button)findViewById(R.id.seven);
        b6=(Button)findViewById(R.id.eight);
        b7=(Button)findViewById(R.id.nine);
        b8=(Button)findViewById(R.id.cross);
        b9=(Button)findViewById(R.id.four);
        b10=(Button)findViewById(R.id.five);
        b11=(Button)findViewById(R.id.six);
        b12=(Button)findViewById(R.id.sub);
        b13=(Button)findViewById(R.id.one);
        b14=(Button)findViewById(R.id.two);
        b15=(Button)findViewById(R.id.three);
        b16=(Button)findViewById(R.id.plus);
        b17=(Button)findViewById(R.id.zero);
        b18=(Button)findViewById(R.id.point);
        b19=(Button)findViewById(R.id.equal);


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                //Toast.makeText(MainActivity.this, "aapne cut ka batan dabaya hai", Toast.LENGTH_SHORT).show();
                ed1.setText(ed1.getText()+"7");

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                //Toast.makeText(MainActivity.this, "aapne cut ka batan dabaya hai", Toast.LENGTH_SHORT).show();
                ed1.setText(ed1.getText()+"8");

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                //Toast.makeText(MainActivity.this, "aapne cut ka batan dabaya hai", Toast.LENGTH_SHORT).show();
                ed1.setText(ed1.getText()+"9");


            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                //Toast.makeText(MainActivity.this, "aapne cut ka batan dabaya hai", Toast.LENGTH_SHORT).show();
                ed1.setText( ed1.getText()+"4");

            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                //Toast.makeText(MainActivity.this, "aapne cut ka batan dabaya hai", Toast.LENGTH_SHORT).show();
                ed1.setText( ed1.getText()+"5");

            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                //Toast.makeText(MainActivity.this, "aapne cut ka batan dabaya hai", Toast.LENGTH_SHORT).show();
                ed1.setText( ed1.getText()+"6");

            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                //Toast.makeText(MainActivity.this, "aapne cut ka batan dabaya hai", Toast.LENGTH_SHORT).show();
                ed1.setText( ed1.getText()+"1");

            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                //Toast.makeText(MainActivity.this, "aapne cut ka batan dabaya hai", Toast.LENGTH_SHORT).show();
                ed1.setText( ed1.getText()+"2");

            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                //Toast.makeText(MainActivity.this, "aapne cut ka batan dabaya hai", Toast.LENGTH_SHORT).show();
                ed1.setText( ed1.getText()+"3");

            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                //Toast.makeText(MainActivity.this, "aapne cut ka batan dabaya hai", Toast.LENGTH_SHORT).show();
                ed1.setText( ed1.getText()+"0");

            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                //Toast.makeText(MainActivity.this, "aapne cut ka batan dabaya hai", Toast.LENGTH_SHORT).show();
                ed1.setText( ed1.getText()+".");

            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                if(ed1==null){
                    ed1.setText("");
                }
                else
                {
                    var1=Double.parseDouble(ed1.getText()+"");
                    Add=true;
                    ed1.setText(null);
                }
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                if(ed1==null){
                    ed1.setText("");
                }
                else
                {
                    var1=Double.parseDouble(ed1.getText()+"");
                    Sub=true;
                    ed1.setText(null);
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                if(ed1==null){
                    ed1.setText("");
                }
                else
                {
                    var1=Double.parseDouble(ed1.getText()+"");
                    Mul=true;
                    ed1.setText(null);
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                if(ed1==null){
                    ed1.setText("");
                }
                else
                {
                    var1=Double.parseDouble(ed1.getText()+"");
                    Div=true;
                    ed1.setText(null);
                }
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
               var2=Double.parseDouble(ed1.getText()+"");
               if(Add==true){
                   ed1.setText( var1 + var2 + "");
                   Add=false;
               }
                if(Sub==true) {
                    ed1.setText(var1 - var2 + "");
                    Sub = false;
                }
                if(Mul==true) {
                    ed1.setText(var1 * var2 + "");
                    Mul = false;
                }
                if(Div==true) {
                    ed1.setText(var1 / var2 + "");
                    Div = false;
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                ed1.setText("");
            }
        });












    }
}