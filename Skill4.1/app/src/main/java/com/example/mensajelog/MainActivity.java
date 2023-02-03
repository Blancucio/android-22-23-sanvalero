package com.example.mensajelog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String TAG="Seguimiento";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("info","Valor de informaci'on");
        Log.d("Debug","VAlor de Debug");
        Log.w("Warning","Valor de Warning");
        Log.e("Error","Valor de Error");
        Log.v("Verbose","Valor VErbose");

        Log.i(TAG,"Mensaje de Seguimiento 1");
        Log.i(TAG,"Mensaje de Seguimiento 2");
        Log.i(TAG,"Mensaje de Seguimiento 3");
        Log.i(TAG,"Mensaje de Seguimiento 4");
        Log.i(TAG,"Mensaje de Seguimiento 5");
    }
}