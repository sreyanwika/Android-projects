package com.example.studentdetails;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/** @noinspection ALL*/
public class MainActivity extends AppCompatActivity {
    ListView stulst;
    String nmes[]={"ayana","annie","barun","biyush","barfi","catherine","ciya","ankith","anil","arun","riya","caty","siya"};
    String selecname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stulst=findViewById(R.id.stdntlst);
        ArrayAdapter ad=new ArrayAdapter(this, android.R.layout.simple_list_item_1,nmes);
        stulst.setAdapter(ad);
        stulst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                selecname=adapterView.getItemAtPosition(i).toString();
                Details frag=(Details)getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView);
                frag.display(i);
            }
        });
    }
}