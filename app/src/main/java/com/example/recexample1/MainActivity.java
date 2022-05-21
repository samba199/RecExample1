    package com.example.recexample1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

    public class MainActivity extends AppCompatActivity {
        RecyclerView recyclerView;
        LinearLayoutManager layoutManager;
        List<DataClass>list;
        Adapter adapter;


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            initData();
            initRecyclerview();
    }

        private void initRecyclerview() {
            recyclerView=findViewById(R.id.recyclerview);
            layoutManager=new LinearLayoutManager(this);
            layoutManager.setOrientation(RecyclerView.VERTICAL);
            recyclerView.setLayoutManager(layoutManager);
            adapter=new Adapter(list);
            recyclerView.setAdapter(adapter);
            adapter.notifyDataSetChanged();


        }

        private void initData() {
        list=new ArrayList<>();
        list.add(new DataClass(R.drawable.j,"Samba","Task Manager",R.drawable.vi,R.drawable.msg));
        list.add(new DataClass(R.drawable.b,"Murty","planning asst",R.drawable.vi,R.drawable.msg));
            list.add(new DataClass(R.drawable.a,"Swathi","production manager",R.drawable.vi,R.drawable.msg));
            list.add(new DataClass(R.drawable.b,"Hari","asst Manager",R.drawable.vi,R.drawable.msg));
            list.add(new DataClass(R.drawable.h,"nari","deputy Manager",R.drawable.vi,R.drawable.msg));
            list.add(new DataClass(R.drawable.j,"usha"," HR",R.drawable.vi,R.drawable.msg));
            list.add(new DataClass(R.drawable.a,"sankar","Supervisor",R.drawable.vi,R.drawable.msg));
            list.add(new DataClass(R.drawable.b,"gana","General Manager",R.drawable.vi,R.drawable.msg));
            list.add(new DataClass(R.drawable.h,"vijaya","helper",R.drawable.vi,R.drawable.msg));
            list.add(new DataClass(R.drawable.b,"harsha","store",R.drawable.vi,R.drawable.msg));
            list.add(new DataClass(R.drawable.a,"harsitha","engineer",R.drawable.vi,R.drawable.msg));
        }
    }