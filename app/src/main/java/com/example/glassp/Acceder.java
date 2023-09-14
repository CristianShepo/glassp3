package com.example.glassp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Acceder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceder);
    }

    public void onClickDatos(View view){
        Intent intent = new Intent(this, Datos.class);
        startActivity(intent);
    }

    public void onClickCode(View view){
        Intent intent = new Intent(this, Code.class);
        startActivity(intent);
    }
}
