package com.example.skill5_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<PersonajeVO> listaPersonajes;
    RecyclerView recyclerPersonajes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaPersonajes = new ArrayList<>();
        recyclerPersonajes = (RecyclerView) findViewById(R.id.RecyclerId);
        recyclerPersonajes.setLayoutManager(new LinearLayoutManager(this));

        llenarPersonajes();

        AdaptadorPersonajes adapter = new AdaptadorPersonajes((listaPersonajes));
        recyclerPersonajes.setAdapter(adapter);
    }

    private void llenarPersonajes(){
        listaPersonajes.add(new PersonajeVO("Krusty","Krusty",R.drawable.krusti));
        listaPersonajes.add(new PersonajeVO("Homero","Homero",R.drawable.homero));
        listaPersonajes.add(new PersonajeVO("Marge","Marge",R.drawable.marge));
        listaPersonajes.add(new PersonajeVO("Bart","Bart",R.drawable.bart));
        listaPersonajes.add(new PersonajeVO("Lisa","Lisa",R.drawable.lisa));
        listaPersonajes.add(new PersonajeVO("Magie","Magie",R.drawable.magie));
        listaPersonajes.add(new PersonajeVO("Flanders","Flanders",R.drawable.flanders));
        listaPersonajes.add(new PersonajeVO("Milhouse","Milhouse",R.drawable.milhouse));
        listaPersonajes.add(new PersonajeVO("Mr. Burns","Mr. Burns",R.drawable.burns));
    }
}