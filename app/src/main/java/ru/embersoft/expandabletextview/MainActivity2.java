package ru.embersoft.expandabletextview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    private ArrayList<Item> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new Adapter(items,this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //i am prepare strings for this project
        items.add(new Item(R.drawable.applescab,getString(R.string.disease1),getString(R.string.desc11)));
        items.add(new Item(R.drawable.blackrot,getString(R.string.disease2),getString(R.string.desc21)));
        items.add(new Item(R.drawable.applerust,getString(R.string.disease3),getString(R.string.desc31)));
        items.add(new Item(R.drawable.flyspeck,getString(R.string.disease4),getString(R.string.desc11)));
        items.add(new Item(R.drawable.mildew,getString(R.string.disease5),getString(R.string.desc11)));
        items.add(new Item(R.drawable.blight,getString(R.string.disease5),getString(R.string.desc11)));
        items.add(new Item(R.drawable.rootrot,getString(R.string.disease5),getString(R.string.desc11)));
        items.add(new Item(R.drawable.aphids,getString(R.string.disease5),getString(R.string.desc11)));
        items.add(new Item(R.drawable.maggot,getString(R.string.disease5),getString(R.string.desc11)));
    }
}