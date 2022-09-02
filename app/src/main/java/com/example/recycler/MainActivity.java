package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Friend> friendsList = new ArrayList<>();
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_activity_main);
        Friend f0 = new Friend(1,"Laibs", 1980, "Giglgit",R.drawable.ic_launcher_background);
        Friend f1 = new Friend(2,"Mahnoor", 1981, "Lahore",R.drawable.ic_launcher_background);
        Friend f2 = new Friend(3,"libs", 1980, "Quetta",R.drawable.ic_launcher_background);
        Friend f3 = new Friend(4,"kamal",1987,"Peshawar",R.drawable.ic_launcher_background);
        Friend f4 = new Friend(5,"pasha", 1980, "Karachi",R.drawable.ic_launcher_background);
        Friend f5 = new Friend(6,"sb",1987,"Faisalabad ",R.drawable.ic_launcher_background);
        Friend f6 = new Friend(7,"mahnoor", 1980, "Rawalpindi",R.drawable.ic_launcher_background);
        Friend f7 = new Friend(8,"muhammad",1997,"Karachi",R.drawable.ic_launcher_background);
        Friend f8 = new Friend(9,"ali",1980,"Quetta",R.drawable.ic_launcher_background);
        Friend f9 = new Friend(10,"iqra",1982,"Kasur",R.drawable.ic_launcher_background);
        Friend f10 = new Friend(11,"sarwar",1977,"Islamabad",R.drawable.ic_launcher_background);

        friendsList.addAll(Arrays.asList(new Friend[]{f0,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10}));
        recyclerView = findViewById(R.id.recylerViewStudent);


        recyclerView.setHasFixedSize(true);

        //LinearLayoutManager GridLayoutManager
        // layoutManager = new LinearLayoutManager(MainActivity.this);
        layoutManager = new LinearLayoutManager(MainActivity.this,
                LinearLayoutManager.HORIZONTAL,
                true);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new myRecyclerViewAdapter(friendsList) ;
        recyclerView.setAdapter(adapter);
        //adapter.notifyDataSetChanged();
    }
}