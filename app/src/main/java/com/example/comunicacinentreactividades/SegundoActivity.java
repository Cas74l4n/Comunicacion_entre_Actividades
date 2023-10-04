package com.example.comunicacinentreactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class SegundoActivity extends AppCompatActivity {
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        tv1 =(TextView) findViewById(R.id.tv1);

        String  dato = getIntent().getStringExtra("dato");
        tv1.setText(dato);
    }
    public void Regresar(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

}