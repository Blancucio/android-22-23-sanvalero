package com.example.mvc_netflix_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mvc_netflix_1.controller.StudentController;
import com.example.mvc_netflix_1.model.StudentWS;
import com.example.mvc_netflix_1.model.pojo.Student;

public class MainActivity extends AppCompatActivity {
    private StudentController controller;
    private MainActivity view;
    private StudentWS model;

    private EditText email;
    private EditText password;
    private Button btn1;


    public void buttonPress(View view){
        Log.i("Info", "Botón presionado");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CARGAR VIEW
        view = this;
        //CARGAR MODEL
        //MODEL + VIEW
        controller = new StudentController(model,view);
        //CASO DE USO -> OBTENER
        controller.getStudent();
        verEnviar();

    }

    public void verEnviar(){
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        btn1 = (Button) findViewById(R.id.btn1);

        printStudentDetailsOnScreen(model.getStudent());

    }


    public void printStudentDetails(Student student){
        Log.d("MainActivity - NAME", student.getName());
        Log.d("MainActivity - SURNAME", student.getSurname());
    }
    public void printStudentDetailsOnScreen(Student student){
        email.setText(student.getName());
        password.setText(student.getSurname());
        Toast.makeText(view.getInstance(),
                "Usuario y Password correctas...",
                Toast.LENGTH_SHORT).show();
    }

    private Context getInstance() {
        if(view == null){
            return new MainActivity();
        }else{
            return view;
        }
    }
}