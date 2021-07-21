package com.example.reservacanchas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityMisReservas extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mis_reservas);

        listView = (ListView)findViewById(R.id.listaCanchas);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Cancha 1");
        arrayList.add("Cancha 2");
        arrayList.add("Cancha 3");
        arrayList.add("Cancha 4");
        arrayList.add("Cancha 5");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);
    }
}