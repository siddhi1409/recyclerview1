package com.example.recyclerview1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MainAdapter mainAdapter;

    ArrayList<MainModel> mainModels;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        Integer[] pics = {R.drawable.pic1,R.drawable.pic2,R.drawable.pic12,
                R.drawable.pic6, R.drawable.pic7, R.drawable.pic8,
                R.drawable.pic9, R.drawable.pic10, R.drawable.pic14, R.drawable.pic15};

        String[] name = {"pic1","pic2","pic3","pic4","pic5","pic6","pic7","pic8", "pic9", "pic10"};

        mainModels = new ArrayList<>();
        for(int i=0;i<pics.length;i++){
            MainModel model = new MainModel(pics[i], name[i]);
            mainModels.add(model);
        }


        LinearLayoutManager layoutManager = new LinearLayoutManager(
          MainActivity.this,LinearLayoutManager.HORIZONTAL, false
        );
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        mainAdapter = new MainAdapter(MainActivity.this , mainModels);
        recyclerView.setAdapter(mainAdapter);



    }
}