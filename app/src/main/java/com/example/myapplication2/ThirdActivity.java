package com.example.myapplication2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication2.adapters.BasicAdapter;
import com.example.myapplication2.adapters.PersonItem;

import java.util.ArrayList;
import java.util.List;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_third);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

//        List<String> data = new ArrayList<>();
//        data.add("Dato 1");
//        data.add("Dato 2");
//        data.add("Dato 3");
//        data.add("Dato 4");
//        data.add("Dato 5");
        List<PersonItem> data = new ArrayList<>();
        data.add(new PersonItem("Carlos", "123456"));
        data.add(new PersonItem("Andrea", "789012"));
        data.add(new PersonItem("Lucía", "345678"));
        data.add(new PersonItem("Pedro", "901234"));
        data.add(new PersonItem("Diana", "567890"));


        RecyclerView rvBasic = findViewById(R.id.rvBasic);
        rvBasic.setLayoutManager(new LinearLayoutManager(this));
        BasicAdapter adapter = new BasicAdapter(data);
        rvBasic.setAdapter(adapter);
    }
}