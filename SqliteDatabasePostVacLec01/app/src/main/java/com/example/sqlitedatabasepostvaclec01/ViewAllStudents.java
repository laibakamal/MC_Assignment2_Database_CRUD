package com.example.sqlitedatabasepostvaclec01;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ViewAllStudents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_students);

        ListView StudentsList = findViewById(R.id.listView);
        DBHelper dbHelper  = new DBHelper(ViewAllStudents.this);

        ArrayList<StudentModel> list =dbHelper.getAllStudents();
       // Log.d("name", String.valueOf(list.get(0)));
        StudentListAdapter arrayAdapter = new StudentListAdapter (this,list);


        StudentsList.setAdapter(arrayAdapter);

        StudentsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                DBHelper dbHelper = new DBHelper(ViewAllStudents.this);
                StudentModel s= (StudentModel) adapterView.getItemAtPosition(i);
            }
        });
    }
}