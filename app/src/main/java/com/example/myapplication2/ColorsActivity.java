package com.example.myapplication2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication2.ClassUser.ColorAdapter;
import com.example.myapplication2.ClassUser.ColorItem;


import java.util.ArrayList;
import java.util.List;

public class ColorsActivity extends AppCompatActivity {

    private RecyclerView recyclerColors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_colors);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerColors = findViewById(R.id.recyclerColors);

        List<ColorItem> colorList = new ArrayList<>();
        colorList.add(new ColorItem("Rojo", "#FF0000"));
        colorList.add(new ColorItem("Verde", "#00FF00"));
        colorList.add(new ColorItem("Azul", "#0000FF"));
        colorList.add(new ColorItem("Amarillo", "#FFFF00"));
        colorList.add(new ColorItem("Cian", "#00FFFF"));
        colorList.add(new ColorItem("Magenta", "#FF00FF"));
        colorList.add(new ColorItem("Naranja", "#FFA500"));
        colorList.add(new ColorItem("Morado", "#800080"));
        colorList.add(new ColorItem("Gris", "#808080"));
        colorList.add(new ColorItem("Negro", "#000000"));
        colorList.add(new ColorItem("Blanco", "#FFFFFF"));
        colorList.add(new ColorItem("Oliva", "#808000"));
        colorList.add(new ColorItem("Lima", "#BFFF00"));
        colorList.add(new ColorItem("Turquesa", "#40E0D0"));
        colorList.add(new ColorItem("Rosa", "#FFC0CB"));
        colorList.add(new ColorItem("Marrón", "#8B4513"));
        colorList.add(new ColorItem("Dorado", "#FFD700"));
        colorList.add(new ColorItem("Plateado", "#C0C0C0"));
        colorList.add(new ColorItem("Coral", "#FF7F50"));
        colorList.add(new ColorItem("Lavanda", "#E6E6FA"));

        ColorAdapter adapter = new ColorAdapter(colorList);
        recyclerColors.setLayoutManager(new LinearLayoutManager(this));
        recyclerColors.setAdapter(adapter);
    }
}