package com.example.skill21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{

    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    btn1 = (Button) findViewById(R.id.btnClaseAnonima);
    btn2 = (Button) findViewById(R.id.btnImplements);

    btn2.setOnClickListener(this);
    btn1.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick(View view) {
            Toast.makeText(getApplicationContext(),"Desde la Anonima",Toast.LENGTH_LONG).show();
        }
    });
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btnOnClick:
                Toast.makeText(getApplicationContext(),"Desde el On CLick del metodo",Toast.LENGTH_LONG).show();
                break;
            case R.id.btnImplements:
                Toast.makeText(getApplicationContext(),"Desde el On CLick del implements",Toast.LENGTH_LONG).show();
                break;
        }
    }

}
