package com.example.trabajo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ImageButton miImageButton1 = findViewById(R.id.imagebutton1);
        miImageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), NuevaVentana1Activity.class);
                startActivity(intent);
            }
        });

        ImageButton miImageButton2 = findViewById(R.id.imagebutton2);
        miImageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), NuevaVentana2Activity.class);
                startActivity(intent);
            }
        });

        ImageButton miImageButton3 = findViewById(R.id.imagebutton3);
        miImageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), NuevaVentana3Activity.class);
                startActivity(intent);
            }
        });

        ImageButton miImageButton4 = findViewById(R.id.imagebutton4);
        miImageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), NuevaVentana4Activity.class);
                startActivity(intent);
            }
        });

        ImageButton miImageButton5 = findViewById(R.id.imagebutton5);
        miImageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), NuevaVentana5Activity.class);
                startActivity(intent);
            }
        });

        ImageButton miImageButton6 = findViewById(R.id.Principal);
        miImageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), PrincipalVentana.class);
                startActivity(intent);
            }
        });







    }





}

