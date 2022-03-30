package com.example.activis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //metodo boton
    public void siguiente(View view){
        Intent siguiente = new Intent(this, SegundoActivity.class);
        startActivity(siguiente);
    }
}
