package com.example.exemplolista;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.exemplolista.model.ListItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private List<ListItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView. setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();
        for(int i = 0; i <=50; i++){
            ListItem listItem = new ListItem(
                    "heading" +(i+1),
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
            );
            listItems.add(listItem);
        }

        adapter = new MyAdapter(listItems, this);
        recyclerView.setAdapter(adapter);
    }

}
