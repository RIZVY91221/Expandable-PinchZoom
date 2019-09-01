package com.example.expandable_pinchzoom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        List<ParentData> list = getList();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyAdapter myAdapter = new MyAdapter(MainActivity.this,list);
        recyclerView.setAdapter(myAdapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(myAdapter);

    }
    private List<ParentData> getList() {

        List<ParentData> list_parent =new ArrayList<>();
        List<ChildData> list_data_child = new ArrayList<>();

        list_data_child.add(new ChildData("First"));
        list_data_child.add(new ChildData("Second"));
        list_data_child.add(new ChildData("Third"));
        list_data_child.add(new ChildData("Four"));

        list_parent.add(new ParentData("Parent 1",list_data_child));
        list_parent.add(new ParentData("Parent 2",list_data_child));
        list_parent.add(new ParentData("Parent 3",list_data_child));
        list_parent.add(new ParentData("Parent 4",list_data_child));

        return list_parent;
    }
}
