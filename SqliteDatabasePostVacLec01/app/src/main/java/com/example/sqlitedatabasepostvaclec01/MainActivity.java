package com.example.sqlitedatabasepostvaclec01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button buttonAdd, buttonViewAll, buttonUpdate, buttonDelete;
    EditText editName, editRollNumber;
    Switch switchIsActive;
    ListView listViewStudent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAdd = findViewById(R.id.buttonAdd);
        buttonViewAll = findViewById(R.id.buttonViewAll);
        buttonUpdate= findViewById(R.id.buttonUpdate);
        buttonDelete=findViewById(R.id.buttonDelete);


        editName = findViewById(R.id.editTextName);
        editRollNumber = findViewById(R.id.editTextRollNumber);
        switchIsActive = findViewById(R.id.switchStudent);
        listViewStudent = findViewById(R.id.listViewStudent);



        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this,AddStudent.class);
                startActivity(intent1);
            }});




        buttonViewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(MainActivity.this,ViewAllStudents.class);
                startActivity(intent2);
            }});



        buttonUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(MainActivity.this,UpdateStudent.class);
                startActivity(intent3);
            }});



        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4=new Intent(MainActivity.this,DeleteStudent.class);
                startActivity(intent4);
            }});



//        buttonAdd.setOnClickListener(new View.OnClickListener() {
//            StudentModel studentModel;
//
//            @Override
//            public void onClick(View v) {
//                try {
//                    Intent i = new Intent(MainActivity.this,AddStudent.class);
//                    startActivity(i);
//                    //studentModel = new StudentModel(editName.getText().toString(), Integer.parseInt(editRollNumber.getText().toString()), switchIsActive.isChecked());
//                    //Toast.makeText(MainActivity.this, studentModel.toString(), Toast.LENGTH_SHORT).show();
//                }
//                catch (Exception e){
//                    //Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
//                }
//                //DBHelper dbHelper  = new DBHelper(MainActivity.this);
//                //dbHelper.addStudent(studentModel);
//            }
//        });

//        buttonViewAll.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                DBHelper dbHelper = new DBHelper(MainActivity.this);
//                List<StudentModel> list = dbHelper.getAllStudents();
//                ArrayAdapter arrayAdapter = new ArrayAdapter<StudentModel>
//                        (MainActivity.this, android.R.layout.simple_list_item_1,list);
//                listViewStudent.setAdapter(arrayAdapter);
//
//            }
//        });

    }
}



