package com.example.myapplication2;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.provider.CalendarContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Button btnShowMessage = findViewById(R.id.btnShowMessage);
        Button btnChangeView = findViewById(R.id.btnchange);
        Button btnChangeList = findViewById(R.id.btnShow2);
        Button btnChangeListColor = findViewById(R.id.btnListColor);
        TextView textMessage = findViewById(R.id.tvMessage);

        //btnShowMessage.setOnClickListener(new ShowMessageClickListener()); // Otra clase
//        btnShowMessage.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                Log.i("MAIN_APP","Click en boton");
//                textMessage.setText("Hola clase 2025-1");
//            }
//        }); // extens
        Contador cont = new Contador();
        //Lambda expression
//        btnShowMessage.setOnClickListener(v -> {
//            Log.i("MAIN_APP","Click en boton");
//            //textMessage.setText("Hola clase 2025-1");
//            contador = cont.contadorUp(contador);
//            textMessage.setText(String.valueOf(contador));
//
//
//        });

        btnChangeView.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        });

        btnChangeList.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
            startActivity(intent);
        });

        btnChangeListColor.setOnClickListener(v -> {
                    Intent intent = new Intent(MainActivity.this, ColorsActivity.class);
                    startActivity(intent);
        });

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
    }
}