package com.example.recyclerview_java;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<CentextModel> arrData = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrData.add(new CentextModel(R.drawable.a,"A","1234"));
        arrData.add(new CentextModel(R.drawable.b,"B","1234"));
        arrData.add(new CentextModel(R.drawable.c,"C","1234"));
        arrData.add(new CentextModel(R.drawable.d,"D","1234"));
        arrData.add(new CentextModel(R.drawable.e,"E","1234"));
        arrData.add(new CentextModel(R.drawable.a,"A","1234"));
        arrData.add(new CentextModel(R.drawable.b,"B","1234"));
        arrData.add(new CentextModel(R.drawable.c,"C","1234"));
        arrData.add(new CentextModel(R.drawable.d,"D","1234"));
        arrData.add(new CentextModel(R.drawable.e,"E","1234"));
        arrData.add(new CentextModel(R.drawable.a,"A","1234"));
        arrData.add(new CentextModel(R.drawable.b,"B","1234"));
        arrData.add(new CentextModel(R.drawable.c,"C","1234"));
        arrData.add(new CentextModel(R.drawable.d,"D","1234"));
        arrData.add(new CentextModel(R.drawable.e,"E","1234"));
        arrData.add(new CentextModel(R.drawable.a,"A","1234"));
        arrData.add(new CentextModel(R.drawable.b,"B","1234"));
        arrData.add(new CentextModel(R.drawable.c,"C","1234"));
        arrData.add(new CentextModel(R.drawable.d,"D","1234"));
        arrData.add(new CentextModel(R.drawable.e,"E","1234"));

        RecyclerContactView adapter = new RecyclerContactView(this,arrData);
        recyclerView.setAdapter(adapter);
    }
}