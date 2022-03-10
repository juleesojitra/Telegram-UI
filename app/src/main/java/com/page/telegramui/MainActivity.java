package com.page.telegramui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageView line,search;
    NavigationView navigationView;
    DrawerLayout drawer;
    RecyclerView recycle;
    ArrayList<chatsModel> dataholder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        line = findViewById(R.id.line);
        search = findViewById(R.id.search);
        navigationView = findViewById(R.id.navigation);
        drawer = findViewById(R.id.drawer);
        recycle = findViewById(R.id.recycle);
        line.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.openDrawer(Gravity.LEFT);
            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        dataholder=new ArrayList<>();

        chatsModel ab1 = new chatsModel("Ketrina","hiii..","Jan 17",R.drawable.ket);
        dataholder.add(ab1);

        chatsModel ab2 = new chatsModel("Disha Patni","hell0 ","Jan 15",R.drawable.disha);
        dataholder.add(ab2);

        chatsModel ab3 = new chatsModel("Sradhaa Kapoor","Hey ","Jan 12",R.drawable.sradha);
        dataholder.add(ab3);

        chatsModel ab4 = new chatsModel("Karina ","hiii ","Jan 09",R.drawable.karina);
        dataholder.add(ab4);

        chatsModel ab5 = new chatsModel("Aaliya Bhatt","what are you doing?","Jan 07",R.drawable.aaliya);
        dataholder.add(ab5);

        chatsModel ab6 = new chatsModel("Sonam Kapoor","where?","Jan 04",R.drawable.sonam);
        dataholder.add(ab6);

        chatsModel ab7 = new chatsModel("Akshay Kumar","when?","jan 01",R.drawable.akshay);
        dataholder.add(ab7);

        chatsModel ab8 = new chatsModel("Himesh Resamiya","Let's","Dec 07",R.drawable.himesh);
        dataholder.add(ab8);

        chatsModel ab9 = new chatsModel("Neha kakker","nothing","Dec 04",R.drawable.neha);
        dataholder.add(ab9);

        chatsModel ab10 = new chatsModel("Milka Shingh","very good ffg","oct 04",R.drawable.milka);
        dataholder.add(ab10);



        recycle.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recycle.setAdapter(new recycleAdepter(MainActivity.this, dataholder));
    }


}
