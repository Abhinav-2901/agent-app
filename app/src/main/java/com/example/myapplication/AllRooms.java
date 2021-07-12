package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class AllRooms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_rooms);

        ListView myListView = findViewById(R.id.myListView);
        ArrayList<String> rooms = new ArrayList<>();
        rooms.add("Room 1");
        rooms.add("Room 2");
        rooms.add("Room 3");
        rooms.add("Room 4");
        rooms.add("Room 5");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, rooms);
        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(AllRooms.this, Room.class);
                String send = ((TextView) view).getText().toString();
                intent.putExtra("roomName",send );
                startActivity(intent);

            }
        });

    }
}